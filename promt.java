import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class promt {
    public static void main(String[] args){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("************Welcome to Periodic Table Practice************");
            System.out.printf("\t\tWhat would you like to do?\n");
            System.out.printf("\t\t1. Show perodic table\n\t\t2. Practice Symbols\n\t\t3. Practice Atomic Numbers\n\t\t4. Random Tasks\n\t\t5. Quit");
            System.out.printf("\n----------------------------------------------------------\n");
            periodicSystem test = new periodicSystem("periodicSystem.csv");
            try{
                Integer option = input.nextInt();
                switch(option){
                    case 1:
                        test.print(test);
                        break;
                    case 2:
                        test.practiceSymbol();
                        break;
                    case 3:
                        test.practiceAtomicNumber();
                        break;
                    case 4:
                        Random rnd = new Random();
                        Integer rand = rnd.nextInt(2);
                        if(rand.equals(1)){
                            test.practiceSymbol();
                        }
                        else{
                            test.practiceAtomicNumber();
                        }
                        break;
                    case 5:
                        System.out.println("Exiting Program. Good Bye\n");
                        System.exit(0);
                        break;
                    default:
                        System.out.printf("\n" + option + " is not an option, try again\n");
                }
            }
            catch(InputMismatchException e){
                System.out.println("\nInvalid option, try again\n");
            }
        }
    }
}
