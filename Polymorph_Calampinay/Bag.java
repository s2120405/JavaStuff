package Polymorph_Calampinay; // Polymorphism with Multilevel Inheritance

 class Bag {
    public static void main(String[] args) {

        Collection myCollection = new Collection();
        Collection myCopper = new Copper();
        Collection myAluminum = new Aluminum();

        myCollection.allCollection();
        myCopper.allCollection();
        myAluminum.allCollection();



    }
}