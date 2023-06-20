package practicacalificada2;
import java.util.Scanner;
public class Pregunta4 {
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Ingrese el valor de n: ");
	    int n = teclado.nextInt();
	    int[] primes = new int[n];
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
	
	  


