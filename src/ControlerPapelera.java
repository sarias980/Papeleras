import java.io.IOException;

/**
 * Created by Sergi on 21/11/2017.
 */
public class ControlerPapelera {
    PapeleraDAO pd = new PapeleraDAO();

    public void crear(Papelera papelera){
        try {
            pd.crear(papelera);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void buscar(String id) {
        try {
            pd.buscar(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
