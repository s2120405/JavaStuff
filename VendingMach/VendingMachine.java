package VendingMach;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {


        Scanner item = new Scanner(System.in);
        Scanner cash = new Scanner(System.in);
        Scanner more = new Scanner(System.in);

        double[] Transac = new double[2];
        Transac[0] = 0.00;
        Transac[1] = 0.00;


        double price = 0.00;

        Drink1 drink1 = new Drink1("Carbonated Drink", "Hill Dew", "Citrus Carbonated Soft Drink manufactured in Antarctica.", 15.35);
        Drink2 drink2 = new Drink2("Carbonated Drink", "Popa Cola", "Carbonated Soft Drink", 18.20);
        Drink3 drink3 = new Drink3("Dairy", "Moo Milk", "Refreshing sweetened milk from rare flying cows.", 20.15);
        Drink4 drink4 = new Drink4("Bottled Water", "Bonnie's Mineral Water", "Fresh spring water taken from a recently discovered cave deep in the Earth's mantle.", 20.50);
        Drink5 drink5 = new Drink5("Fruit Juice", "6 Seasons Fruit Punch", "Experience the taste of the 4 seasons and more.", 25.30);


        System.out.print("Please Enter Amount Of Cash: ");
        Transac[0] = cash.nextDouble();

        System.out.println(" ");
        System.out.println("AVAILABLE DRINKS");
        System.out.println("-------------------");
        System.out.println("Drink #1");
        System.out.println(drink1.getADrinks());
        System.out.println(drink1.getType1());
        System.out.println(drink1.getTypeD1());
        System.out.println(drink1.getDrinkP1() + " PHP");
        System.out.println("-------------------");
        System.out.println("Drink #2");
        System.out.println(drink2.getADrinks());
        System.out.println(drink2.getType2());
        System.out.println(drink2.getTypeD2());
        System.out.println(drink2.getDrinkP2() + " PHP");
        System.out.println("-------------------");
        System.out.println("Drink #3");
        System.out.println(drink3.getADrinks());
        System.out.println(drink3.getType3());
        System.out.println(drink3.getTypeD3());
        System.out.println(drink3.getDrinkP3() + " PHP");
        System.out.println("-------------------");
        System.out.println("Drink #4");
        System.out.println(drink4.getADrinks());
        System.out.println(drink4.getType4());
        System.out.println(drink4.getTypeD4());
        System.out.println(drink4.getDrinkP4() + " PHP");
        System.out.println("-------------------");
        System.out.println("Drink #5");
        System.out.println(drink5.getADrinks());
        System.out.println(drink5.getType5());
        System.out.println(drink5.getTypeD5());
        System.out.println(drink5.getDrinkP5() + " PHP");
        System.out.println("-------------------");
        System.out.println("Your Cash is: " + Transac[0]);

        for (int i = 0; i < 999; i++) {

            for (int x = 0; x < 999; x++) {
                System.out.println("****************");
                System.out.print("Press the number of your desired drink or press [0] to cancel: ");
                int num = item.nextInt();

                if (num == 1) {
                    System.out.println("****************");
                    System.out.print("You have chosen: ");
                    System.out.println(drink1.getType1());
                    System.out.println(drink1.getDrinkP1() + " PHP");

                    price = drink1.getDrinkP1();
                    if (price < Transac[0]) {
                        Transac[1] = price + Transac[1];


                    } break;
                } else if (num == 2) {
                    System.out.println("****************");
                    System.out.print("You have chosen: ");
                    System.out.println(drink2.getType2());
                    System.out.println(drink2.getDrinkP2() + " PHP");

                    price = drink2.getDrinkP2();
                    if (price < Transac[0]) {
                        Transac[1] = price + Transac[1];
                    }
                    break;
                } else if (num == 3) {
                    System.out.println("****************");
                    System.out.print("You have chosen: ");
                    System.out.println(drink3.getType3());
                    System.out.println(drink3.getDrinkP3() + " PHP");

                    price = drink3.getDrinkP3();
                    if (price < Transac[0]) {
                        Transac[1] = price + Transac[1];
                    }
                    break;
                } else if (num == 4) {
                    System.out.println("****************");
                    System.out.print("You have chosen: ");
                    System.out.println(drink4.getType4());
                    System.out.println(drink4.getDrinkP4() + " PHP");

                    price = drink4.getDrinkP4();
                    if (price < Transac[0]) {
                        Transac[1] = price + Transac[1];
                    }
                    break;
                } else if (num == 5) {
                    System.out.println("****************");
                    System.out.print("You have chosen: ");
                    System.out.println(drink5.getType5());
                    System.out.println(drink5.getDrinkP5() + " PHP");

                    price = drink5.getDrinkP5();
                    if (price < Transac[0]) {
                        Transac[1] = price + Transac[1];
                    }
                    break;
                } else if (num == 0) {
                    price = 0;
                    i = 999;
                    break;
                } else {
                    System.out.println("Error! please select a valid number.");
                }
            }
            if (price > Transac[0]) {
                System.out.println("****************");
                System.out.println("Not enough funds. Would you like to add more? Press [1] for yes or Press [2] for no");
                int num2 = item.nextInt();
                if (num2 == 1) {
                    System.out.println("****************");
                    System.out.print("Please Enter Amount: ");
                    double extra = more.nextDouble();
                    Transac[0] = extra + Transac[0];
                    System.out.println("Current total cash: " + Transac[0]);
                } else if (num2 == 2) {
                    System.out.println("Thank you for your purchase.");
                    System.out.println("Total amount of purchase: " + Transac[1]);
                    break;
                }
            } else if (price <= Transac[0]) {
                Transac[0] = Transac[0] - price;
                System.out.println("Your Change is:  " + Transac[0]);
                System.out.println("Total amount of purchase: " + Transac[1]);
            } else {
                System.out.println("Thank you for your purchase.");
                System.out.println("Total amount of purchase: " + Transac[1]);
                break;
            }

        }

    }
}