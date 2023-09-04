package AdministradorVehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventana {
	ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	public void inicio() {
	Scanner scanner = new Scanner(System.in);
        while (true) {
		System.out.println("Menú:");
		System.out.println("1. Crear auto");
		System.out.println("2. Crear motocicleta");
		System.out.println("3. Ver vehículos");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
		int opcion = scanner.nextInt();
		scanner.nextLine();
		switch (opcion) {
			case 1:
				System.out.print("Ingrese la marca del auto: ");
				String marcaAuto = scanner.nextLine();
				System.out.print("Ingrese el modelo del auto: ");
				String modeloAuto = scanner.nextLine();
				System.out.print("Ingrese numero de puertas ");
				int numeroPuertas = scanner.nextInt();
				Auto auto = new Auto(marcaAuto, modeloAuto, numeroPuertas);
				vehiculos.add(auto);
				System.out.println("Auto creado.");
				break;

			case 2:
				System.out.print("Ingrese la marca de la motocicleta: ");
				String marcaMoto = scanner.nextLine();
				System.out.print("Ingrese el modelo de la motocicleta: ");
				String modeloMoto = scanner.nextLine();
				System.out.print("Ingrese el modelo del manubrio de la motocicleta: ");
				String modeloManubrio = scanner.nextLine();
				Moto moto = new Moto(marcaMoto, modeloMoto,modeloManubrio);
				vehiculos.add(moto);
				System.out.println("Motocicleta creada.");
				break;

			case 3:
				System.out.println("Lista de vehículos:");
				for (Vehiculo vehiculo : vehiculos) {
					System.out.println(vehiculo);
				}
				break;

			case 4:
				System.out.println("Saliendo del programa.");
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
		}
	}
}}