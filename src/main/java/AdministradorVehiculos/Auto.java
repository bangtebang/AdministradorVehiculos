package AdministradorVehiculos;

public class Auto extends Vehiculo {
	private int puertas;

	public Auto(String marca, String modelo, int puertas) {
		super(marca, modelo);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}