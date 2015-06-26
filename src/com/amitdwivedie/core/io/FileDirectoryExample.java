package com.amitdwivedie.core.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Amit Dwivedi
 *
 */
public class FileDirectoryExample {

    public static void main(String[] args) {
        
        try {
            File dir = new File("dir");
            dir.mkdir();
            File file = new File(dir, "file.txt");
            file.createNewFile(); // need to create directory before creating file if not exist
            System.out.println(file.exists());
            File newFile = new File(dir, "newFile.txt");
            file.renameTo(newFile);
            
            
            File newDir = new File("newDir");
            dir.renameTo(newDir);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
