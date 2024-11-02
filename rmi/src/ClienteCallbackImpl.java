
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClienteCallbackImpl extends UnicastRemoteObject implements ClienteCallback {

    public ClienteCallbackImpl() throws RemoteException {
        super();
    }

    @Override
    public void notificarResultado(String operacion, double resultado) throws RemoteException {
        System.out.println("=====================================");
        System.out.println("          Notificacion del Servidor           ");
        System.out.println("=====================================");
        System.out.println(" Operacion: " + operacion);
        System.out.printf(" Resultado: %.2f%n", resultado);
        System.out.println(" Goodbye");
        System.out.println("=====================================\n");
    }
}
