

public class isp {
    // interface segregatin Principle
    interface Worker{
        // not all workers eat at office 
        void eat();
        void work();
    }
    /*interface Worker2{
    void eat()
    } */
    public static void main(String[] args) {
        // there should be 2 interfaces as if any class wanna extend the Worker class it has to declare the work and eat both functionality in their class 
    }
    
}
