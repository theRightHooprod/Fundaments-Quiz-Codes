package pruebas;
import javax.swing.JOptionPane;

public class Promedio {
    public static void main(String []args){
    double califA, califB, califC, promedio;
    
    califA = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
            + "la primera calificacion: "));
    califB = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
            + "la segunda calificacion: "));
    califC = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
            + "la tercera calificacion: "));
    
    promedio = (califA+califB+califC)/3;
    
    if (promedio >= 7.00){
        JOptionPane.showMessageDialog(null, "APROBADO, Proedio Final: " 
                + promedio);

    }else{
        JOptionPane.showMessageDialog(null, "REPROBADO, Proedio Final: " 
                + promedio);
    }    
    }
    
}
