import java.util.Objects;

public class Heroe {
    private int id;
    private String nombre;
    private String Mision;
    private int peligrosidad;
    private double pago;
    private double aporte;
    private double impuestos;

    public Heroe(int id, String nombre, String mision, int peligrosidad, double pago) {
        this.id = id;
        this.nombre = nombre;
        Mision = mision;
        this.peligrosidad = peligrosidad;
        this.pago = pago;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return Mision;
    }

    public void setMision(String mision) {
        Mision = mision;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getAporte() {
        return aporte;
    }

    public void setAporte(double aporte) {
        this.aporte = aporte;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "Heroe " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Mision='" + Mision + '\'' +
                ", peligrosidad=" + peligrosidad +
                ", pago=" + pago +
                ", aporte=" + aporte +
                ", impuestos=" + impuestos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return id == ((Heroe)o).getId();
    }

    @Override
    public int hashCode() {
        int resultado = id*101;
        return resultado;
    }
}
