package examples;

class Vehicle {
    protected String brand = "Ford";
    protected String modelName;

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Main extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Vehicle myFastCar = new Vehicle();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
