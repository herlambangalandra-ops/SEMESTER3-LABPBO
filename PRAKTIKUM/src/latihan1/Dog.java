package latihan1; // Sesuaikan nama package jika Eclipse meminta 'latihan1' atau 'Praktikum_1'

public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
        System.out.println("woof...");
    }

    void hungry() {
        System.out.println("woof... it's time for lunch");
    }

    void sleeping() {
        System.out.println("snoring zzz...zzz...");
    }

    void puppyName(String name) {
        System.out.println("My puppy name is: " + name);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.puppyName("Buddy");
        myDog.barking();
        myDog.hungry();
        myDog.sleeping();
    }
}