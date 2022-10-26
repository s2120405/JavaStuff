package VendingMach;

public class Drink2 extends DrinksTot  {

    private String type2;
    private String typeD2;

    private double drinkP2;

    public Drink2(String ADrinks, String type2, String typeD2, double drinkP2) {
        super(ADrinks);
        this.type2 = type2;
        this.typeD2 = typeD2;
        this.drinkP2 = drinkP2;
    }

    public String getType2() {

        return type2;
    }

    public String getTypeD2() {

        return typeD2;
    }

    public double getDrinkP2() {

        return drinkP2;
    }


}


