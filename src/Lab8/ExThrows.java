package Lab8;

public class ExThrows {
    public static void main (String[]args){
        int x=10;
        int y=0;

        try {
            int r = divide(x,y);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //connect DB
            //close connection
            System.out.println("Test Finally");
        }

    }

    private static int divide(int x, int y)throws  Exception{
        return x / y; //11/0


    }

}
