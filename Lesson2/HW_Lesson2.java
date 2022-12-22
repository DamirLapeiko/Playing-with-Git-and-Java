package Lesson2;

import java.util.Scanner;

public class HW_Lesson2 {
    public static void main(String[] args) {
        System.out.println("Здравствуйте, Вас приветствует Джарвис, введите свое имя для авторизации");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        System.out.println("Hello, my friend!");


//        System.out.println("Приветствую, Дамир, введите свой год рождения для подтверждения авторизации");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age != 2002){
//            System.out.println("Неправильный год рождения");
//        }
//        if (age == 2002) {
//            System.out.println(sc.nextLine());
//            System.out.println("Вы авторизовались, Вам сейчас " + (2022 - age) + ' ' + "лет");
//        }
    }
}