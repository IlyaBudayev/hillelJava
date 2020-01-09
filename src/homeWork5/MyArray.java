package homeWork5;


//добавлять (add),
//доставать по индексу (get),
//проверять наличие элемента (contains),
//добавлять все элементы из другого контейнера (addAll)
//проверять на равенство (equals)
//очищать (clear)
//находить индекс элемента (find or indexOf)
//узнавать размер (getSize)
//сортировать (sort) (это очень важный вопрос его нужно хорошо продумать)


public class MyArray {
    private int[] numberArray=new int[0];
    private int count =0;
    //count - счетчик для контроля размера нового массива!


    public void add(int num){


        int[] temp=numberArray;

        numberArray=new int[count+1];

        for (int i = 0; i <temp.length ; i++) {
            numberArray[i]=temp[i];
        }


        numberArray[count] = num;
        count++;


        }



    public int get(int num){
        int whatTOget=0;
        if (numberArray.length<num) {
        whatTOget = numberArray[num];
        return whatTOget;
      }else {
            System.out.println("OUT of BOUND EXCEPTION");
        }

            return whatTOget;

    }

    public boolean contains(int num){
        boolean contain=false;

        for (int i: numberArray){
            if (i==num){
                contain=true;
                break;
            }
        }

        return contain;
    }

    public void clear(){
        numberArray=new int[0];
        count=0;
    }

    public int getSize(){
       int size=numberArray.length;

        return  size;
    }

    public int indexOf(int num){
        int index=-1;
        for (int i = 0; i <numberArray.length; i++) {
            if(numberArray[i]==num){
                index=i;
                break;
            }
        }
        return index;

    }

    public void addAll(int[] array){

       for(int i: array){
           add(i);
       }

    }

    public boolean equals(int[] num){

        boolean equal=false;

        if(this.numberArray.equals(num)){
            equal=true;
        }

        return equal;
    }

    public void sort(){

        for(int i = numberArray.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (this.numberArray[j] > numberArray[j + 1]) {
                    int tmp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = tmp;
                }
            }

        }
    }
    @Override
    public String toString(){
        String s="";

        for (int i: numberArray
             ) {
            s=s+i+" ";
        }

        return s;
    }
}
