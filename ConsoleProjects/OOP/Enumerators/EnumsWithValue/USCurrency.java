package OOP.Enumerators.EnumsWithValue;

public enum USCurrency {
    PENNY(0.01f,"Penny"),
    NICKLE(0.05f,"Nickle"),
    DIME(0.1f,"Dime"),
    QUARTER(0.25f,"Quarter");
    float value;

    // if we add some variable add to the enumarators too
    String name;

    USCurrency(float value,String name){
        this.value = value;
        this.name = name;
    }
}
