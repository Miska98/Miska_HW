package homework;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        String monthName;
        String season;

        switch (monthNumber) {
            case 1:
                monthName = "Январь";
                season = "Зима";
                break;
            case 2:
                monthName = "Февраль";
                season = "Зима";
                break;
            case 3:
                monthName = "Март";
                season = "Весна";
                break;
            case 4:
                monthName = "Апрель";
                season = "Весна";
                break;
            case 5:
                monthName = "Маи";
                season = "Весна";
                break;
            case 6:
                monthName = "Июны";
                season = "Лето";
                break;
            case 7:
                monthName = "Июлы";
                season = "Лето";
                break;
            case 8:
                monthName = "Август";
                season = "Лето";
                break;
            case 9:
                monthName = "Сентябыр";
                season = "Осены";
                break;
            case 10:
                monthName = "Октябырь";
                season = "Осены";
                break;
            case 11:
                monthName = "Наябарь";
                season = "Осены";
                break;
            case 12:
                monthName = "Декабарь";
                season = "Зима";
            default:
                monthName = "Некорректный номер месяца";
                season = "Некорректный номер месяца";
                break;


        }

        System.out.println("Месяц: " + monthName);
        System.out.println("Время года: " + season);


    }
}
