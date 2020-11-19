package ru.stqa.ptf.sandbox;

public class Car {
    private String secretLock = "123";

    public void openDoor( String key) throws RuntimeException{

        if(key.equals(secretLock)) {
            System.out.println("Door is opened");
        } else {
            throw new RuntimeException("Key is not valid");
        }

    }

    public void startEnngine() {
        System.out.println(" The car has started");
    }
}
