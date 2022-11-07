public class element{
    String symbol;
    String elementName;
    double atomicMass;
    boolean metalOrNah;

    //atomic number will be array index+1,symbol,name,atomic mass,metal or nonmetal?
    public element(String symbol, String elementName, double atomicMass, boolean metalOrNah){
        this.symbol = symbol;
        this.elementName = elementName;
        this.atomicMass = atomicMass;
        this.metalOrNah = metalOrNah; 
    }


    
    
}