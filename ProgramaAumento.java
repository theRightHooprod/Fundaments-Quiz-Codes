package pruebas;
import javax.swing.JOptionPane;

/**
Hacer un progama que calcular el aumento del salario de un trabajador, si es mayor a $2000, 
solo se aumentara el 5%, si es menor 10% de aumento
 */
public class ProgramaAumento {
    public static void main(String []args){
    double sueldo, sueldoFinal, aumento;
    
    sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa "
        + "el sueldo \ndel trabajador: "));
    
    if(sueldo >= 2000){
        aumento = sueldo * .05;
        sueldoFinal = sueldo + aumento;

        JOptionPane.showMessageDialog(null, "Sueldo con aumento: " 
                + sueldoFinal);
        
    }else{
        aumento = sueldo * .10;
        sueldoFinal = sueldo + aumento;
        JOptionPane.showMessageDialog(null, "Sueldo con aumento: " 
                + sueldoFinal);

    }    
        
    }
    
}
