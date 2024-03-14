

package com.FileHendleing;



import java.io.File;
import java.io.IOException;

public class FileHendleing {
    public static void main(String [] args ){
        File myFile=new File("sahilFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e){
            System.out.println("uabale create this file ");
            e.printStackTrace();

        }


    }
}
