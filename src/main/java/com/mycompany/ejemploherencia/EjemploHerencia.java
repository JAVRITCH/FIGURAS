/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploherencia;

/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(system.in;
        System.out.println("ingrese el valor del radio");
        double radio;
        radio=leer.nextDouble();
        //crear un objeto de la clase 
        Circulo circulo1=new Circulo(radio);
        
        //imprimir el valor del area 
        System.out.println("El area del ciculo es: " + circulo1.CalcularArea());
    }
}
