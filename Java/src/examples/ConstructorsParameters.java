package examples;

public class ConstructorsParameters {
    int modelYear;
    String modelName;

    public ConstructorsParameters(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorsParameters myCar = new ConstructorsParameters(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

// Outputs 1969 Mustang

