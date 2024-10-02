package com.campusdual.classroom;

public class Car {
    String brand;
    String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}
    public boolean isTachometerEqualToZero(){
        if (this.tachometer == 0){
            return true;
        }else {
            return false;
        }
    }
    public  boolean isTachometerGreaterThanZero(){
        if (this.tachometer>0){
            return true;
        }else {
            return false;
        }
    }
    public void start() {
        if (this.speedometer == 0 && this.tachometer==0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("O vehículo xa está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer < 120 && this.tachometer == 1000){
            this.speedometer +=10;
        }
    }

    public void brake() {
        if (this.speedometer>0 && this.tachometer == 1000 ){
            this.speedometer -= 10;
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle <= 45 && angle >= -45) {
            this.wheelsAngle = angle;
        }else if (angle > 45){
            this.wheelsAngle = 45;
        }else{
            this.wheelsAngle = -45;
        }
    }

    public String showSteeringWheelDetail() {
        return "Ángulo actual del volante: " + this.wheelsAngle + " grados";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse == true && this.speedometer == 0){
            this.gear = "R";
        }else {
            this.gear = "N";
        }
        this.reverse = reverse;

    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocímetro: " + this.speedometer);
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
        System.out.println("Reversa: " + (this.reverse ? "Sí" : "No"));
        System.out.println(showSteeringWheelDetail());
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");
        myCar.start();
        myCar.showDetails();
        myCar.stop();
    }
}

