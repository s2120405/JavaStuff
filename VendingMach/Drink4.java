package VendingMach;

public class Drink4 extends DrinksTot {

    private String type4;
    private String typeD4;

    private double drinkP4;


    public Drink4(String ADrinks, String type4, String typeD4, double drinkP4) {
        super(ADrinks);
        this.type4 = type4;
        this.typeD4 = typeD4;
        this.drinkP4 = drinkP4;
    }

    public String getType4() {

        return type4;
    }

    public String getTypeD4() {

        return typeD4;
    }

    public double getDrinkP4() {

        return drinkP4;
    }


}


