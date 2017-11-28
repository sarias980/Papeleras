/**
 * Created by Sergi on 21/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        ControlerPapelera cp = new ControlerPapelera();

        switch (args[0]){
            case "papelera":
                switch (args[1]){
                    case "crear":
                        Papelera papelera = new Papelera(Double.parseDouble(args[2]),Double.parseDouble(args[3]), Integer.parseInt(args[4]));
                        cp.crear(papelera);
                        break;

                    case "buscar":
                        cp.buscar(args[2]);
                        break;
                }
                break;
        }
    }
}
