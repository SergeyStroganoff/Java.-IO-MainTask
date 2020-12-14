package com.stroganov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    public static FileStructure readFSFromFile(File fileName) {

        FileStructure fileStructure = new FileStructure();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String separator;
            int fileCount = -1;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                separator = line.startsWith("|  ") ? "|  " : "|--";
                int lastSeparatorIndex = line.lastIndexOf(separator) + 3;
                line = line.substring(lastSeparatorIndex);
                if (separator.equals("|  ")) {
                    fileStructure.addFile(line);
                    fileCount++;
                } else {

                    fileStructure.addDir(line);
                    if (fileCount > -1) {
                        fileStructure.addFileCountsInDir(fileCount);
                        fileCount = 0;
                    } else fileCount = 0;
                }
            }
            fileStructure.addFileCountsInDir(fileCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileStructure;
    }
}
