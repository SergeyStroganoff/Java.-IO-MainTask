package com.stroganov;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GetFolderStructure {

   static int  counter = 0;

    Map<File, Boolean> fileMap = new HashMap<>();

    public static   Map<File, Boolean> readAllSubFiles(File baseDirectory) {
        Map<File, Boolean> fileMap = new HashMap<>();

        Writer.WriteFileStructure2(baseDirectory.toString(),counter);
        if (baseDirectory.isDirectory() && !(baseDirectory==null)) {
            for (File file : baseDirectory.listFiles()) {
                if (file.isFile()) {
                    Writer.WriteFileStructure2(baseDirectory.toString(),counter);
                    fileMap.put(file, true);
                } else {
                    counter++;
                    fileMap.put(file, false);
                    readAllSubFiles(file);
                }
            }
        }
        return fileMap;
    }





}
