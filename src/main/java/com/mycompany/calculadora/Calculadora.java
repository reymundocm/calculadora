/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author HP
 */
public class Calculadora {

    public static void main(String[] args) {
        operaciones op=new operaciones();
        op.leerNumero();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();
        op.mostrarResultados();
    }
}
