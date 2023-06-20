package arrays;

public class Pregunta2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numeros = new int[100];
		    int suma = 0;
		    int producto = 1;

		    for (int i = 0; i < numeros.length; i++) {
		      numeros[i] = i + 1;
		      suma += numeros[i];
		      producto *= numeros[i];
		    }

		    for (int i = 0; i < numeros.length; i++) {
		      System.out.println("Número " + (i + 1) + ": " + numeros[i]);
		    }

		    System.out.println("Suma: " + suma);
		    System.out.println("Producto: " + producto);
	}

}
