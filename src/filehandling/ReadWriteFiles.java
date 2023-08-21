package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFiles {

    Scanner sc = new Scanner(System.in);
    public void writeFiles(){

        File file = new File("C:/Users/nepac/OneDrive/Documents/virinchi c programming/JAVA/OOP/src/filehandling/Test");
        try{
            FileWriter fileWriter = new FileWriter(file);
            /*fileWriter.write("This is a test.");
            fileWriter.close();*/

            System.out.println("Enter Text to write on File.");
            String text = sc.nextLine();

            fileWriter.write(text);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(){
        File file = new File("C:/Users/nepac/OneDrive/Documents/virinchi c programming/JAVA/OOP/src/filehandling/Test");

        try{
            FileReader fileReader = new FileReader(file);

            int a;
            while((a=fileReader.read()) != -1)
                System.out.println((char) a);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
