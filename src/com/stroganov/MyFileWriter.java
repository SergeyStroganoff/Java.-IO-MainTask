package com.stroganov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

    private File fileName;

    public MyFileWriter(File fileName) {
        this.fileName = fileName;
    }

    private String makeStringToWrite(File file, int enclosure) {

        String firstSymbol = file.isDirectory() ? "|--" : "|  ";
        StringBuilder preposition = new StringBuilder(firstSymbol);
        for (int i = 0; i < enclosure; i++) {
            preposition.append(firstSymbol);
        }
        return preposition + file.getName();
    }

    public void writeFileStructure(File file, int enclosure) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));) {
            bufferedWriter.write(makeStringToWrite(file, enclosure) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
