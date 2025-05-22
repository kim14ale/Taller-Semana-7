import javax.swing.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Avengers {
    Set<Heroe> lista;

    public Avengers() {
        lista = new LinkedHashSet<>();
    }
    public void agregardatos (Heroe h){
        if (lista.contains(h)){
            JOptionPane.showMessageDialog(null,"Este heroe ya esta registrado");
        }else {lista.add(h);}

    }
    public void modificardatos (int id, String nombre, String mision, int peligrosidad, double pago ){
        for (Heroe e: lista){
            if (e.getId()==id){
                Heroe heroe=e;
                lista.remove(heroe);
                heroe.setNombre(nombre);
                heroe.setMision(mision);
                heroe.setPeligrosidad(peligrosidad);
                heroe.setPago(pago);
                lista.add(heroe);
            }
        }
    }
    public String imprimir (){
        StringBuilder sb = new StringBuilder();
        for (Heroe h: lista){
            sb.append(h.toString()).append("\n\n");
        }
        return sb.toString();
    }
    public String generarInformePorId(int id) {
        for (Heroe h : lista) {
            if (h.getId() == id) {
                String nombre = h.getNombre();
                double pagoMensual = h.getPago();
                double aporte = pagoMensual * 0.08;
                double pagoAnual = pagoMensual * 12;
                double impuesto;


                if (pagoAnual <= 50000) {
                    impuesto = 0;
                } else if (pagoAnual <= 100000) {
                    impuesto = (pagoAnual - 50000) * 0.10;
                } else if (pagoAnual <= 200000) {
                    impuesto = (50000 * 0.10) + (pagoAnual - 100000) * 0.20;
                } else {
                    impuesto = (50000 * 0.10) + (100000 * 0.20) + (pagoAnual - 200000) * 0.30;
                }

                double pagoNetoMensual = pagoMensual - aporte - (impuesto / 12);

                StringBuilder sb = new StringBuilder();
                sb.append("Nombre del Avenger: ").append(nombre).append("\n");
                sb.append("Pago mensual: ").append(String.format("%.2f", pagoMensual)).append("\n");
                sb.append("Aporte al Fondo de Héroes: ").append(String.format("%.2f", aporte)).append("\n");
                sb.append("Impuesto del gobierno (mensual): ").append(String.format("%.2f", impuesto / 12)).append("\n");
                sb.append("Pago neto a recibir: ").append(String.format("%.2f", pagoNetoMensual)).append("\n");

                return sb.toString();
            }
        }
        return "No se encontró un Avenger con el ID: " + id;
    }


}
