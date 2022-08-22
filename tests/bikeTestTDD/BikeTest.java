package bikeTestTDD;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

//PART I
public class BikeTest {
    private AutoBike iBike;
    @BeforeEach
    void setup() {iBike = new AutoBike();}

    @Test
    @DisplayName("To test that the Bike can be turned On")
    public void turnOn(){
        assertFalse(iBike.isOn());
        iBike.turnOn();
        assertTrue(iBike.isOn());
    }

    @Test
    @DisplayName("To test that the Bike can be turned Off When Bike is turned Off")
    public void turnOff() {
        assertFalse(iBike.isOn());
        //When Bike is turned On
        iBike.turnOn();
        assertTrue(iBike.isOn());

        //Check that bike can be turned Off
        iBike.turnOff();
        assertFalse(iBike.isOn());
    }

    //PART TWO
    @Test
    @DisplayName("To Test that the Bike can be accelerated with an Increment of 1 When on Gear One")

    public void accelerationPlusOne() {
        iBike.turnOn();

        assertEquals(0, iBike.getCurrentSpeed());
        assertEquals(1, iBike.getGear());

        //When
        iBike.increaseSpeed();
        iBike.increaseSpeed();
        iBike.increaseSpeed();
        iBike.increaseSpeed();
        //Check
        assertEquals(4 , iBike.getCurrentSpeed());
        assertEquals(1, iBike.getGear());
    }

    @Test
    public void bikeWillNotAccelerateWhenOffTest(){
        assertFalse(iBike.isOn());
        assertEquals(0, iBike.getCurrentSpeed()
        );
        iBike.increaseSpeed();
        iBike.increaseSpeed();

        assertEquals(0, iBike.getCurrentSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        iBike.turnOn();
        assertEquals(1, iBike.getGear());

        for (int i = 0; i < 20; i++) {
            iBike.increaseSpeed();
        }
        assertEquals(20, iBike.getCurrentSpeed());
        assertEquals(1, iBike.getGear());
        iBike.increaseSpeed();
        assertEquals(2, iBike.getGear());
        assertEquals(21, iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 2 When on Gear Two")
    public void accelerationPlusTwo(){
        iBike.turnOn();
        assertEquals(1, iBike.getGear());
        //when
        for (int i = 0; i < 21; i++) {
            iBike.increaseSpeed();
        }
        assertEquals(2, iBike.getGear());
        assertEquals(21, iBike.getCurrentSpeed());

        iBike.increaseSpeed();
        iBike.increaseSpeed();
        iBike.increaseSpeed();
        //Check
        assertEquals(2, iBike.getGear());
        assertEquals(27 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 3 When on Gear Three")
    public void accelerationPlusThree(){
        iBike.turnOn();
        //when
        for (int i = 0; i < 25; i++) {
            iBike.increaseSpeed();
        }
        assertEquals(29, iBike.getCurrentSpeed());
        assertEquals(2, iBike.getGear());

        //Check
        iBike.increaseSpeed();
        assertEquals(3, iBike.getGear());
        assertEquals(31 , iBike.getCurrentSpeed());
    }


    @Test
    @DisplayName("To Test That the Bike can be Accelerated with an Increment of 4 When on Gear Four")
    public void accelerationPlusFour(){
        iBike.turnOn();
        //when
        for (int i = 0; i < 29; i++) {
            iBike.increaseSpeed();
        }
        assertEquals(40, iBike.getCurrentSpeed());
        assertEquals(3, iBike.getGear());
        //Check
        iBike.increaseSpeed();
        assertEquals(43, iBike.getCurrentSpeed());
        assertEquals(4, iBike.getGear());

        iBike.increaseSpeed();
        assertEquals(47, iBike.getCurrentSpeed());
        assertEquals(4, iBike.getGear());

        iBike.increaseSpeed();
        iBike.increaseSpeed();
        assertEquals(55, iBike.getCurrentSpeed());
        assertEquals(4, iBike.getGear());
    }


    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 1 When on Gear One")

    public void decelerationGearOne() {

        //When
        iBike.decreaseSpeed();
        //Check
        assertEquals(14 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 2 When on Gear Two")

    public void decelerationGearTwo() {
        //When
        iBike.decreaseSpeed();
        //Check
        assertEquals(21 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 3 When on Gear Three")

    public void decelerationGearThree() {

        //When
        iBike.decreaseSpeed();
        //Check
        assertEquals(32 , iBike.getCurrentSpeed());
    }

    @Test
    @DisplayName("To Test that the Bike can be decelerated with a decrement of 4 When on Gear Four")

    public void decelerationGearFour() {

        //When
        iBike.decreaseSpeed();
        //Check
        assertEquals(41 , iBike.getCurrentSpeed());
    }

}
