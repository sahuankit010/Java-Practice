
/**
 * @author Ankit Sahu
 */
package axs210226;

interface Vehicle{
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{

    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int inc) {
        speed += inc;
    }

    @Override
    public void applyBrakes(int dec) {
        speed -= dec;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + this.gear);
    }
}

class Bike implements Vehicle{

    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int inc) {
        speed += inc;
    }

    @Override
    public void applyBrakes(int dec) {
        speed -= dec;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + this.gear);
    }
}
public class InterfaceExample1 {

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        //just checking the implementation of hashcode method of java
        System.out.println(bicycle.hashCode() == 149928006);
        System.out.println(bicycle.hashCode());
        System.out.println(bicycle.hashCode());
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}
