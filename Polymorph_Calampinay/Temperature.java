package Polymorph_Calampinay; // Polymorphism with Multilevel Inheritance

 class Temperature {
    public static void main(String[] args) {

        WaterDispenser myTemp = new WaterDispenser();
        WaterDispenser myHeat = new tempHot();
        WaterDispenser myCold = new tempCold();

        myTemp.WDispense();
        myHeat.WDispense();
        myCold.WDispense();



    }
}