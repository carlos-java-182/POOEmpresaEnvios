package empresa;

import java.util.Scanner;

public class Principal {

	public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {
		int indice = 0;
		boolean encontrado = false;

		for (int i = 0; i < contadorPaquete; i++) {
			if (t[i].getNumReferencia() == numeroPaquete) {
				encontrado = true;
				indice = i;

			}

		}

		if (encontrado = false) {
			indice = -1;
		}

		return indice;
	}

	public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {
		int indice = 0;
		boolean encontrado = false;

		for (int i = 0; i < contadorSucursal; i++) {
			if (t[i].getNumero() == numeroSucursal) {
				encontrado = true;
				indice = i;

			}

		}

		if (encontrado = false) {
			indice = -1;
		}

		return indice;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroSucursal, nPaquete, prioridad, opcion;
		int contadorSucursal = 0, contadorPaquete = 0, indiceSucursal, indicePaquete;
		String direccion, ciudad, dni;
		double peso, precio;

		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete[] = new Paquete[100];

		do {

			System.out.println("\t :MENU:.");
			System.out.println("1.- Crear una nueva sucursal");
			System.out.println("2.- Enviar paquete");
			System.out.println("3.- Consultar sucursal");
			System.out.println("4.- Consultar paquete");
			System.out.println("5.- Mostrar todas las sucursales");
			System.out.println("6.- Mostrar todos los paquetes");
			System.out.println("7.- Salir");
			System.out.println("Digite la opcion de menú");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Digite el número de sucursal");
				numeroSucursal = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Digite la dirección");
				direccion = entrada.nextLine();
				System.out.println("Digite la ciudad");
				ciudad = entrada.nextLine();

				sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
				contadorSucursal++;

				break;

			case 2:
				System.out.println("Digite el número de sucursal");
				numeroSucursal = entrada.nextInt();

				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.println("Digite el número de paquete");
					nPaquete = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Digite el dni de la persona");
					dni = entrada.nextLine();
					System.out.println("Digite el peso");
					peso = entrada.nextDouble();
					System.out.println("Digite la prioridad: \n0-Normal\n1-Alta \n2-Express");
					prioridad = entrada.nextInt();

					paquete[contadorPaquete] = new Paquete(nPaquete, dni, peso, prioridad);

					precio = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);

					System.out.println("El precio del paquete es: " + precio);

					contadorPaquete++;

				}

				break;

			case 3:
				System.out.println("Digite el número de sucursal: ");
				numeroSucursal = entrada.nextInt();

				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.println(
							"\n Los datos de la sucursal son: " + sucursal[indiceSucursal].mostrarDatosSucursal());
				}

				break;

			case 4:
				System.out.println("Digite el número de paquete: ");
				nPaquete = entrada.nextInt();

				indicePaquete = buscarPaquete(paquete, nPaquete, contadorPaquete);

				if (indicePaquete == -1) {
					System.out.println("La sucursal no existe");
				}

				else {
					System.out.println("\n Los datos del paquete son: " + paquete[indicePaquete].mostrarDatos());
				}

				break;

			case 5:
				for (int i = 0; i < contadorSucursal; i++) {
					System.out.println("\n Los datos de la sucursal número " + i + ".- son : ");
					System.out.println(sucursal[i].mostrarDatosSucursal());
				}

				break;

			case 6:

				for (int i = 0; i < contadorPaquete; i++) {
					System.out.println("\n Los datos del paquete" + i + ".- son : ");
					System.out.println(paquete[i].mostrarDatos());
				}

				break;

			case 7:

				System.out.println("Haz salido del sistema");

				break;

			default:
				System.out.println("Opción de menú incorrecta, digita una opcion válida");
			}
		} while (opcion != 7);
	}

}
