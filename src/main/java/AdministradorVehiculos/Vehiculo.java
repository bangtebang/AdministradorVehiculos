package AdministradorVehiculos;

public class Vehiculo {
	private String marca;
	private String modelo;
	public Ventana unnamed_Ventana_;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}