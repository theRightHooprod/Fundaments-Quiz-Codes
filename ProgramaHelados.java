package pruebas;
import javax.swing.JOptionPane;

public class ProgramaHelados {
    public static void main(String []arg){
        /*
        Hacer un programa para una tienda de helado donde que da un descuento 
        a sus clientes con membresía dependiendo su tipo 
        A) 20%
        B) 15%
        C) 5%
        */        
        double precio, membresia;
          
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa "
                + "el precio"));
        
        membresia = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa"
                + "el tipo de membresia" + "\n 1 - Tipo A \n 2 - Tipo B "
                + "\n 3 - Tipo C"));
        
        if(membresia == 1){
            JOptionPane.showMessageDialog(null, "El precio descuento es: $" 
                    + precio * .20);
        }else if(membresia == 2){
            JOptionPane.showMessageDialog(null, "El precio descuento es: $"
                    + precio * .15);
        }else if(membresia == 3){
            JOptionPane.showMessageDialog(null, "El precio descuento es: $"
                    + precio * .15);
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");

        }
        
        
    }
}
