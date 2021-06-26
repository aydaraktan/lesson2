package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int voz; int temp;
        Scanner vvod = new Scanner(System.in);
        String name;
        System.out.println("введите имя");
        name= vvod.nextLine();
        System.out.println("ваше имя");
        System.out.println(name);
        System.out.println("введи возраст");
        while(true)
        {

            voz=vvod.nextInt();
            if (voz<0)
            {
                System.out.println("введи положительный возраст");
            }else if(voz>100)
            {
                System.out.println("введи реальный возраст");
            } else
            {
                break;
            }
        }
        System.out.println("введите температуру");

        while (true)
        {
            temp = vvod.nextInt();
            if(temp<-80 || temp>80){
            System.out.println("введите реальную температуру");}
            else{break;}
        }


        if (voz >= 20 && voz <= 45 && temp >= -20 && temp <= 30) {
            System.out.println("можно гулять");
        } else if (voz < 20 && voz > 0 && temp > 0 && temp < 28) {
            System.out.println("можно гулять");
        } else if (voz > 45 && voz > 100 && temp > -10 && temp < 25) {
            System.out.println("можно гулять");
        } else System.out.println("нельзя гулять");


    }
}

