import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * RMIClient
 * ----------
 * This client program connects to the RMI Registry running on the server,
 * looks up the remote object, and invokes methods remotely.
 */
public class RMIClient {

    public static void main(String[] args) {
        try {
            // Connect to the RMI registry on the same machine (EC2 instance)
            // Port 1099 is the default port for RMI registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the remote object using the service name
            Calculator calc = (Calculator) registry.lookup("CalculatorService");

            // Invoke remote methods and display the results
            System.out.println("Addition Result: " + calc.add(10, 5));
            System.out.println("Multiplication Result: " + calc.multiply(3, 7));

        } catch (Exception e) {
            // Handle any client-side errors such as lookup or connection failure
            System.out.println("Client Error: " + e);
        }
    }
}
