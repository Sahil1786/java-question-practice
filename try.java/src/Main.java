
import
        java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main (String []args){

//        File myfile=new File("sahil.txt");
//        try{
//            myfile.createNewFile();
//        }catch(IOException e){
//            System.out.println("unable to carete the file");
//            e.printStackTrace();
//        }


//
//        FileWriter fileWriter=new FileWriter("sahil.txt");
//        try{
//
//            fileWriter.write("this a fist code");
//            fileWriter.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        File myfile=new File("sahil.txt");
        try {
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine()){;
            String Line=sc.nextLine();
            System.out.println(Line);}
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }


    }
    // code to write to file
}