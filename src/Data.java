/**
 * Represents one row from your dataset.
 */
public class Data {

    private String name;
    private String types;
    private int dexNumber;

public Data(String name, String types, int dexNumber) {
    this.name = name;
    this.types = types;
    this.dexNumber = dexNumber;
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
