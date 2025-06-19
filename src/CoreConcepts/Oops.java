package CoreConcepts;

import org.w3c.dom.ls.LSOutput;

//Inheritence
//Polymorphism
//Abstraction
//Encapsulation
public class Oops {
//    Encapsulation
    public static class Student{
    private String name;
//    Setter
    public void setName(String name){
        this.name=name;
    }
//    Getter
    public String getName(){
        return this.name;
    }
}



    public static void main(String[] args) {
        Student s=new Student();
        s.setName("John");
        System.out.println(s.getName());

    }

}
