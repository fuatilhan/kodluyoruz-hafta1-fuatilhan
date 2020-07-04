package org.kodluyoruz;

public class Main1
{

    public static void main(String[] args)
    {
        // TODO sırasıyla boolean, char, int, long ve double türlerinde değişkenler oluşturun ve konsola yazdırın

        boolean key=true;
        char c='&';
        int a =7533;
        long b= 2234234;
        double d=2.4d;
        System.out.println(key);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println("***************************************");

        // TODO int türünde bir sabit oluşturun ve konsola yazdırın
        final int r=2;
        System.out.println(r);
        System.out.println("***************************************");

        // TODO aşağıdaki x değişkenini long türünde bir değişkene dönüştürün ve konsola yazdırın
        int x = 2020;
        long longSayi= (long) x;
        System.out.println(longSayi);
        System.out.println("*****************************************");
        System.out.println("*****************************************");


        // TODO aşağıdaki y değişkenini int türünde bir değişkene dönüştürün ve konsola yazdırın
        long y = 1234L;
        int intSayi=(int)y;
        System.out.println(intSayi);
        System.out.println("***************************************");
        System.out.println("***************************************");


        // TODO 2 tane float türünde değişken oluşturun, bunların toplamını başka bir değişkene aktarın ve konsola yazdırın
        float floatSayi1=2.4f;
        float floatSayi2=(-0.2f);
        float floatSayi3=(floatSayi1+floatSayi2);
        System.out.println(floatSayi3);
        System.out.println("***************************************");

        // TODO istediğiniz bir sayısal türde 2 değişken oluşturun; bunların 4 işlemini farklı farklı değişkenlerde tutun ve konsola yazdırın
        int i1=48;
        int i2=6;
        int toplama=(i1+i2);
        int çıkarma=(i1-i2);
        int çarpma=(i1*i2);
        int bölme=(i1/i2);
        System.out.println("i1 ve i2 sayılarının "+"toplama sonucu: "+toplama+" "+" çıkarma sonucu: "+çıkarma+" "+
                "çarpma sonucu: "+çarpma+" "+ "bölme sonucu: "+bölme+" "+"dir.");
    }

}
