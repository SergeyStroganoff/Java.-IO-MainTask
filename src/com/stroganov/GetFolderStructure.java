package com.stroganov;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetFolderStructure {

    static int counter = 0;

    public static void readAllSubFiles(File baseDirectory, MyFileWriter writer) {

        writer.writeFileStructure(baseDirectory, counter);
        if (baseDirectory.isDirectory()) {

            ArrayList<File> fileList = new ArrayList<>(Arrays.asList(baseDirectory.listFiles()));
            Collections.sort(fileList, new FileDirectoryComparator());

            for (File file : fileList) {
                if (file.isFile()) {
                    writer.writeFileStructure(file, counter);
                } else {
                    counter++;
                    readAllSubFiles(file, writer);
                }
            }
            counter--;
        }

    }

}
