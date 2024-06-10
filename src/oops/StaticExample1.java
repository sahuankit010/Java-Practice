package oops;

public class StaticExample1 {

    private static int instances;

    static{

        System.out.println("Class StaticExample1");
    }

    StaticExample1(){
        this.instances++;
    }

    public static void main(String[] args){
        for(int i=0; i<100; i++){
            new StaticExample1();
        }

        System.out.println(StaticExample1.instances);

    }
}
