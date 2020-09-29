package Lab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

// sorting คือการเรียงลำดับข้อมูล
public class ArraySorting {
    public static void main (String[] args){

        int number[] ={10, 20, 30, 40, 50};

        //ascending น้อย-มาก
        Arrays.sort (number);

        for (int val :number){
            System.out.println(val+"");

        }
        System.out.println();

        //descending มาก-น้อย

        Integer n[]=new Integer[number.length];
        int i =0;
        for (int v:number){ //int-->Integer
            n[i++] = Integer.valueOf(v);
        }
        Arrays.sort(n, Collections.reverseOrder());
        System.out.println(Arrays.toString(n));

        int x[][]={{1,2,3},
                    {4,5,6}};
        System.out.println(Arrays.toString(x[0]));










    }
}
