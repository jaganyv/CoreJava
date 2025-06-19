package CoreConcepts;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingEmc {
    public static void main(String[] args) {
//        try{
//            FileWriter fw = new FileWriter("Practice.txt",true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Hello World");
//            bw.newLine();
//            bw.write("Hello World");
//            bw.close();
//        System.out.println("Success");
//        }catch(Exception e){
//            System.out.println("Something went wrong");
//        }
        try{
            FileReader fr = new FileReader("practice.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
