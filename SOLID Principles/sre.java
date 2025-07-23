

public class sre {
    public static class Invoice{
        void print(){
            System.out.println("print should be handled here");
        }
        // this violate the rule as print and save both are being handled here
        // so in futute if we have to change something in save this class also need cahnges which is not good
        void save(){
            System.out.println("save is also being handled here");
        }
    }
    public static void main(String[] args) {
        // SRE Single Responsibility Principle
        // one class should handle one responsibilty
        // one class should have only one actor or reason to change
        Invoice i=new Invoice();
        i.print();
        i.save();

    }
    
}
