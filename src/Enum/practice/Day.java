package Enum.practice;

public enum Day {
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");

    private String lower;

    Day(String lower){
        System.out.println("Constructor called");
        this.lower = lower;
    }

    String setLower(String lower) {
        return this.lower.toLowerCase();
    }


}
