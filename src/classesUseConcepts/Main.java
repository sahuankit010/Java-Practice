package classesUseConcepts;

public class Main {

    Main(int first, int second){
    }
    Main(){
        this(2, 3);
    }

    Main print(){
        return this;
    }

    public static void main(String[] args) {
        Main obj = new Main(1, 2);
    }
}
