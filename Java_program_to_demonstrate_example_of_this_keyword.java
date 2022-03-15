//Java program to demonstrate use of this keyword

public class Java_program_to_demonstrate_example_of_this_keyword {
    private String name;
    private int age;
    private float weight;

    //without using this keywords
    // public void getDetailsWithoutThis(String name, int age, float weight) {
    //     name = name;
    //     age = age;
    //     weight = weight;
    // }

    //using this keywords
    public void getDetailsWithThis(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void putDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    public static void main(String args[]) {
        //Object creation
        ExThis objExThis = new ExThis();
        // int objExThis;

        objExThis.getDetailsWithoutThis("Mr. Neel", 25, 78.5 f);
        System.out.println("Values after get details using getDetailsWithoutThis():");
        objExThis.putDetails();

        objExThis.getDetailsWithThis("Mr. Neel", 25, 78.5 f);
        System.out.println("Values after get details using getDetailsWithThis():");
        objExThis.putDetails();
    }
}