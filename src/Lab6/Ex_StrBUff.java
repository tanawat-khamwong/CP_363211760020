package Lab6;

public class Ex_StrBUff {

    public static Void main(String[] args) {

        StringBuffer strbuf = new StringBuffer();// null
        strbuf.append("I studying at RUTS");
        System.out.println(strbuf.length());

        strbuf.append("2020");
        System.out.println(strbuf);

        strbuf.insert(0,"My name is Bank");
        System.out.println(strbuf);

        strbuf.delete(14,26);
        System.out.println(strbuf);
    }
}


