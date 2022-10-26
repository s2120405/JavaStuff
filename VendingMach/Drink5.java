package VendingMach;

public class Drink5 extends DrinksTot  {

    private String type5;
    private String typeD5;

    private double drinkP5;


    public Drink5(String ADrinks, String type5, String typeD5, double drinkP5) {
        super(ADrinks);
        this.type5 = type5;
        this.typeD5 = typeD5;
        this.drinkP5 = drinkP5;
    }

    public String getType5() {

        return type5;
    }

    public String getTypeD5() {

        return typeD5;
    }

    public double getDrinkP5() {

        return drinkP5;
    }


}


