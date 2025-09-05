public class animalclass {
    abstract class Animal {
        abstract void makeSound();
    }
    interface canPounce {
        public void pounce();
    }

    class dog extends Animal {
        void makeSound() {
            System.out.println("Woof");
        }
    }   
    class cat extends Animal implements canPounce {
        void makeSound() {
            System.out.println("Meow");
        }
        public void pounce() {
            System.out.println("The cat pounces!");
        }
    }
    class fox extends Animal implements canPounce{
        void makeSound() {
            System.out.println("Ring-ding-ding-ding-dingerdingerding"); // i don't like that copilot is predicting my jokes
        }
        public void pounce() {
            System.out.println("The fox pounces!");
        }
    } 

    
}
