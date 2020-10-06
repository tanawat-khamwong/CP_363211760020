package Lab7;
public class RectangleApp {
    public static void  main (String[] args){
        //create object
        Rectangle recl = new Rectangle();
        recl.setLength(20.0);
        recl.setWidth(10.0);
        System.out.println(recl.getLength());
        System.out.println(recl.getWidth());
        System.out.println(recl.getArea());
        Rectangle rec2 = new Rectangle(10.0,5.0);
        System.out.println(rec2.getLength());
        System.out.println(rec2.getWidth());
        System.out.println(rec2.getArea());



    }//main
}//class