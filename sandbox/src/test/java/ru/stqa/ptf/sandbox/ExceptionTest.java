package ru.stqa.ptf.sandbox;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test
    public void testKey() {
        Car car = new Car();
        try {
            car.openDoor("1234566");

        } catch (RuntimeException e) {
           String x =  e.getMessage();
            System.out.println( " openDoor method thrown an expection with a message "  + x);
            System.out.println("But is continue the execution of programm");
        }
    }
}
