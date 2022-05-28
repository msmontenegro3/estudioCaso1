//Fig. X.X: TestCaso1.java
package EstudioCaso1;
public class TestCaso1 {

	public static void main(String[] args) {
		
		//Se instancia la clase - Se le otorga un valor inicial a través del constructor.
		Celular celular = new Celular("Rojo", 2, 16);
		
		//Se invocan los métodos encender y llamar y se imprimen por consola
		System.out.println(celular.enciende());
		System.out.println(celular.llamar("Lucía Secretaria UTPL"));		
		
		//Utiliza el método toString
		System.out.println("Las características del celular son las siguientes:");
		System.out.println(celular);
		
	}

}
