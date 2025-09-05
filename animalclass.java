/**
 * The main class containing animal-related classes and interfaces for the zoo application.
 */
public class animalclass {
    /**
     * Abstract base class representing a generic animal.
     */
    abstract class Animal {
        /**
         * Makes the sound specific to the animal.
         */
        abstract void makeSound();
        private String name;
        private String breed;

        /**
         * Gets the breed of the animal.
         * @return the breed
         */
        public String getBreed() {
            return breed;
        }

        /**
         * Sets the breed of the animal.
         * @param breed the breed to set
         */
        public void setBreed(String breed) {
            this.breed = breed;
        }

        /**
         * Gets the name of the animal.
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the name of the animal.
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Interface for animals that can pounce.
     */
    interface canPounce {
        /**
         * Performs a pounce action.
         */
        public void pounce();
    }

    /**
     * Interface for animals that can fetch.
     */
    interface canFetch {
        /**
         * Performs a fetch action.
         */
        public void fetch();
    }


    /**
     * Class representing a dog, which can fetch.
     */
    class dog extends Animal implements canFetch {
        /**
         * Constructs a dog with the given name and breed.
         * @param name the name of the dog
         * @param breed the breed of the dog
         */
        public dog(String name, String breed) {
            setName(name);
            setBreed(breed);
        }

        /**
         * Makes the dog sound (woof).
         */
        void makeSound() {
            System.out.println("Woof");
        }

        /**
         * Performs the fetch action for the dog.
         */
        public void fetch() {
            System.out.println(this.getName() + " is fetching the ball!");
        }
    }

    /**
     * Class representing a cat, which can pounce.
     */
    class cat extends Animal implements canPounce {
        /**
         * Constructs a cat with the given name and breed.
         * @param name the name of the cat
         * @param breed the breed of the cat
         */
        public cat(String name, String breed) {
            setName(name);
            setBreed(breed);
            if (breed.equals("orange")) {
                setBreed("Red Tabby"); // this is to avoid confusion with the orangeCat subclass. orange is not a color, it is a mindset.
            }
        }

        /**
         * Makes the cat sound (meow).
         */
        void makeSound() {
            System.out.println("Meow");
        }

        /**
         * Performs the pounce action for the cat.
         */
        public void pounce() {
            System.out.println(this.getName() + " pounces!");
        }
    }

    /**
     * Class representing a fox, which can fetch and pounce.
     */
    class fox extends Animal implements canPounce, canFetch {
        /**
         * Constructs a fox with the given name and breed.
         * @param name the name of the fox
         * @param breed the breed of the fox
         */
        public fox(String name, String breed) {
            setName(name);
            setBreed(breed);
        }

        /**
         * Makes the fox sound (what does it say).
         */
        void makeSound() {
            System.out.println("Ring-ding-ding-ding-dingerdingerding"); // i don't like that copilot is predicting my jokes
        }

        /**
         * Performs the pounce action for the fox.
         */
        public void pounce() {
            System.out.println(this.getName() + " pounces!");
        }

        /**
         * Performs the fetch action for the fox.
         */
        public void fetch() {
            System.out.println(this.getName() + " is fetching the fox ball!"); // foxes can fetch too, you know.
        }
    }

    /**
     * Class representing an orange cat, a special type of cat.
     */
    class orangeCat extends cat {
        /**
         * Constructs an orange cat with the given name. Orange cats are always orange.
         * @param name the name of the orange cat
         */
        public orangeCat(String name) {
            super(name, "orange"); // orange cats are always orange, no exceptions.
        }

        /**
         * Performs the pounce action for the orange cat, with a unique behavior.
         */
        @Override
        public void pounce() {
            System.out.println(this.getName() + " pounces and misses!"); // orange cats are generally more chaotic and less smart. no brain cells.
        }
    }

    
}
