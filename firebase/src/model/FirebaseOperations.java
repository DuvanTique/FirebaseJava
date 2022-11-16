package model;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import viewModel.Moto;

/**
 *
 * @author Duvan
 */
public class FirebaseOperations {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference itemReference;

    public FirebaseOperations() {
        initFirebase();
        DatabaseReference databaseReference = firebaseDatabase.getReference("/");
        this.itemReference = databaseReference.child("items");
    }

    private void initFirebase() {
        try {

            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://prueba-java-a76c8-default-rtdb.firebaseio.com") // 
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\firebase\\clavefirebase.json")))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            this.firebaseDatabase = FirebaseDatabase.getInstance();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void saveFirebase(HashMap<String,Moto> motos) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            itemReference.setValue(motos, new DatabaseReference.CompletionListener() {

                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
                    System.out.println("Registro guardado!");
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
    }
     
    public void updateFirebase(String id,String atributo,Object newAtributo) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        DatabaseReference motoReference = itemReference.child(id);
        Map<String, Object> updates = new HashMap<>();
        updates.put(atributo,newAtributo);
        motoReference.updateChildren(updates, new DatabaseReference.CompletionListener() {

            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                System.out.println("Registro Actualizado!");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteItemFirebase(String id) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        DatabaseReference motoReference = itemReference.child(id);
        motoReference.setValue(null, new DatabaseReference.CompletionListener() {

            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                System.out.println("Registro borrado!");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void SelectItemFirebase(String id) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        DatabaseReference motoReference = itemReference.child(id);
        motoReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Moto moto = dataSnapshot.getValue(Moto.class);
                System.out.println(moto);
                countDownLatch.countDown();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void SelectAllItemFirebase() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        itemReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println(dataSnapshot.getValue());
                countDownLatch.countDown();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
