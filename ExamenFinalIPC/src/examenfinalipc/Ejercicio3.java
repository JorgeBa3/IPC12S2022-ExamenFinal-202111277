package examenfinalipc;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {	
       Scanner sc = new Scanner(System.in);
       int numVacas;
       int pesoCamion;
       int[] pesoVacas = new int[10];
       int[] lecheVacas = new int[10];
       System.out.println("Ingrese el numero de vacas");
       numVacas = sc.nextInt();
       System.out.println("Ingrese el peso maximo del camion");
       pesoCamion = sc.nextInt();
        for (int i = 0; i < numVacas; i++) {
            System.out.println("Ingrese el peso de la vaca #" + i);
            pesoVacas[i] = sc.nextInt();
            System.out.println("Ingrese la produccion de leche de la vaca #" + i);
            lecheVacas[i] = sc.nextInt();
        }
        
        int mayorLecheVacas=0;
        
        for (int i = 0; i < numVacas-3; i++) {
            int sumaLeche=0;
            int sumaPeso=0;
            for (int j = 1; j < numVacas-2; j++) {
                for (int k = 2; k < numVacas-1; k++) {
                    for (int l = 3; l < numVacas; l++) {
                        sumaLeche=lecheVacas[i]+lecheVacas[j]+lecheVacas[k]+lecheVacas[l]; 
                        sumaPeso=pesoVacas[i]+pesoVacas[j]+pesoVacas[k]+pesoVacas[l]; 
                        if (sumaLeche>mayorLecheVacas && sumaPeso<pesoCamion) {
                        mayorLecheVacas=sumaLeche;
                        
                        }
                    }
                }
            }
        }
        System.out.println("Litros de leche: " + mayorLecheVacas);
    }
}
