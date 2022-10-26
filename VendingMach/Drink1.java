package VendingMach;

public class Drink1 extends DrinksTot  {

    private String type1;
    private String typeD1;

    private double drinkP1;


    public Drink1(String ADrinks, String type1, String typeD1, double drinkP1) {
        super(ADrinks);
        this.type1 = type1;
        this.typeD1 = typeD1;
        this.drinkP1 = drinkP1;
    }

    public String getType1() {

        return type1;
    }

    public String getTypeD1() {

        return typeD1;
    }

    public double getDrinkP1() {

        return drinkP1;
    }


}


