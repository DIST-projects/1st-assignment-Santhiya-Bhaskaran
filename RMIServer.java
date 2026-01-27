import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * RMIServer
 * ----------
 * This program starts the RMI server, creates the RMI registry,
 * and binds the remote object so that clients can access it remotely.
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            // Create an instance of the remote object implementation
            Calculator calc = new CalculatorImpl();

            // Create and start the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object to the registry with a service name
            registry.rebind("CalculatorService", calc);

            // Indicate that the RMI server is running successfully
            System.out.println("RMI Server running...");

        } catch (Exception e) {
            // Handle server-side errors such as registry or binding failure
            System.out.println("Server Error: " + e);
        }
    }
}
