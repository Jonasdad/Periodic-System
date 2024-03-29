import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
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

    public void practiceSymbol(){
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        Integer randomized = rnd.nextInt(118);
        System.out.println("What is the Symbol for " + elementArray[randomized].elementName);
        Integer i = 0;
        while(i < 3){
            String answer = input.nextLine();

            if(elementArray[randomized].symbol.equalsIgnoreCase(answer)){
                System.out.println("Correct!");
                break;
            }
            else{
                System.out.println("Incorrect! Please try again\n" + "Tries left " + (2-i));
                i++;
            }    
        }
        System.out.println("The correct answer was " + elementArray[randomized].symbol);
    }

    public void practiceAtomicNumber(){
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        Integer random = rnd.nextInt(118);
        System.out.println("What element has atomic number " + random);
        Integer i = 0;
        while(i < 3){
            String answer = input.nextLine();

            if(elementArray[random-1].elementName.equalsIgnoreCase(answer) || elementArray[random-1].symbol.equalsIgnoreCase(answer)){
                System.out.println("Correct!");
                break;
            }
            else{
                System.out.println("Incorrect! Please try again\n" + "Tries left " + (2-i));
                i++;
            }
        }
        System.out.println("The correct answer was " + elementArray[random-1].elementName +", " + elementArray[random-1].symbol);
    }
    
    public void print(periodicSystem test){
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
