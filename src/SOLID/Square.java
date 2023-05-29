package SOLID;
public class Square implements Shape{
    private final int length;

    public Square(int length){
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
