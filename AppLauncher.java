public class AppLauncher {
    public static void main(String[] args) {
        animalclass a = new animalclass();
        animalclass.dog dog = a.new dog();
        animalclass.cat cat = a.new cat();
        animalclass.fox fox = a.new fox();

        dog.makeSound();
        cat.makeSound();
        fox.makeSound();
        cat.pounce();
        fox.pounce();
    }
}