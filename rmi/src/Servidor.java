
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1999);
            Calculadora calculadora = new CalculadoraImpl();
            registry.rebind("CalculadoraService", calculadora);
            System.out.println("Servidor listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
