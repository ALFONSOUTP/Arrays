package arrays;

public class Ejemplo01Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arreglo; //declara una varible del mismo nombre
			
			arreglo = new int [100]; //crea el objeto arreglo
			int acumulador=0;
			System.out.printf("%s%8s\n","indice","valor");  //encabezados de las colmnas
			//imprime el valor de cada elemento del arreglo
					
			for (int contador = 0; contador < arreglo.length; contador++) {
				//System.out.println();
				// imprime el valor de cada elementos del arreglo
				acumulador++;
				System.out.printf("%5d%8d\n",contador,acumulador);
							
			}
					
	}

}
