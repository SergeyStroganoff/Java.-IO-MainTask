package com.stroganov;

import java.io.File;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String path = args[0];
        File file = new File(path);
       GetFolderStructure.readAllSubFiles(file);

    }
}
