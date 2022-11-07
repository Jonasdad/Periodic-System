import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class promt {
    public static void main(String[] args){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("************Welcome to Periodic Table Practice************");
            System.out.printf("\t\tWhat would you like to do?\n");
            System.out.printf("\t\t1. Show perodic table\n\t\t2. Practice beteckningar\n\t\t3. Practice Atomic Masses\n\t\t4. Quit");
            System.out.printf("\n----------------------------------------------------------\n");
            try{
                Integer option = input.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Display periodic table\n");
                        break;
                    case 2:
                        System.out.println("--ADD FUNCTIONALITY TO PRACTICE SYMBOLS\n");
                        break;
                    case 3:
                        System.out.println("--ADD FUNCTIONALTY TO PRACTICE ATOMIC MASSES\n");
                        break;
                    case 4:
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
