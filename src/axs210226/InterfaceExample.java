
package axs210226;

interface Player{
    final int id = 10;
    int move();
}
public class InterfaceExample implements Player{

    public static void main(String[] args){
        System.out.println("Main Method");
        InterfaceExample ie = new InterfaceExample();
        System.out.println(ie.move());
    }

    @Override
    public int move() {
        System.out.println("Interface Player Implemented");
        return id;
    }
}
