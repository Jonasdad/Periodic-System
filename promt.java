import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class promt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("************Welcome to Periodic Table Practice************");
        System.out.printf("\t\tWhat would you like to do?\n");
        System.out.printf("\t\t1. Show perodic table\n\t\t2. Practice beteckningar\n\t\t3. Practice Atomic Masses\n\t\t4. Quit");
        System.out.printf("\n----------------------------------------------------------");
        Integer option = input.nextInt();
        try{
            if(option.equals(1)){
                System.out.println("Display periodic table");
            }
            if(option.equals(2)){
                System.out.println("--ADD FUNCTIONALITY TO PRACTICE SYMBOLS");
            }
            if(option.equals(3)){
                System.out.println("--ADD FUNCTIONALTY TO PRACTICE ATOMIC MASSES");
            }
            if(option.equals(4)){
                System.out.println("Exiting Program");
                System.exit(0);
            }
        }
        catch(InputMismatchException e){
            System.out.println("That was not an integer you dumb fuck. Please try again");
        }
    }
}
