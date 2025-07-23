public class Human {
    public static  class Student{
        private String name;
        private int age;

        public Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        public void setname(String name){
            this.name=name;
        }
        public void setage(int age){
            this.age=age;
        }
    }
    public static void main(String[] args) {
        // Encapsulation(Hiding the Data so that we can use set and get )
        Student h1=new Student("bhuwan",100);
        // h1.name="bhuwan";
        // h1.age=100; these 2 lines are invalid as they are private filed
        h1.setage(1000);

        
        
    }
    
}
