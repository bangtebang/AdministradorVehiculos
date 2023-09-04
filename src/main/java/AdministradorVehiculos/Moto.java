package AdministradorVehiculos;

public class Moto extends Vehiculo {
	private String marcaManubrio;

	public Moto(String marca, String modelo, String marcaManubrio) {
		super(marca, modelo);
		this.marcaManubrio = marcaManubrio;
	}

	public String getMarcaManubrio() {
		return this.marcaManubrio;
	}

	public void setMarcaManubrio(String marcaManubrio) {
		this.marcaManubrio = marcaManubrio;
	}
}