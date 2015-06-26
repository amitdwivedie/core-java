package com.amitdwivedie.core.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Amit Dwivedi
 *
 */
public class ReadWriteReader {

    public static void main(String[] args) {
        
        try {
            File file = new File("writer.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("amit \n");
            writer.write("amit1 \n");
            writer.write("amit2 \n");
            writer.close();
            
            FileReader reader = new FileReader(file);
            int read = reader.read();
            while(read != -1){
                System.out.print((char)read);
                read = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
