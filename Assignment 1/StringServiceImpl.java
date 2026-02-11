import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/*
 * Implementation class for the remote StringService interface
 * -----------------------------------------------------------
 * This class provides the actual logic for the remote methods.
 * It extends UnicastRemoteObject so that objects can be accessed
 * remotely using Java RMI.
 */
public class StringServiceImpl extends UnicastRemoteObject implements StringService {

    /*
     * Constructor
     * -----------
     * Calls the parent constructor to export the remote object
     * and make it available for RMI calls.
     */
    protected StringServiceImpl() throws RemoteException {
        super();
    }

    /*
     * Converts the input string to uppercase
     * @param text Input string received from client
     * @return Uppercase version of the string
     */
    public String toUpper(String text) {
        return text.toUpperCase();
    }

    /*
     * Reverses the input string
     * @param text Input string received from client
     * @return Reversed string
     */
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    /*
     * Finds the length of the input string
     * @param text Input string received from client
     * @return Length of the string
     */
    public int length(String text) {
        return text.length();
    }
}
