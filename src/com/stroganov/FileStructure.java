package com.stroganov;

import java.util.ArrayList;
import java.util.List;

public class FileStructure {

    private List<String> fileList = new ArrayList<>();
    private List<String> dirList = new ArrayList<>();
    private List<Integer> fileCountsInDir = new ArrayList<>();

    public List<Integer> getFileCountsInDir() {
        return fileCountsInDir;
    }

    public void addFileCountsInDir(Integer fileCount) {
        fileCountsInDir.add(fileCount);
    }

    FileStructure parent;

    public FileStructure() {
    }

    public List<String> getFileList() {
        return fileList;
    }

    public void addFile(String file) {
        fileList.add(file);
    }

    public List<String> getDirList() {
        return dirList;
    }

    public void addDir(String dir) {
        dirList.add(dir);
    }

    public int getCountFile() {
        return fileList.size();
    }

    public int getCountDir() {
        return dirList.size();
    }

    public double getAverageCountFile() {
        double average = 0;
        for (Integer countFile : fileCountsInDir) {
            average += countFile;
        }
        if (average > 0) {
            average /= fileCountsInDir.size();
        } else average = -1;
        return average;
    }

}
