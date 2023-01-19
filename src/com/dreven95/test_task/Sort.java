package com.dreven95.test_task;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    static ArrayList<String> sortFromTheSmallerNumberToLarger(String[] str) {
        ArrayList listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, str);
        for (int i = 0; i < listOfStrings.size(); i++) {
            for (int j = i + 1; j < listOfStrings.size(); j++) {
                if(!Helper.isNumeric(listOfStrings.get(i).toString())) {
                    listOfStrings.remove(i);
                }
                if(!Helper.isNumeric(listOfStrings.get(j).toString())) {
                    listOfStrings.remove(j);
                }
                if (Integer.parseInt(listOfStrings.get(i).toString()) > Integer.parseInt(listOfStrings.get(j).toString())) {
                    Collections.swap(listOfStrings, i, j);
                }
            }
        }
        return listOfStrings;
    }

    static ArrayList<String> sortFromTheLargerNumberToSmaller(String[] str) {
        ArrayList listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, str);
        for (int i = 0; i < listOfStrings.size(); i++) {
            for (int j = i + 1; j < listOfStrings.size(); j++) {
                if(!Helper.isNumeric(listOfStrings.get(i).toString())) {
                    listOfStrings.remove(i);
                }
                if(!Helper.isNumeric(listOfStrings.get(j).toString())) {
                    listOfStrings.remove(j);
                }
                if (Integer.parseInt(listOfStrings.get(i).toString()) < Integer.parseInt(listOfStrings.get(j).toString())) {
                    Collections.swap(listOfStrings, i, j);
                }
            }
        }
        return listOfStrings;
    }

    static ArrayList<String> sortFromTheSmallerWordToLarger(String[] str) {
        ArrayList listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, str);
        for (int i = 0; i < listOfStrings.size(); i++) {
            for (int j = i + 1; j < listOfStrings.size(); j++) {
                if (listOfStrings.get(i).toString().length() > listOfStrings.get(j).toString().length()) {
                    Collections.swap(listOfStrings, i, j);
                }
            }
        }
        return listOfStrings;
    }

    static ArrayList<String> sortFromTheLargerWordToSmaller(String[] str) {
        ArrayList listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, str);
        for (int i = 0; i < listOfStrings.size(); i++) {
            for (int j = i + 1; j < listOfStrings.size(); j++) {
                if (listOfStrings.get(i).toString().length() < listOfStrings.get(j).toString().length()) {
                    Collections.swap(listOfStrings, i, j);
                }
            }
        }
        return listOfStrings;
    }

}
