package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        FileReader fileReaderer = new FileReader();

        try {
            fileReader.readFile("i-don't-know-file-name.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

    }
}