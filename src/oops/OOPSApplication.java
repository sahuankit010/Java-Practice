package oops;

class Product{
    private static int pid;
    private String name;
    private int price;

    void setProductDetails(String name, int price) {
        this.pid = this.pid + 1;
        this.name = name;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void getDetails(){
        System.out.println(pid + " " + name + " " + price + " USD");
    }
}

class Mobile extends Product{

    private int ram;
    private String OS;
    void setProductDetails(String name, int price, int ram, String OS) {
        super.setProductDetails(name, price);
        this.ram = ram;
        this.OS= OS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void getDetails(){
        super.getDetails();
        System.out.println(ram+ " GB "+ OS);
    }
}

public class OOPSApplication {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setProductDetails("iPhone X", 1000, 128, "M2");
        mobile.getDetails();
    }
}
