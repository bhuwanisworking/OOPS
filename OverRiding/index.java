public class index {
    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void bark() {
            System.out.println("Animal barked");
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name); // Call the parent class constructor
        }

        @Override
        public void bark() {
            System.out.println("Dog barked");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal("random");
        a.bark(); // Output: Animal barked

        Animal b = new Dog("Tommy");
        b.bark(); // Output: Dog barked
    }
}
