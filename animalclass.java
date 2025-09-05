public class animalclass {
    abstract class Animal {
        abstract void makeSound();
        private String name;
        private String breed;
        public String getBreed() {
            return breed;
        }
        public void setBreed(String breed) {
            this.breed = breed;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    interface canPounce {
        public void pounce();
    }
    interface canFetch {
        public void fetch();
    }

    class dog extends Animal implements canFetch {
        public dog(String name, String breed) {
            setName(name);
            setBreed(breed);
        }
        
        void makeSound() {
            System.out.println("Woof");
        }

        public void fetch() {
            System.out.println(this.getName() + " is fetching the ball!");
        }
    }   
    class cat extends Animal implements canPounce {
        public cat(String name, String breed) {
            setName(name);
            setBreed(breed);
            if (breed.equals("orange")) {
                setBreed("Red Tabby"); // this is to avoid confusion with the orangeCat subclass. orange is not a color, it is a mindset.
            }
        }
        void makeSound() {
            System.out.println("Meow");
        }
        public void pounce() {
            System.out.println(this.getName() + " pounces!");
        }
    }
    class fox extends Animal implements canPounce, canFetch {
        public fox(String name, String breed) {
            setName(name);
            setBreed(breed);
        }
        void makeSound() {
            System.out.println("Ring-ding-ding-ding-dingerdingerding"); // i don't like that copilot is predicting my jokes
        }
        public void pounce() {
            System.out.println(this.getName() + " pounces!");
        }
        public void fetch() {
            System.out.println(this.getName() + " is fetching the fox ball!"); // foxes can fetch too, you know.
        }
    } 

    class orangeCat extends cat {
        public orangeCat(String name) {
            super(name, "orange"); // orange cats are always orange, no exceptions.
        }
        @Override public void pounce() {
            System.out.println(this.getName() + " pounces and misses!"); // orange cats are generally more chaotic and less smart. no brain cells.
        }
    }

    
}
