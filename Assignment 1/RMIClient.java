import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * RMI Client Program
 * ------------------
 * This client connects to the RMI Registry, looks up the remote
 * StringService, and invokes its methods from a different JVM.
 */
public class RMIClient {

    public static void main(String[] args) {
        try {
            /*
             * Connect to the RMI Registry running on the server
             * "localhost" is used when client and server are on the same machine.
             * For AWS, replace "localhost" with the public IP of the EC2 instance.
             */
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            /*
             * Lookup the remote object using the registered service name
             * The returned object is cast to the StringService interface.
             */
            StringService service =
                    (StringService) registry.lookup("StringService");

            // Input string to be processed remotely
            String text = "Distributed Systems";

            /*
             * Invoke remote methods
             * These method calls are executed on the server machine,
             * and results are returned to the client.
             */
            System.out.println("Original Text: " + text);
            System.out.println("Uppercase: " + service.toUpper(text));
            System.out.println("Reversed: " + service.reverse(text));
            System.out.println("Length: " + service.length(text));

        } catch (Exception e) {
            // Handle any RMI-related exceptions
            System.out.println("Client Error: " + e);
        }
    }
}
