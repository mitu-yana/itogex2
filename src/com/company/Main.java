package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.println("введите строку 5 символов");
        String str = stroka.nextLine();
        String[] strarray = str.split("");

        //String[] num = new String[5];
        int i = 0;
        int num_numbers = 0;
        int num_x = 0;
        int where=0;
        double rez = 0;
        for (i = 0; i < strarray.length; i++) {
            if (strarray[i].matches("^[0-9]$")) {
                num_numbers++;
            }
            if (strarray[i].matches("^x$")) {
                num_x++;
                where=i;
            }
        }
        System.out.println(num_numbers);
        System.out.println(num_x);

        if ((str.length() == 5) && (strarray[1] == "+" | strarray[1] == "-") && (strarray[3] == "=")&&
        (num_numbers == 2 && num_x == 1))
        {
            switch (where) {
                case 0: if (strarray[1] == "+") {
                    rez = Double.parseDouble(strarray[4])-Double.parseDouble(strarray[2]);}
                    else {rez = Double.parseDouble(strarray[4])+Double.parseDouble(strarray[2]);
                }
                    break;
                case 2: if (strarray[1] == "+") {
                    rez = Double.parseDouble(strarray[4])-Double.parseDouble(strarray[0]);}
                else {rez = Double.parseDouble(strarray[0])+Double.parseDouble(strarray[4]);
                }
                break;
                case 4: if (strarray[1] == "+") {
                    rez = Double.parseDouble(strarray[0])+Double.parseDouble(strarray[2]);}
                else {rez = Double.parseDouble(strarray[0])-Double.parseDouble(strarray[2]);
                }
                break;
            }

        }
        System.out.println("Ввод : " + str);
        System.out.printf("Вывод : %.2f", rez);
    }
}

          /*     while (true) {
                System.out.println("введите строку 5 символов");
                String str = stroka.nextLine();
            if (str.length() == 5) {
                String[] strarray = str.split(" ");
                System.out.println(strarray);
                break;
            } else System.out.println("число символов не равно 5, попробуйте еще раз");
            //разбиваю строку на массив*/



                  /*  int result2 = str.indexOf('+', 2) | str.indexOf('-', 2);
            int result5 = str.indexOf('=', 5);

            if (result2==2&&result5==5) {

            }

        }
    }
}


//Напишите программу, которая позволит решить простое уравнение относительно x.
// Программа принимает на вход строку длиной 5 символов.
// Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
// Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное)
// в любом порядке. Нужно найти неизвестное.
//
//Пример для теста работы программы:
//
//Ввод: x+5=7
//Вывод: 2
//Ввод: 3-x=9
//Вывод: -6
//Ввод: 3-3=x..
//Вывод: 0 */