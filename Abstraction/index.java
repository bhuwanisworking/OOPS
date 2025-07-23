

public class index {
    public static class Animal{
        String name;
        public Animal(String name){
            this.name=name;
        }
        //  abstraction is hiding like how this bark function works user can simply use bark
        // like a remote we only press the button but dont know the working
        public void bark(){
            System.out.println("Dog is Barking");
        }
    }
    public static void main(String[] args) {
        Animal a=new Animal("turtle");
        a.bark();
        
    }
    
}
