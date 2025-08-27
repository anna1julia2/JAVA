/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author ANNAJULIADENORONHACO
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("digite seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("digite sua altura: ");
        float altura = sc.nextFloat();
        float imc = peso / altura+altura;
        System.out.println("o seu imc é: " + imc + "kg/m");
        sc.close();
    }
    
}
