package CoreConcepts;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello Jagan bro!\nYou're mastering Java! 🔥");
            writer.close();
            System.out.println("File written successfully ✍️");
        }catch(Exception e){
            System.out.println("An error occurred 😢");
            e.printStackTrace();
        }
    }
}
