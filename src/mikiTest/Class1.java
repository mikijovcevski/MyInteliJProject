package mikiTest;

public class Class1 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        sayHello("Miki");
        sayGoodbye("Miki");
    }

    private int age = 10;
    public static void sayHello(String name){
        System.out.println("Hello" +name);
    }
    public static void sayGoodbye(String name){
        System.out.println("Good bye" +name);
    }
}
