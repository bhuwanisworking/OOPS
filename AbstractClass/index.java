

public class index {
    abstract static class Animal{
        // this is an abstract class and this is abstract method its defintion is defined in the subclass or child class
        abstract void bark(); 

        // this is a concrete class it will be used by all subclass 
        void sleep(){
            System.out.println("Sleeping ");
        }
    }
    static class Dog extends Animal{
        @Override
        public void bark(){
            System.out.println("Dog is barking ");
        }
    }
    public static void main(String[] args) {
        // we cant make instance of an abstract class like Animal
        Dog d =new Dog();
        d.bark();
        
    }
    
}
