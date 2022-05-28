//Fig. X.X: Celular.java
package EstudioCaso1;
public class Celular {
	
	//ATRIBUTOS
	private String color;
	private int memoria;
	private float espacio;
	
	//CONSTRUCTOR
	public Celular(String color, int memoria, float espacio) {
		this.color = color;
		this.memoria = memoria;
		this.espacio = espacio;
	}
	
	//SETTERS Y GETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public float getEspacio() {
		return espacio;
	}

	public void setEspacio(float espacio) {
		this.espacio = espacio;
	}
	
	//MÉTODOS PROPIOS
	
	public String enciende() {
		String estado="Encendiendo...";
		return estado;
	}//fin clase enciende
	
	public String llamar(String contacto) {
		//recibe el contacto y lo devuelve dentro de la llamada
		return "Llamando a: "+contacto;
	}//fin clase llamar
	

	//Método toString
	public String toString() {
		return String.format("Color: %s \nMemoria: %s GB \nEspacio: %s GB",getColor(), getMemoria(), getEspacio());
	}//fin clase toString

	
}
