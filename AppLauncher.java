import java.util.ArrayList;

public class AppLauncher {
    public static void main(String[] args) {
        animalclass a = new animalclass();
        animalclass.dog Diesel = a.new dog("Diesel", "Boxer");
        animalclass.dog Lucky = a.new dog("Lucky", "Chihuahua");
        animalclass.cat Cocoamass = a.new cat("Cocoamass", "Havana Brown");
        animalclass.fox Foxy = a.new fox("Foxy", "Red Fox"); // what do people even name foxes?
        animalclass.orangeCat Jambo = a.new orangeCat("Jambo");
        
        ArrayList<animalclass.Animal> zoo = new ArrayList<animalclass.Animal>();
        zoo.add(Diesel);
        zoo.add(Lucky);
        zoo.add(Cocoamass);
        zoo.add(Foxy);
        zoo.add(Jambo);

        System.out.println();
        for (animalclass.Animal animal : zoo) {
            System.out.print(animal.getName() + " the " + animal.getBreed() + " says: "); // this does result in "Jambo the orange" which is not grammatically correct, but it's funny so I'm not fixing it.
            animal.makeSound();
            if (animal instanceof animalclass.canPounce) {
                ((animalclass.canPounce) animal).pounce();
            }
            if (animal instanceof animalclass.canFetch) {
                ((animalclass.canFetch) animal).fetch();
            }
            System.out.println();
        }
    }
}