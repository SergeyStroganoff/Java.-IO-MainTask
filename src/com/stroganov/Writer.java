package com.stroganov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Writer {

    File fileName;
    BufferedWriter writer;

    public Writer(File fileName) {
        this.fileName = fileName;
    }

    public Boolean fileInitialize(File fileName) {
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public void WriteFileStructure(Map<File, Boolean> fileList) {

        for (Map.Entry<File, Boolean> map : fileList.entrySet()) {
            String fileName = map.getKey().getName();
            Boolean isFile = map.getValue();
        }

    }


    public static void WriteFileStructure2(String fileName, int enclosure) {

        StringBuilder preposition = new StringBuilder("");
        for (int i = 0; i <= enclosure; i++) {
            preposition.append("--");
        }
        String nextLine = preposition +  fileName;

        System.out.println(nextLine);

    }

}
