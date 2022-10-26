package VendingMach;

public class Drink3 extends DrinksTot {

    private String type3;
    private String typeD3;

    private double drinkP3;


    public Drink3(String ADrinks, String type3, String typeD3, double drinkP3) {
        super(ADrinks);
        this.type3 = type3;
        this.typeD3 = typeD3;
        this.drinkP3 = drinkP3;
    }

    public String getType3() {

        return type3;
    }

    public String getTypeD3() {

        return typeD3;
    }

    public double getDrinkP3() {

        return drinkP3;
    }


}


