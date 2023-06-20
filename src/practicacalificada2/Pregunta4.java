package practicacalificada2;
import java.util.Scanner;
public class Pregunta4 {
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); //crear un objeto teclado que almacena el valor ingresado por consola
	    System.out.print("Ingrese el valor de n: "); //muestra un menaje pidiendo que ingrese un valor
	    int n = teclado.nextInt(); //el valor ingresado lo alcena en una variable de tipo entero
	    int[] primes = new int[n]; //
	    int count = 0;
	    int num = 2;
	    while (count < n) {
	      boolean isPrime = true;
	      for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	          isPrime = false;
	          break;
	        }
	      }
	      if (isPrime) {
	        primes[count] = num;
	        count++;
	      }
	      num++;
	    }
	    System.out.println("Los primeros " + n + " números primos son:");
	    for (int prime : primes) {
	      System.out.print(prime + " ");
	    }
	  }
	}
	
	  


