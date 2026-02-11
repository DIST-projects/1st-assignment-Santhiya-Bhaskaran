import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * RMI Server Program
 * ------------------
 * This server creates an instance of StringServiceImpl,
 * starts the RMI Registry, and binds the service so that
 * clients can access it remotely.
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            /*
             * Create the remote object that implements
             * the StringService interface
             */
            StringService service = new StringServiceImpl();

            /*
             * Create an RMI Registry on port 1099
             * This allows clients to look up remote objects
             */
            Registry registry = LocateRegistry.createRegistry(1099);

            /*
             * Bind (or rebind) the remote object to the registry
             * with a logical service name
             */
            registry.rebind("StringService", service);

            // Server status message
            System.out.println("RMI String Server running...");

        } catch (Exception e) {
            // Handle any RMI-related server exceptions
            System.out.println("Server Error: " + e);
        }
    }
}
