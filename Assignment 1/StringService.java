import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Remote interface for Java RMI
 * --------------------------------
 * This interface declares methods that can be invoked remotely
 * by an RMI client running on a different machine.
 */
public interface StringService extends Remote {

    /*
     * Converts the given string to uppercase
     * @param text Input string from client
     * @return Uppercase version of the string
     * @throws RemoteException Handles network-related errors
     */
    String toUpper(String text) throws RemoteException;

    /*
     * Reverses the given string
     * @param text Input string from client
     * @return Reversed string
     * @throws RemoteException Handles remote invocation errors
     */
    String reverse(String text) throws RemoteException;

    /*
     * Returns the length of the given string
     * @param text Input string from client
     * @return Length of the string
     * @throws RemoteException Handles communication errors
     */
    int length(String text) throws RemoteException;
}
