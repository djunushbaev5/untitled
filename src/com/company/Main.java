package com.company;

public class Main {

    public static void main(String[] args) {
        String yyy = ggg("Руслан", 18);
        System.out.println(yyy);
        // Домашняя работа

//          int age = 20;
//          int temp = 10;
//
//            if(age <10 && age >45 && temp > +30 && temp < -20){
//                System.out.println("можно идти гулять.");
//        }
//            else if(age >10 && temp <0 && temp >8){
//                System.out.println("можно гулять, но не долго");
//            }
//            else if(age <65 && temp > -10 && temp <25){
//                System.out.println("лучше остаться дома");
//            }
//            else {
//                System.out.println("Остаться дома");
//            }

//        String name = "Руслан";
//           switch (name){
//               case"Баястан":
//                   System.out.println("Это Баястан");
//                   break;
//               case"Рустам":
//                   System.out.println("Это Рустам");
//                   break;
//               case"Эрлан":
//                   System.out.println("Это Эрлан");
//                   break;
//               default:
//                   System.out.println("Такого имени нерт!");
//
//           }

    }
    public static String ggg(String name1, int age1){
        final String ttt = ("Меня звоут" + " " + name1 + " " + age1);
        return ttt;
    }
}
