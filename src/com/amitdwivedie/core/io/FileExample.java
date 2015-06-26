package com.amitdwivedie.core.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Amit Dwivedi
 *
 */
public class FileExample {

    public static void main(String[] args) {

        try {
            boolean isFileExist = false;
            File file = new File("file.txt");

            System.out.println("File " + file);
            System.out.println("Is file exists " + file.exists());

            isFileExist = file.createNewFile();
            System.out.println("Is File created " + isFileExist);

            System.out.println("Is file exists " + file.exists());

            file.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
