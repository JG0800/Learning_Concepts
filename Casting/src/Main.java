public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();//Upcast Subklasse Dog wird in die Superklasse Animal gecastet
        Animal myCat = new Cat();
        doAnimalStuff(myDog); //weil
    }

    public static void doAnimalStuff(Animal animal){
        /*erwartet einen Parameter aus der Klasse Animal, durch den Upcast kann man aus einer Klasse die gleiche Methode mit verschiedenen Werten ausgeben
        ohne Upcast müsste hier Dog.makeNoise() oder Cat.makeNoise() stehen*/
        animal.makeNoise();
        if (animal instanceof Dog){
            Dog myDog = (Dog)animal;
            myDog.growl();
        }

    }
}
