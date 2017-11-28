import java.io.*;

/**
 * Created by Sergi on 21/11/2017.
 */
public class PapeleraDAO {


    public void crear(Papelera papelera) throws IOException {

        int id = buscarDir();
        FileOutputStream f = null;
        ObjectOutputStream o = null;
        papelera.setId(id);
        try {

            f = new FileOutputStream(new File("papeleras" + "\\" + id + ".dat"));
            o = new ObjectOutputStream(f);

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        o.writeObject(papelera);

        o.close();
        f.close();
    }

    public void buscar(String id) throws IOException {
        FileInputStream f = null;
        ObjectInputStream o = null;
        Papelera papelera = null;
        try {
            f = new FileInputStream(new File("papeleras\\" + id + ".dat"));
            o = new ObjectInputStream(f);
            boolean cont = true;
            papelera = (Papelera) o.readObject();

            if (papelera != null) {
                if (id.equals(Integer.toString(papelera.getId()))) {
                    f.close();
                    System.out.println(papelera.toString());
                }
            }

        } catch (EOFException e) {
            System.out.println("No trobat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (f != null)
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    private int buscarDir() {
        File dir = new File("papeleras");

        if (dir.isDirectory() && dir.exists()) {
            File[] ficheros = dir.listFiles();
            return ficheros.length + 1;
        } else {
            dir.mkdir();
            return 1;
        }
    }

}
