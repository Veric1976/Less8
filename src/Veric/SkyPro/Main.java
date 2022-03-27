package Veric.SkyPro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static boolean checkForLeapYear (int year) {
        // set logical rules to definition Leap Year
        return year % 400 == 0 || year % 4 == 0 && year % 100 !=0;
    }

    public static String checkTypeAndYearOS ( int type, int year) {
        int currentYear = LocalDate.now().getYear();
        String typeAndVersionOSToInstall = "Нужно установить ";
        if ( year < currentYear ) {
            typeAndVersionOSToInstall += "lite-";
        }
        typeAndVersionOSToInstall += "версию приложения";
        if (type == 0) {
            typeAndVersionOSToInstall += " для iOS";
        } else if (type == 1) {
            typeAndVersionOSToInstall += " для Android";
        } else {
            typeAndVersionOSToInstall = "К сожалению, для Вашего устройства нет ПО :(";
        }
        return typeAndVersionOSToInstall;
    }

    public static int calcDeliveryDays ( int distance) {
        int deliveryDays=1;
        if (distance > 20 ) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

    public static void checkDuplicateSymbolsInStr( String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Символ '" + s.charAt(i) +
                        "' повторяется в строке");
                return;
            }
        }
    }

    public static void reverseArray( int[] arr) {
        int halfLengthSourceArray = arr.length / 2;
        int tmpValueArray;
        for (int i = 0; i <= halfLengthSourceArray; i++) {
            tmpValueArray = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmpValueArray;
        }
    }

    public static void task1 () {
        int currentYear = 2100;
        if (checkForLeapYear(currentYear)) {
            System.out.println("Текущий год " + currentYear + " является високосным");
        }
        else {
            System.out.println("Текущий год " + currentYear + " не является високосным");
        }
    }

    public static void task2 () {
        int yearDevice = 2022;
        int typeUserOS = 1;
        String s = checkTypeAndYearOS (typeUserOS, yearDevice);
        System.out.println(s);
    }

    public static void task3 () {
        int deliveryDistance = 95;
        int deliveryDays = calcDeliveryDays(deliveryDistance);
         System.out.println("Для доставки карты потребуется " + deliveryDays + " дня");
    }

    public static void task4 () {
        String incomingString = "aabccddefgghiijjkk";
        checkDuplicateSymbolsInStr(incomingString);
    }

    public static void task5 () {
        int[] sourceArray = {3, 2, 1, 6, 5};
        System.out.println(Arrays.toString(sourceArray));
        reverseArray(sourceArray);
        System.out.println(Arrays.toString(sourceArray));
    }

    public static void main(String[] args) {
        System.out.println("Task-1 -----");
        task1();
        System.out.println("Task-2 -----");
        task2();
        System.out.println("Task-3 -----");
        task3();
        System.out.println("Task-4 -----");
        task4();
        System.out.println("Task-5 -----");
        task5();
    }
}
