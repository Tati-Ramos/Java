package examples;

 class ModifierDefault {
    String fname = "John";
    String lname = "Doe";
    String email = "john@doe.com";
    int age = 26;

    public static void main(String[] args) {
        ModifierDefault myObj = new ModifierDefault();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
