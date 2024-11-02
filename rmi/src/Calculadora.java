
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

    void suma(double a, double b, ClienteCallback callback) throws RemoteException;

    void resta(double a, double b, ClienteCallback callback) throws RemoteException;

    void multiplicacion(double a, double b, ClienteCallback callback) throws RemoteException;

    void division(double a, double b, ClienteCallback callback) throws RemoteException;
}
