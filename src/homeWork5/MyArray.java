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
    private int[] numberArray=new int[1];
    private int count=0;


    public void add(int num){

            int[] temp=this.numberArray;

            this.numberArray=new int[count+1];

            for (int i = 0; i <temp.length ; i++) {
                this.numberArray[i]=temp[i];
            }


               this.numberArray[count] = num;
                count++;


        }



    public int get(int num){
        int whatTOget;

     whatTOget = this.numberArray[num];

        return whatTOget;
    }

    public boolean contains(int num){
        boolean contain=false;

        for (int i: this.numberArray){
            if (i==num){
                contain=true;
                break;
            }
        }

        return contain;
    }

    public void clear(){
        this.numberArray=new int[100];
        count=0;
    }

    public int getSize(){
        int size = 0;

        size=this.numberArray.length;

        return  size;
    }

    public int indexOf(int num){
        int index=-1;
        for (int i = 0; i <this.numberArray.length; i++) {
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

        if(this.numberArray==num){
            equal=true;
        }

        return equal;
    }

    public void sort(){

        for(int i = this.numberArray.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (this.numberArray[j] > this.numberArray[j + 1]) {
                    int tmp = this.numberArray[j];
                    this.numberArray[j] = this.numberArray[j + 1];
                    this.numberArray[j + 1] = tmp;
                }
            }

        }
    }
}
