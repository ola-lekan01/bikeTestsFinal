package bikeTestTDD;

public class AutoBike {
    private boolean isOn;
    private int speed, gear;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        gear = 1;
    }

    public void turnOff() {
        isOn = false;
        gear = 0;
        speed = 0;
    }
    public int getGear() {
        return gear;
    }
    public int getCurrentSpeed() {
        return this.speed;
    }

    public void decreaseSpeed(){
        if (isOn) {
            decelerate();
        }
    }

    private void decelerate() {
        if (gear == 1) speed--;
        else if(gear == 2) decelerateGearAndSpeedOnGearTwo();
        else if(gear == 3)  decelerateGearAndSpeedOnGearThree();
        else if (gear == 4) decelerateGearAndSpeedOnFour();
    }

    private void decelerateGearAndSpeedOnFour(){
        speed -= 4;
        if(speed <= 40) gear--;
    }

    private void decelerateGearAndSpeedOnGearThree(){
        speed -= 3;
        if(speed <= 30) gear--;
    }


    private void decelerateGearAndSpeedOnGearTwo(){
        speed -= 2;
        if (speed <= 20) gear--;
    }

    public void increaseSpeed(){
        if (isOn) {
            accelerate();
        }
    }
    private void accelerate(){
        if (gear == 1) increaseSpeedOnOnGearOne();
        else if (gear == 2) increaseSpeedOnGearTwo();
        else if (gear == 3) increaseSpeedOnGearThree();
        else if (gear == 4) increaseSpeedOnGearFour();
    }

    private void increaseSpeedOnOnGearOne() {
        speed++;
        if (speed > 20) gear++;
    }
    private void increaseSpeedOnGearTwo() {
        speed += 2;
        if (speed >= 31) gear++;
    }
    private void increaseSpeedOnGearThree() {
        speed += 3;
        if (speed >= 41) gear++;
    }
    private void increaseSpeedOnGearFour() {
        speed += 4;
    }
}