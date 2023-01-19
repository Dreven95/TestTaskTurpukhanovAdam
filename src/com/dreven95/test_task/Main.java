package com.dreven95.test_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in;
        String out;
        System.out.println("Здравствуйте");
        System.out.println("Введите название одного или нескольких файлов вместе с их расширением(.txt)");
        in = scanner.nextLine();
        System.out.println("Введите название итогового файла: ");
        out = scanner.nextLine();
        ReadingAndWritingFiles.writeToFile(out, ReadingAndWritingFiles.readFile(in));

    }
}