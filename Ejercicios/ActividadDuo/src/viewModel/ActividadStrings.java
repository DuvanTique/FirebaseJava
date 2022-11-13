package viewModel;

import java.util.ArrayList;
/**
 *
 * @author Duvan
 */
public class ActividadStrings {
    
    private String enunciado;
    private ArrayList<String> respuesta;
    private ArrayList<String> entrada;

    public ActividadStrings(ArrayList<String> palabras) {
        this.respuesta = palabras;
        this.entrada = new ArrayList<>();
    }
    
    public boolean verificarOrden(){
        return this.entrada.equals(this.respuesta);
    }
    
    public void agregarPalabra(String palabra){
        this.entrada.add(palabra);
    }
    
    public void eliminarPalabra(String palabra){
        this.entrada.remove(palabra);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<String> getRespuesta() {
        return respuesta;
    }
    
    
}