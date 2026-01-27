import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Calculator
 * ----------
 * This is a remote interface for the RMI application.
 * It declares the methods that can be invoked remotely by the client.
 */
public interface Calculator extends Remote {

    // Remote method for addition
    // Throws RemoteException to handle communication-related errors
    int add(int a, int b) throws RemoteException;

    // Remote method for multiplication
    // Throws RemoteException to handle communication-related errors
    int multiply(int a, int b) throws RemoteException;
}
