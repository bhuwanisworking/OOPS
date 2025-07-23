

public class index {

    public static class Area{
        int length;
        int breadth;
        int height;
        public Area(int length,int breadth,int height){
            this.length=length;
            this.breadth=breadth;
            this.height=height;
        }
        public Area(int length,int breadth){
            this.length=length;
            this.breadth=breadth;
        }
        public void calculate(int length,int breadth,int height){
            System.out.println(length*breadth*height);
        }
        public void calculate(int length,int breadth){
            System.out.println(length*breadth);
        }

    }
    public static void main(String[] args) {
        Area a=new Area(2,2,3);
        a.calculate(3, 3);
        Area b=new Area(2, 2);
        b.calculate(2, 2);

        
    }
    
}
