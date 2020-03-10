package pruebas;
import javax.swing.JOptionPane;

/* 
Hacer un programa que ayude a saber cuál será el suedo semanal. Se sabe que 
si trabaja 40h o menos se le pagará $20 por hora, pero si trabaja más de 40h 
entonces las horas extra se le pagaran a $25. 
*/

public class SueldoSemanal {
    public static void main(String args[]){
        double horas, sueldoFinal;
        
        horas = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Ingresa el total de horas trabajado: "));
        
        if (horas <= 40){
        sueldoFinal = horas * 20;
        
        JOptionPane.showMessageDialog(null, "Sueldo Final: " + sueldoFinal);
        }else{
        sueldoFinal = horas * 25;
        JOptionPane.showMessageDialog(null, "Sueldo Final: " + sueldoFinal);


        }
    }
}
