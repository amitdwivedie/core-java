package com.amitdwivedie.core.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Amit Dwivedi
 *
 */
public class PrintWriterExample {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("printWriter.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("hi");
            printWriter.println("       amit,");
            printWriter.println("            How are u?");
            printWriter.write("See u soon...");
            printWriter.flush();
            printWriter.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String read = reader.readLine();
            while (read != null) {
                System.out.println(read);
                read = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
