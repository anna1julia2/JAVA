/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO2aula4;
import javax.swing.JOptionPane;

/**
 *
 * @author ANNAJULIADENORONHACO
 */
public class java {
        public static void main(String[]args){
        double peso, altura, imc;
        String saída;
        peso = Double.parseDouble(JOptionPane.showInputDialog(
                null, "digite o seu peso em kg: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(
            null, "digite a sua altura em m: "));
        imc = peso / (altura * altura);
        saída = String.format("seu imc é %.2f kg/m2" , imc);
        JOptionPane.showMessageDialog(null, saída);
        System.out.print(saída);
    }
}
 