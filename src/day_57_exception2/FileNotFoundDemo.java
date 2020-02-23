package day_57_exception2;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception{
        Files.readAllLines(Paths.get("file.text")); //java.nio.file.NoSuchFileException: file.text

//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch (IOException e){
//            System.out.println("Exception happened and caught");
//
//        }
        System.out.println("After try catch");
    }
}
