/**
 * Represents one row from your dataset.
 */
public class Data {

    private String name;
    private String types;
    private int dexNumber;

   public void Pokemon(String name, String types, int dexNumber){
       this.name = name;
       types = this.type1 + " " + this.type2;
       this.number = dexNumber;
   }

public String getName(){
    return name;
}

public String getTypes(){
    return types;
}

public int getNumber(){
    return dexNumber;
}
}
