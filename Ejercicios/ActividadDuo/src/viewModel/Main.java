package viewModel;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> line = new ArrayList<>(){{
            add("Public ");
            add("static ");
            add("void ");
            add("main ");
            add("( ");
            add("String[] ");
            add("args ");
            add(") ");
            add("{}");
        }};
        
        ActividadStrings a = new ActividadStrings(line);
        ControladorActividad c = new ControladorActividad(a);
    }
}
