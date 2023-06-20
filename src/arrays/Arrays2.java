package arrays;
import java.util.Scanner;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//int numero;
		String apellido_1="Labrada";
		int sumaPrecios=0;

		String [] apellidos = new String[5];

		apellidos[0] = "Labrada";
		apellidos[4] = "Garcia";
		apellidos[1] = "Arteaga";
		apellidos[2] = "Suarez";
		apellidos[3] = "Romo";

		for(int i=0;i<apellidos.length;i++) {
			System.out.println(apellidos[i]);
		}

		/* i=2
		*/		

		int [] precios = new int[3];

		for(int i=0;i<=precios.length;i++) {
			System.out.println("Dame el precio: ");
			precios[i] = teclado.nextInt();
		}

		for(int i=0;i<precios.length;i++) {
			System.out.println(precios[i]);
		}

		for(int i=0;i<precios.length;i++) {
			sumaPrecios = sumaPrecios + precios[i];
		}

		System.out.println("Suma de los precios: "+	sumaPrecios);

		double promedio = sumaPrecios/precios.length;

		System.out.println("Promedio "+promedio);

		/*
		i=3
		sumaPrecios¨=60


		10	
		20
		30

		*/

		}
		
	}

	