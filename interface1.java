import javax.swing.text.html.HTMLDocument.RunElement;

// package com.company;

interface Bicycle{
    int a = 45;
    int applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    // public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public int applyBrake(int decrement){
        System.out.println("Applying Brake");
        return x-decrement;

    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class interface1 {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        // cycleHarry.applyBrake(1);
        // System.out.println(cycleHarry.applyBrake(1));
        // You can create properties in Interfaces
        // System.out.println(cycleHarry.a);
        // System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
