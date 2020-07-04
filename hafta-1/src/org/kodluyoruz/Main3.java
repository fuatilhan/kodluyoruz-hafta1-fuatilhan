package org.kodluyoruz;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main3
{

    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // TODO yukarıdaki kod 0'dan 99'a kadar rastgele bir tamsayı üretmektedir.

        // Üretilen bu sayı 50'den küçük ise konsola "küçük", 50 veya 50'den büyükse "büyük" yazdırın.
        // Ayrıca, üretilen bu sayı çift ise konsola "çift", tek ise "tek" yazdırın.

        System.out.println(randomNumber);

        if(randomNumber<50 && randomNumber%2==0){
            System.out.println("küçük ve çift");
        }
        else if(randomNumber>=50 &&randomNumber%2==0){
            System.out.println("Büyük ve çift");
        }
        else if(randomNumber<50&&randomNumber%2==1){
            System.out.println("küçük ve tek");
        }
        else{
            System.out.println("Büyük ve tek");
        }
        System.out.println("*******************************");
        System.out.println("*******************************");

        Scanner scan=new Scanner(System.in);
        System.out.println("Dönem sonu ortalamasını giriniz");
        int ortalama=scan.nextInt();

    }

    private static void gradeStudent(int grade)
    {
        // TODO bu metot parametre olarak 0'dan 100'e kadar bir tamsayı alır..
        // Bu değer bir öğrencinin notudur.
        // Bu not;
        //      - 85 veya daha yüksekse karne notu 5,
        //      - 70 veya daha yüksekse karne notu 4,
        //      - 55 veya daha yüksekse karne notu 3,
        //      - 45 veya daha yüksekse karne notu 2,
        //      - 25 veya daha yüksekse karne notu 1,
        //      - 25'ten küçükse karne notu 0'dır.
        // Öğrencinin karne notunu hesaplayan ve konsola yazdıran bir kod yazın.
        if(grade>=85){
            System.out.println("Karne notu : 5");

        }
        else if(grade>=70){
            System.out.println("Karne notu : 4");
        }
        else if(grade>=55){
            System.out.println("Karne notu : 3");
        }
        else if(grade>=45){
            System.out.println("Karne notu : 2");
        }
        else if(grade>=25){
            System.out.println("Karne notu : 1");
        }
        else{
            System.out.println("Karne notu : 0");
        }
    }

    private static boolean isPrimeNumber(int number)
    {

        // TODO parametre olarak verilen number sayısının asal sayı olup olmadığını hesaplayan bir kod yazın.
        // Eğer asal sayı ise konsola "Asal", değilse "Asal değil" yazdırın.
        for(int i=2;i<number;i++) {
            if(number%i==0)
                return false;

        }

        return true;


    }


    private static void traverseArray(int[] array)
    {
        // TODO parametre olarak verilen array dizisinin elemanlarını while döngüsüyle gezin.
        // Elemanları konsola yazdırın.
        // Eğer 7 ile bölünebilen bir sayıyla karşılaşırsanız döngüyü sonlandırın.
        int i=0;
        while(i<array.length){
            if(array[i]==7){
                break;
            }
            else {
                array[i] = i;
                i++;
                System.out.print(array[i] + " ");
            }
        }

    }

    private static void printArray(int[] array)
    {
        // TODO parametre olarak verilen array dizisinin elemanlarını for-each döngüsüyle gezin.
        // Eğer sayı çift ise sayının karesini konsola yazdırın.
        // Eğer sayı tek ise sayının karekökünü konsola yazdırın.
        // Not: Sayının karekökünü Math.sqrt() metoduyla alabilirsiniz.
        for (int a:array
        ) {
            if(a%2==0){
                System.out.println(a*a);
            }
            if(a%2==1){
                System.out.println(Math.sqrt(a));
            }


        }
    }

}
