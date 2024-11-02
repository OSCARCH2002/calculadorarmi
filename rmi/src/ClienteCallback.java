
import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz remota para el callback
public interface ClienteCallback extends Remote {

    void notificarResultado(String operacion, double resultado) throws RemoteException;
}
