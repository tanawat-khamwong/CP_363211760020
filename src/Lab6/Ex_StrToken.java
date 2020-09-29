package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {
    public static void main(System[] args) {

        String msg="Working hard is important. But there is something that matters, even more, believing in yourself.";
    System.out.println(msg.length());

        StringTokenizer myToken =new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); //return word count as integer

        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());



    }
}












}
