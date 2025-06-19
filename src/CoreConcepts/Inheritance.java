package CoreConcepts;

class Animal {
    void speak() {
        System.out.println("Animal Wont Speak");
    }
}
    class Dog extends Animal{
        void eat(){
            System.out.println("Dog eat");
        }
    }
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow Meow");
    }

}
    public class Inheritance{

public static void main(String[] args) {
    Animal a=new Animal();


}
}