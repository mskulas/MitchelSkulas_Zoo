public class animalclass {
    abstract class Animal {
        abstract void makeSound();
    }

    class dog extends Animal {
        void makeSound() {
            System.out.println("Woof");
        }
    }   
    class cat extends Animal {
        void makeSound() {
            System.out.println("Meow");
        }
    }
    class fox extends Animal {
        void makeSound() {
            System.out.println("Ring-ding-ding-ding-dingerdingerding");
        }
    } // i don't like that copilot is predicting my jokes

    
}
