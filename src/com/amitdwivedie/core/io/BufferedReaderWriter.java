package com.amitdwivedie.core.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Amit Dwivedi
 *
 */
public class BufferedReaderWriter {

    public static void main(String[] args) {

        try {
            File file = new File("buffered.txt");

            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("hello,");
            bufferedWriter.newLine();
            bufferedWriter.write("How are u?");
            bufferedWriter.flush();
            bufferedWriter.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String read = bufferedReader.readLine();
            while (read != null) {
                System.out.println(read);
                read = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
