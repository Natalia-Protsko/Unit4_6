package com.practicaljava.lesson6;

/**
 * Created by nata on 18.04.2017.
 */
public class Contractor extends Person implements Payable {
    public Contractor(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        if (percent>Payable.INCREASE_CAP){
            System.out.println("Sorry, can't increase on "+percent+". "+getName());
            return false;
        }
        else {
            System.out.println("Increasing salary by " + percent + "%. " + getName());
            return true;
        }
    }

}
