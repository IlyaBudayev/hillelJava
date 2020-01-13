package HomeWork8_Fibo;

import javafx.scene.chart.ScatterChart;

public class MyFibo {
    public static void main(String[] args) {


        System.out.println(calculateFib(35));

    }

    private static long getFiboOf(int index){
        if(index==1 || index==2){
            return 1;
        }else {
            return (getFiboOf(index-1) +getFiboOf(index-2));
        }
    }

    public static long[] cache = new long[51];

    public static long calculateFib(int ind){
        if(cache[ind]!=0){
            return cache[ind];
        }else if(ind==0||ind==1||ind==2){
             cache[ind]=1;
            return 1;

        }else if(ind>2) {
            long resultat= (calculateFib(ind-1) +calculateFib(ind-2));
            cache[ind]=resultat;
            return cache[ind];
        }
        return cache[ind];
    }
}
