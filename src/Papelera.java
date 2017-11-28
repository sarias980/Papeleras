import java.io.Serializable;

/**
 * Created by Sergi on 21/11/2017.
 */
public class Papelera implements Serializable {
    int id;
    double latitud;
    double longitud;
    int capacidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Papelera(double latitud, double longitud, int capacidad) {

        this.latitud = latitud;
        this.longitud = longitud;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Papelera{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", capacidad=" + capacidad +
                '}';
    }
}