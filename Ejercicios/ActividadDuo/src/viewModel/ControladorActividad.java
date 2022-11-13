package viewModel;

import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JButton;
import view.VistaActividades;

/**
 *
 * @author Duvan
 */
public class ControladorActividad implements ActionListener{
    
    /*clases que controla*/
    private ActividadStrings actividad;
    private VistaActividades vista;
    
    /*Atributos de los botones */
    private ArrayList<JButton> botones;
    private ArrayList<Integer> listaNumerosAleatoria;
    private int numBotonesPosicion2 = 0;
    private final int xPosition = 100;
    private final int yPosition1 = 200;
    private final int yPosition2 = 100;
    private final int ButtomSpace = 10;
    private final int anchoBoton = 90;
    private final int alturaBoton = 30;

    public ControladorActividad(ActividadStrings actividad) {
        this.botones = new ArrayList<>();
        this.actividad = actividad;
        this.vista = new VistaActividades();
        CrearlistaNumeros();
        crearBotones();
        escucharBotones();
        agregarBotones();     
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    private void crearBotones(){
        ArrayList<String> palabras = actividad.getRespuesta();
        for (String palabra : palabras) {
            botones.add(new JButton(palabra));
        }
    }
    
    private void escucharBotones(){
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            next.addActionListener(this);
        }
        vista.jButtonCheck.addActionListener(this);
    }
    
    private void agregarBotones(){
        int i = 0;
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            next.setFont(new Font("MONOSPACED",PLAIN,10));
            next.setBounds((xPosition+anchoBoton * this.listaNumerosAleatoria.get(i)+ ButtomSpace)-anchoBoton,
                    yPosition1,anchoBoton,alturaBoton);
            vista.jPanel1.add(next);
            i++;
        }
    }
    
    private void cambiarPosicionBotonY(JButton b){
        if(b.getY()== yPosition1){
            b.setLocation(xPosition+anchoBoton * numBotonesPosicion2, yPosition2);
            b.setActionCommand(""+numBotonesPosicion2);
            this.numBotonesPosicion2 +=1;
            ordenarBotones();
            actividad.agregarPalabra(b.getText());
        }
        else if(b.getY() == yPosition2){
            b.setLocation(xPosition+anchoBoton *listaNumerosAleatoria.get(botones.indexOf(b)), yPosition1);
            this.numBotonesPosicion2 -=1;
            actividad.eliminarPalabra(b.getText());
        }
    }
    
    private void ordenarBotones(){        
        for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
            JButton next = iterator.next();
            if(next.getY() == yPosition2){
                int posicion = Integer.parseInt(next.getActionCommand());
                if(posicion > numBotonesPosicion2){
                    next.setLocation(xPosition+anchoBoton * posicion -1, yPosition2);
                }
                else{
                    next.setLocation(xPosition+anchoBoton * posicion, yPosition2);                    
                }
            }
        }
    }
    
    private void CrearlistaNumeros(){
        int cantidadPalabras = actividad.getRespuesta().size();
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(cantidadPalabras);
        //Crea una lista de numeros aleatorios inicial
        for (int i = 1; i < cantidadPalabras; i++) {
           if(r.nextInt(2)==1){
               numbers.add(i);
           }
        }
        //completa la lista para que salgan todos los numeros
        for (int i = 0; i < cantidadPalabras; i++) {
            if(!numbers.contains(i)){
                numbers.add(i);
            }
        }
        this.listaNumerosAleatoria = numbers;
        System.out.println(listaNumerosAleatoria);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jButtonCheck){
            vista.jTextFieldRespuesta.setText("Respuesta:" + actividad.verificarOrden());
        }
        else{
            for (Iterator<JButton> iterator = botones.iterator(); iterator.hasNext();) {
                JButton next = iterator.next();
                if (e.getSource() == next) {
                    cambiarPosicionBotonY(next);
                }
            }
        }
    }
    
}
