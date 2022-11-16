package viewModel;

import java.util.HashMap;
import model.FirebaseOperations;
import viewModel.Moto;



public class Main {
    
    public static void main(String[] args) {
        HashMap<String,Moto> motos = new HashMap<>();
        motos.put("1", new Moto("Yamaha", 1500));
        motos.put("2", new Moto("Bmw", 3500));
        motos.put("3", new Moto("Honda", 1200));
        motos.put("4", new Moto("Ducatti", 3500));
        FirebaseOperations firebase = new FirebaseOperations();
        //firebase.saveFirebase(motos);
        //firebase.updateFirebase("1","precio",200);
        //firebase.deleteItemFirebase("1");
        //firebase.SelectItemFirebase("2");
        firebase.SelectAllItemFirebase();
    }
}