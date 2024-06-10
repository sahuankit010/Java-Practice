package oops;

public class ThisExample {
    private int value1, value2;

    static int Count = 0;

    ThisExample(){
        Count++;
        this.value1 = 0;
        this.value2 = 0;
    }

    ThisExample(int x, int y){
        this();
        this.value1 = x;
        this.value2 = y;
    }

    int getSum (){
        return this.value1 + this.value2;
    }

    public static void main(String[] args) {

        ThisExample te1 = new ThisExample();
        System.out.println(te1.getSum());

        ThisExample te2 = new ThisExample(3, 5);

        System.out.println(te2.getSum());

        System.out.println(ThisExample.Count);
    }
}
