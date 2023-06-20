package arrays;

public class PromedioNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arreglo = new int[100];
        double suma = 0;
        for (int i = 0; i < 100; i++) {
            int numero = (i + 1);
            arreglo[i] = numero;
            suma = suma + arreglo[i];
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " -> " + arreglo[i]);
        }
        double promedio = suma / 100;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        */
		
		int [] numeros = new int [100];
		int suma = 0;
		double promedio;


		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+1;
			System.out.println("Posicion " + i + ": " + numeros[i]);
			
			suma += numeros[i];
		}

			promedio = (double) suma / numeros.length;
			
			System.out.println("La suma es: "  + suma);
			System.out.println("El promedio es: " + promedio);
			}
		
			
    }
	


