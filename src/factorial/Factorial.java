/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author HACKER
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para calcular su factorial");
        num=leer.nextDouble();
        System.out.println(factorial(num));//se imprime el valor del factorial
    }
    public static double factorial (double numero) {//metodo recursivo
  if (numero==0)//condicion o caso base
    return 1;
  else// entonces
    return numero * factorial(numero-1);//se llama asi mismo el metodo multiplicando y creando un bucle el cual terminara cumpliendose la condicion.
}
}
