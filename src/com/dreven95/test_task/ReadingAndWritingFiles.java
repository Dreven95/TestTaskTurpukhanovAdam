package com.dreven95.test_task;

import java.io.*;
import java.util.ArrayList;

public class ReadingAndWritingFiles {

    static String readFile(String fileName, int dataTypeSelection, int sortingMethod) {
        String str = "";
        String[] files = fileName.split(" ");
        for (int i = 0; i < files.length; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(files[i]))) {
                while(reader.ready()) {
                    str += reader.readLine() + " ";
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String[] eachElementSeparately = str.split(" ");
        str = "";
        ArrayList<String> listOfStrings = new ArrayList<>();
        if (dataTypeSelection == 1) {
            if (sortingMethod == 1) {
                listOfStrings = Sort.sortFromTheSmallerNumberToLarger(eachElementSeparately);
            }
            else if (sortingMethod == 2) {
                listOfStrings = Sort.sortFromTheLargerNumberToSmaller(eachElementSeparately);
            }
            else {
                System.out.println("Выбранный вариант не находится среди предложенных");
            }
        }
        else if (dataTypeSelection == 2) {
            if (sortingMethod == 1) {
                listOfStrings = Sort.sortFromTheSmallerWordToLarger(eachElementSeparately);
            }
            else if (sortingMethod == 2) {
                listOfStrings = Sort.sortFromTheLargerWordToSmaller(eachElementSeparately);
            }
            else {
                System.out.println("Выбранный вариант не находится среди предложенных");
            }
        }
        else {
            System.out.println("Выбранный вариант не находится среди предложенных");
        }
        for (int j = 0; j < listOfStrings.size(); j++) {
            str += listOfStrings.get(j) + "\n";
        }
        return str;
    }

    static void writeToFile(String fileName, String content) {
        File inputFile = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile, true))) {
            writer.write(content);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
