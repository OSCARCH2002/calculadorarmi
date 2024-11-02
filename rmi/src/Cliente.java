
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1999);
            Calculadora calculadora = (Calculadora) registry.lookup("CalculadoraService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el primer numero: ");
            double a = scanner.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double b = scanner.nextDouble();

            // Crear una instancia del callback para recibir la notificación
            ClienteCallback callback = new ClienteCallbackImpl();

            // Llamar a los métodos remotos
            System.out.println("Elija la operacion:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadora.suma(a, b, callback);
                    break;
                case 2:
                    calculadora.resta(a, b, callback);
                    break;
                case 3:
                    calculadora.multiplicacion(a, b, callback);
                    break;
                case 4:
                    calculadora.division(a, b, callback);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
