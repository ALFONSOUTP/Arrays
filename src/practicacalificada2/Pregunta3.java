package practicacalificada2;

import java.util.Scanner;
public class Pregunta3 {
public static void main(String[] args) {
	int n, i=1, f=1;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese un numero entero: ");
	n = teclado.nextInt();
	do {
		f *= i;
		i++;
	}while (i<=n);
	System.out.printf("El factorial de " + n + " es: "+f);
}
}
