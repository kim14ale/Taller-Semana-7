import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Principal;
    private JTextField textid;
    private JTextField textNombre;
    private JTextField textMision;
    private JTextField textPago;
    private JComboBox cboPeligrosidad;
    private JButton btnAgregar;
    private JButton btnEditar;
    private JButton BtnListar;
    private JTextField textAportes;
    private JButton BtnAportes;
    private JTextArea textInfo;
    private Avengers ave = new Avengers();

    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id= Integer.parseInt(textid.getText().toString());
                String nombre= textNombre.getText().toString();
                String Mision=textMision.getText().toString();
                int peligrosidad=Integer.parseInt(cboPeligrosidad.getSelectedItem().toString());
                double pago= Double.parseDouble(textPago.getText().toString());
                double aporte;
                double impuestos;
                Heroe h1= new Heroe(id,nombre,Mision,peligrosidad,pago);
                ave.agregardatos(h1);
                textInfo.setText(ave.imprimir());
            }
        });
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id= Integer.parseInt(textid.getText().toString());
                String nombre= textNombre.getText().toString();
                String Mision=textMision.getText().toString();
                int peligrosidad=Integer.parseInt(cboPeligrosidad.getSelectedItem().toString());
                double pago= Double.parseDouble(textPago.getText().toString());
                ave.modificardatos(id,nombre,Mision,peligrosidad,pago);
                textInfo.setText(ave.imprimir());
            }
        });
        BtnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textInfo.setText(ave.imprimir());
            }
        });
        BtnAportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textAportes.getText().toString());
                textInfo.setText(ave.generarInformePorId(id));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

