package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.println("введите строку 5 символов, вида уравнения, содержащего два целых числа, " +
                "знак плюс или минус, знак равно и неизвестное x");
        String str = stroka.nextLine();
        String[] strarray = str.split("");

        int i = 0;
        int num_numbers = 0;
        int num_x = 0;
        int where=0;
        int rez = 0;
        for (i = 0; i < strarray.length; i++) {
            if (strarray[i].matches("^[0-9]$")) {
                num_numbers++;
            }
            if (strarray[i].matches("^x$")) {
                num_x++;
                where=i;
            }
        }
        //System.out.println(num_numbers);
        //System.out.println(num_x);

        if ((str.length() == 5) && (strarray[1].equals("+") | strarray[1].equals("-")) && (strarray[3].equals("="))&&
        (num_numbers == 2 && num_x == 1))
        {
            switch (where) {
                case 0: if (strarray[1].equals("+")) {
                    rez = Integer.parseInt(strarray[4])-Integer.parseInt(strarray[2]);}
                    else {rez = Integer.parseInt(strarray[4])+Integer.parseInt(strarray[2]);
                }
                    break;
                case 2: if (strarray[1].equals("+")) {
                    rez = Integer.parseInt(strarray[4])-Integer.parseInt(strarray[0]);}
                else {rez = Integer.parseInt(strarray[0])-Integer.parseInt(strarray[4]);
                }
                break;
                case 4: if (strarray[1].equals("+")) {
                    rez = Integer.parseInt(strarray[0])+Integer.parseInt(strarray[2]);}
                else {rez = Integer.parseInt(strarray[0])-Integer.parseInt(strarray[2]);
                }
                break;
            }


            System.out.println("Ввод : " + str);
            System.out.printf("Вывод : %d", rez);
        }
        else {
            System.out.println("введите строку из 5 символов вида уравнения из двух целых чисел, одного x и знака + или -");
        }

    }
}

