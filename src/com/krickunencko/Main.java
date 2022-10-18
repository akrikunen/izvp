package com.krickunencko;
import java.util.Scanner;
/*
Подключение класса Scanner, в данной работе используеться для обработки данных введенных пользователем (заполнение массива)
*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in); //создание объекта класса Scanner

        ////////////////////////////////////////

        int len1;
        System.out.println("Введите размер массива");
        len1=scanner.nextInt();
        int [] mas1 = new int[len1];

        for (int i = 0; i < mas1.length; i++) {   //заполнение массива через клавиатуру
            System.out.print("Введите " + i + " -ое число ");
            mas1[i] = scanner.nextInt();
        }
        System.out.println(isSorted(mas1)); //вывод результата работы метода isSorted

        ////////////////////////////////////////

        fizzBuzz(100); //вывод результата работы метода fizzBuzz

        ////////////////////////////////////////
        int len2;
        System.out.println("Введите размер массива");
        len2=scanner.nextInt();
        int[] mas2 = new int[len2];

        for (int i = 0; i < mas2.length; i++) { //заполнение массива через клавиатуру
            System.out.print("Введите " + i + " -ое число ");
            mas2[i] = scanner.nextInt();
        }
        System.out.println(getAnswer(mas2));

        ////////////////////////////////////////
    }
    //Первое задание
    private static boolean isSorted(int [] mas) {

        if(mas.length>=2) {

            boolean flag = false; //Создание булевой переменной для хранения результата операции

            for (int i = 0; i < mas.length-1; i++) { //проход по циклу
                if(mas[i+1]>=mas[i]) {  //условие где следующий элемент больше предыдущего
                    flag = true;
                }
                else {
                    flag=false;
                    break;
                }
            }
            return flag;
        }

        return false;
    }
    //Второе задание
    private static void fizzBuzz(int n){
        for(int i=1; i<=n;i++){   //проход цикла по всем числам
            if(((i%3)==0)&&((i%5)==0))  //проверка на одновременную кратность 3 и 5
                System.out.println("FizzBuzz");
            else if((i%3)==0) //проверка на кратность 3
                System.out.println("Fizz");
            else if((i%5)==0) //проверка на кратность 5
                System.out.println("Buzz");
            else
                System.out.println(i);
        }


    }
    //Третье задание*
    public static boolean getAnswer ( int[] mas){
        if (mas.length < 2) return false;
        int i;
        for (i = 0; i < mas.length - 1; i++) {
            int summ1 = 0;
            for (int j = 0; j <= i; j++) { //вычисление первой суммы элементов
                summ1 += mas[j];
            }
            int summ2 = 0;
            for (int j = i + 1; j < mas.length; j++) { //вычисление второй суммы элементов
                summ2 += mas[j];
            }
            if (summ1 == summ2) { //сценарий при которой две суммы равны
                System.out.println("\n"+ summ1 + " = " + summ2);
                return true;
            }
        }
        return false;
    }

}
