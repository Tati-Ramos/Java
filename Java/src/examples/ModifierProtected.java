package examples;

class ModifierProtected {
    protected String fname = "John";
    protected String lname = "Ramos";
    protected String email = "john@Ramos.com";
    protected int age = 27;
}

class Student extends ModifierProtected{
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }

}
