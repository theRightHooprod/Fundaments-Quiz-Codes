package pruebas;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String []args){
        int select;
        select = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingresa seleccion: "));
        
        switch (select){
            case 1:
                double horas,
                 sueldoFinal;

                horas = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingresa el total de horas trabajado: "));

                if (horas <= 40) {
                    sueldoFinal = horas * 20;

                    JOptionPane.showMessageDialog(null, "Sueldo Final: " + sueldoFinal);
                } else {
                    sueldoFinal = horas * 25;
                    JOptionPane.showMessageDialog(null, "Sueldo Final: " + sueldoFinal);                
                }
            case 2:
                double califA,
                 califB,
                 califC,
                 promedio;

                califA = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
                        + "la primera calificacion: "));
                califB = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
                        + "la segunda calificacion: "));
                califC = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa"
                        + "la tercera calificacion: "));

                promedio = (califA + califB + califC) / 3;

                if (promedio >= 7.00) {
                    JOptionPane.showMessageDialog(null, "APROBADO, Proedio Final: "
                            + promedio);

                } else {
                    JOptionPane.showMessageDialog(null, "REPROBADO, Proedio Final: "
                            + promedio);
                }
            case 3:
                double precio,
                 membresia;

                precio = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa "
                        + "el precio"));

                membresia = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa"
                        + "el tipo de membresia" + "\n 1 - Tipo A \n 2 - Tipo B "
                        + "\n 3 - Tipo C"));

                if (membresia == 1) {
                    JOptionPane.showMessageDialog(null, "El precio descuento es: $"
                            + precio * .20);
                } else if (membresia == 2) {
                    JOptionPane.showMessageDialog(null, "El precio descuento es: $"
                            + precio * .15);
                } else if (membresia == 3) {
                    JOptionPane.showMessageDialog(null, "El precio descuento es: $"
                            + precio * .15);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresa un numero valido");

                }
            case 4:
                double sueldo,sueldoF,aumento;

                sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa "
                        + "el sueldo \ndel trabajador: "));

                if (sueldo >= 2000) {
                    aumento = sueldo * .05;
                    sueldoF = sueldo + aumento;

                    JOptionPane.showMessageDialog(null, "Sueldo con aumento: "
                            + sueldoF);

                } else {
                    aumento = sueldo * .10;
                    sueldoF = sueldo + aumento;
                    JOptionPane.showMessageDialog(null, "Sueldo con aumento: "
                            + sueldoF);

                }
    }  
  }
}