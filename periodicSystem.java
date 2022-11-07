import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
public class periodicSystem {

    Element elementArray[] = new Element[118];
    public periodicSystem(String file) {
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










    public void PracticeAtomicNumbers(){
        Random rnd = new Random();
        System.out.println("what is the atomic number of " + elementArray[rnd.nextInt(118)].elementName);

        System.out.println("");
        
    }



    public void printPS(periodicSystem test){
        System.out.println("Atomic Number, Symbol, Element Name, Atomic Mass, Metal?");
        for(int i = 0; i < 118; i++){
            System.out.print(i+1+ " ");
            System.out.print(test.elementArray[i].symbol+" ");
            System.out.print(test.elementArray[i].elementName+" ");
            System.out.print(test.elementArray[i].atomicMass+" ");
            System.out.print(test.elementArray[i].metalOrNah+" "+"\n");
        }
    }
}
