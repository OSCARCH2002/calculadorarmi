
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public void suma(double a, double b, ClienteCallback callback) throws RemoteException {
        double resultado = a + b;
        callback.notificarResultado("Suma", resultado);
    }

    @Override
    public void resta(double a, double b, ClienteCallback callback) throws RemoteException {
        double resultado = a - b;
        callback.notificarResultado("Resta", resultado);
    }

    @Override
    public void multiplicacion(double a, double b, ClienteCallback callback) throws RemoteException {
        double resultado = a * b;
        callback.notificarResultado("Multiplicacion", resultado);
    }

    @Override
    public void division(double a, double b, ClienteCallback callback) throws RemoteException {
        if (b != 0) {
            double resultado = a / b;
            callback.notificarResultado("Division", resultado);
        } else {
            System.out.println("Error: División por cero.");
        }
    }
}
