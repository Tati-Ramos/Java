package examples;

/*
Enum in a Switch Statement
Enums are often used in switch statements to check for corresponding values:
 */

 enum Nivel {
    LOW,
    MEDIUM,
    HIGH
}
 class Origin {
    public static void main(String[] args) {
        Nivel myVar = Nivel.MEDIUM;


        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }


}