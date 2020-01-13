package HomeWork8_Fibo;

public class MyFibo {
    public static void main(String[] args) {


        System.out.println(getFiboOf(35));

    }

    private static long getFiboOf(int index){
        if(index==1 || index==2){
            return 1;
        }else {
            return (getFiboOf(index-1) +getFiboOf(index-2));
        }
    }
}
