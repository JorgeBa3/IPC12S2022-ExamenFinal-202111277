package examenfinalipc;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero \n");
        int n1 = sc.nextInt();

        System.out.print("Ingrese un segundo numero \n");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.print("El número mayor es: " +  n1 + " \n");
        } else {
            System.out.print("El número mayor es: " +  n2 + " \n");
        }
	}
}
