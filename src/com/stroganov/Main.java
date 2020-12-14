package com.stroganov;

import java.io.File;

public class Main {


    public static void main(String[] args) {
        // write your code here

        String path = args[0];
        File file = new File(path);
        File fileToWrite = new File("M:\\structute.txt");
        if (file.isDirectory()) {
            MyFileWriter writer = new MyFileWriter(fileToWrite);
            GetFolderStructure.readAllSubFiles(file, writer);
        } else {
            FileStructure readedFS = MyFileReader.readFSFromFile(file);
            System.out.println("Directories " + readedFS.getCountDir());
            System.out.println("Files " + readedFS.getCountFile());
            System.out.println("Average count file in Directories " + readedFS.getAverageCountFile());
        }

    }
}
