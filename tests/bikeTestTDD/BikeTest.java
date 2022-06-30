package bikeTestTDD;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//PART I

public class BikeTest {

    private AutoBike iBike;

    @BeforeEach
    void setup() {iBike = new AutoBike();}

    @Test
    @DisplayName("To test that the Bike can be turned On")

    public void turnOn(){

        //When
        iBike.turnOn(true);
        //check
        assertTrue(iBike.setOn());
    }

    @Test
    @DisplayName("To test that the Bike can be turned Off")

    public void turnOff() {
        //When
        iBike.turnOn(false);
        //Check
        assertTrue(iBike.setOn());
    }
    //PART TWO
    @Test
    @DisplayName("To Test that the Bike can be accelerated with an Increment of 1 When on Gear One")

    public void accelerationPlusOne() {
        //When
        iBike.increaseSpeed(19);
        //Check
        assertEquals(20 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 2 When on Gear Two")
    public void accelerationPlusTwo(){

        //when
        iBike.increaseSpeed(25);
        //Check
        assertEquals(27 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 3 When on Gear Three")
    public void accelerationPlusThree(){

        //when
        iBike.increaseSpeed(35);
        //Check
        assertEquals(38 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 4 When on Gear Four")
    public void accelerationPlusFour(){

        //when
        iBike.increaseSpeed(41);
        //Check
        assertEquals(45, iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 1 When on Gear One")

    public void decelerationGearOne() {

        //When
        iBike.decreaseSpeed(15);
        //Check
        assertEquals(14 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 2 When on Gear Two")

    public void decelerationGearTwo() {
        //When
        iBike.decreaseSpeed(23);
        //Check
        assertEquals(21 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 3 When on Gear Three")

    public void decelerationGearThree() {

        //When
        iBike.decreaseSpeed(35);
        //Check
        assertEquals(32 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 4 When on Gear Four")

    public void decelerationGearFour() {

        //When
        iBike.decreaseSpeed(45);
        //Check
        assertEquals(41 , iBike.getCurrentSpeed());
    }


//Part III

    @Test
    @DisplayName("To test the Speed Range for Gear One")
    public void gearOneSpeedRange(){

        //When
        iBike.gearMax(15);
        //Check
        assertEquals( "Gear 1" , iBike.getGearMax());
    }

    @Test
    @DisplayName("To test the Speed Range for Gear Two")
    public void gearTwoSpeedRange(){

        //When
        iBike.gearMax(25);
        //Check
        assertEquals( "Gear 2", iBike.getGearMax());
    }

    @Test
    @DisplayName("To test the Speed Range for Gear Three")
    public void gearThreeSpeedRange(){

        //When
        iBike.gearMax(35);
        //Check
        assertEquals( "Gear 3", iBike.getGearMax());
    }

    @Test
    @DisplayName("To test the Speed Range for Gear One")
    public void gearFOurSpeedRange(){

        //When
        iBike.gearMax(55);
        //Check
        assertEquals( "Gear 4" , iBike.getGearMax());
    }

}
