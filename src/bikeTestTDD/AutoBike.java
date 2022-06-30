package bikeTestTDD;

public class AutoBike {


    private boolean isOn;
    private int speed = -1;
    private String gear;


    public void turnOn(boolean startEngine) {

    }

    public boolean setOn() {
        if (isOn = true) {
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int speed){

        if (speed >= 0 && speed < 20) {
            this.speed = speed + 1;
        } else if (speed >= 21 && speed <= 30) {
            this.speed = speed + 2;
        } else if (speed >= 31 && speed <= 40) {
            this.speed = speed + 3;
        } else {
            this.speed = speed + 4;
        }
    }

    public void decreaseSpeed(int speed){

        if (speed >= 0 && speed < 20) {
            this.speed = speed - 1;
        } else if (speed >= 21 && speed <= 30) {
            this.speed = speed - 2;
        } else if (speed >= 31 && speed <= 40) {
            this.speed = speed - 3;
        } else  {
            this.speed = speed - 4;
        }
    }

    public void gearMax(int speed) {
        if (speed >= 0 && speed < 20) {
            gear = "Gear 1";
        } else if (speed >= 21 && speed <= 30) {
            gear = "Gear 2";
        } else if (speed >= 31 && speed <= 40) {
            gear = "Gear 3";
        } else  {
            gear = "Gear 4";
        }

    }
    public String getGearMax() {
        return gear;
    }
}

