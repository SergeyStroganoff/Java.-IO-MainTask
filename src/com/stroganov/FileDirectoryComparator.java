package com.stroganov;

import java.io.File;
import java.util.Comparator;

public class FileDirectoryComparator implements Comparator<File> {

    @Override
    public int compare(File file, File t1) {

        if (file.isFile()==t1.isFile()) return 0;
        if (file.isFile() && t1.isDirectory()) return -1;
        else return 1;
    }
}
