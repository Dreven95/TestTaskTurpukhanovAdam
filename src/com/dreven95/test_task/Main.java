package com.dreven95.test_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        int dataTypeSelection;
        int sortingMethod;
        String in;
        String out;
        System.out.println("Здравствуйте");
        System.out.println("Выберите тип данных с которым необходимо работать(введите в консоль нужную цифру без пробелов, символов и т.п): ");
        System.out.println("1 - int");
        System.out.println("2 - String");
        dataTypeSelection = intScanner.nextInt();
        System.out.println("Выберите способ сортировки(введите в консоль нужную цифру без пробелов, символов и т.п): ");
        System.out.println("1 - по возрастанию");
        System.out.println("2 - по убыванию");
        sortingMethod = intScanner.nextInt();
        System.out.println("Введите название одного или нескольких файлов, с которыми необходимо провести работу.");
        System.out.println("Если файлов несколько, то вводите их названия черех пробел, так же не забывайте указывать расшиение файла (.txt)");
        System.out.println("Пример ввода : in.txt in2.txt in3.txt");
        System.out.println("Можете начать вводить названия файла или файлов здесь: ");
        in = stringScanner.nextLine();
        System.out.println("Введите название итогового файла, так же не забудьте указать его расширение (.txt): ");
        out = stringScanner.nextLine();
        ReadingAndWritingFiles.writeToFile(out, ReadingAndWritingFiles.readFile(in, dataTypeSelection, sortingMethod));
        System.out.println("Операция завершена!!!");

    }
}