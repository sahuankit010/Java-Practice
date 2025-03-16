package Enum.practice;

public class P2 {
    public static void main(String[] args) {

        Day sunday = Day.SUNDAY;
        System.out.println(sunday.ordinal());
        System.out.println(sunday.name());
        System.out.println(sunday.setLower(sunday.name()));


    }
}
