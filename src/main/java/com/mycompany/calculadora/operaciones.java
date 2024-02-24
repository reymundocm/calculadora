/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;
public class operaciones {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo 
    
    public void leerNumero(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("colocar el numero 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("colocar el numero 2"));
    }

// metodo de suma

public void suma(){
suma=numero1+numero2;
}
public void resta(){
resta=numero1-numero2;
}
public void multiplicacion(){
multiplicacion=numero1*numero2;
}
public void division(){
division=numero1/numero2;
}
public void mostrarResultados(){
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicacion es: "+multiplicacion);
    System.out.println("La division es: "+division);
}

}