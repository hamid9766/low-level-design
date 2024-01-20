package Gfg;

import java.util.ArrayList;
import java.util.List;

public class ClosestPerfectNumbers {
    public static List<Integer> getListOfPerfectNumbers(int n){
        List<Integer> list = new ArrayList<>();

        for(int i = (int)Math.sqrt(n); i>0; i--){
            int square = i*i;
            while(n>=square){
                list.add(square);
                n -= square;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> l = getListOfPerfectNumbers(1000);
        System.out.println(l);
    }
}
