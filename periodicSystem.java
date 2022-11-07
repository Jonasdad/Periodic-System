import java.io.BufferedReader;
import java.io.FileReader;
public class periodicSystem {
    public periodicSystem(String file) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
