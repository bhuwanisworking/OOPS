public class demo {

    public static class A {
        String name;
        public A(String name) {
            this.name = name;
        }
        public void walk() {
            System.out.println(this.name + " is walking");
        }
    }

    public static class B extends A {
        public B(String name) {
            // super will call the constructor of the parent class 
            super(name); 
        }
    }

    public static void main(String[] args) {
        A a = new A("bhuwan");
        a.walk();  // bhuwan is walking

        B b = new B("ashish");
        b.walk();  // ashish is walking
    }
}
