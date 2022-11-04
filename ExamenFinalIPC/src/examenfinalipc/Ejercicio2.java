package examenfinalipc;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {		
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el numero de filas");
       int contador = 1;
       int tamaño = sc.nextInt();
       if (tamaño%2==1) {
            for(int j = 0; j < (tamaño/2)+1; j++) {
                for(int i = tamaño - 1; i > j; i--) {
                    System.out.print(" ");
                }
                for(int i = 0; i < contador; i++) {
                    System.out.print("*");
                }
                contador += 2;
                System.out.println();
            }
        }
       else{
           System.out.println("Ingrese un numero par");
       }
    }
}
