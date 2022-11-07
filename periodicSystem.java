import java.io.BufferedReader;
import java.io.FileReader;
public class periodicSystem {
    public periodicSystem(String file) {
        Element elementArray[] = new Element[118];
        int i = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean checkMetal;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");

                if(row[4] == "yes"){
                    checkMetal = true;
                } else {
                    checkMetal = false;
                }

                elementArray[i] = new Element(row[1], row[2], Double.parseDouble(row[3]),checkMetal);
                i++; 
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
