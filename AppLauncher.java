public class AppLauncher {
    public static void main(String[] args) {
        animalclass a = new animalclass();
        animalclass.Animal dog = a.new dog();
        animalclass.Animal cat = a.new cat();
        animalclass.Animal fox = a.new fox();

        dog.makeSound();
        cat.makeSound();
        fox.makeSound();
    }
}