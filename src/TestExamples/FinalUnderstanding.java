package TestExamples;

public class FinalUnderstanding {

    final int x;

    public FinalUnderstanding(int x) {
        this.x = x;
//        this.x = 5;
    }

    final void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        FinalUnderstanding finalUnderstanding = new FinalUnderstanding(5);
    }


}
