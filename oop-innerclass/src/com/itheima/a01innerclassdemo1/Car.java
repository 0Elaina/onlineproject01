package com.itheima.a01innerclassdemo1;

import java.sql.SQLOutput;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(){
        System.out.println(carName + ", " + carAge + ", " + carColor);
        e.show();
    }

    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    Engine e = new Engine("jz",1);






    class Engine{
        private String engineName;
        private int engineAge;

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

        public void show(){
            System.out.println(engineName + ", " + engineAge);



        }
    }
}
