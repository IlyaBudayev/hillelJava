package HomeWork8_Fibo;

import java.math.BigInteger;

public class MyFibo {

   static int yourNumber=100;

    public static void main(String[] args) {



        System.out.println(calculateFib(yourNumber));

    }

    private static long getFiboOf(int index){
        if(index==1 || index==2){
            return 1;
        }else {
            return (getFiboOf(index-1) +getFiboOf(index-2));
        }
    }

    public static BigInteger[] cache = new BigInteger[yourNumber+1];

    public static BigInteger calculateFib(int ind){
        if(cache[ind]!=null){
            return cache[ind];
        }else if(ind==0||ind==1||ind==2){
             cache[ind]= BigInteger.valueOf(1);
            return BigInteger.valueOf(1);

        }else if(ind>2) {
            BigInteger resultat= (calculateFib(ind-1).add(calculateFib(ind-2)));
            cache[ind]=resultat;
            return cache[ind];
        }
        return cache[ind];
    }
}
