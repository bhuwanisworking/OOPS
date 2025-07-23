import java.util.*;

public class index {
    // java dont have multiple inheritance it have multiple inheritance 
    // to solve the problem we make interfaces
    
    interface swimmable{
        void swim();
    }
    interface runnable{
        void run();
    }
    public static class Duck implements swimmable,runnable{
        @Override
        public void swim(){
            System.out.println("it can swim easily");
        }
        @Override
       public void run(){
            System.out.println("it can run too");
        }

    }
    public static void main(String[] args) {
        Duck d=new Duck();
        d.swim();
        d.run();

        
    }
    
}
