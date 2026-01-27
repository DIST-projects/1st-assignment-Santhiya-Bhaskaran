import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/*
 * CalculatorImpl
 * --------------
 * This class provides the implementation of the remote methods
 * defined in the Calculator interface.
 * It extends UnicastRemoteObject to allow remote access.
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    // Constructor required for exporting the remote object
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    // Remote method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Remote method to perform multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
}
