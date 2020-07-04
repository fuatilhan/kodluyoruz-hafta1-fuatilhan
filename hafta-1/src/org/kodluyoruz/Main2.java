package org.kodluyoruz;

public class Main2
{

    public static void main(String[] args)
    {
        // TODO int türünde bir dizi oluşturun ve 1'den 5'e kadar olan rakamları ekleyin
        int[]arr={1,2,3,4,5};

        // TODO int türünde bir dizi oluşturun ve 1 ile 50 arasındaki (50 dahil) çift sayıları for döngüsü kullanarak diziye ekleyin
        int[] array = new int[51];
        for (int i =1;i<= array.length;i++)
        {
            if(i%2==0){
                array[i]=i;
                System.out.print(array[i]+",");
            }

        }


        createMatrix(3,4);

        createLadder(5);

        searchInArray(new int[]{1, 2, 3, 4, 5, 6,},3);
        shiftArray(new int[]{1,2,3,4,5});


    }

    private static void createMatrix(int a, int b)

    {
        // TODO axb boyutunda int türünde bir matris oluşturun ve bütün elemanlarını 1 olarak ayarlayın
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = 1;

            }

        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j]+ " ");


            }
            System.out.println("");



        }




    }

    private static void createLadder(int rows)
    {
        // TODO rows sayısı kadar satıra sahip bir matris oluşturun.
        // Bu matrisin her satırındaki sütun sayısı farklı olacaktır.
        // Her bir satırda satır numarası neyse sütun sayısı da o kadar olmalıdır.
        //     Örnek: İlk satırda 1 sütun bulunur, 6. satırda 6 sütun bulunur.
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");

        }
    }

    private static void searchInArray(int[] array, int item)
    {
        // TODO array dizisi içinde item elemanını arayan bir kod yazın.
        // Eğer bulursanız konsola "Bulundu!", bulamazsanız "Bulunamadı!" yazdırın.

        int found =0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==item){
                found++;
            }

        }
        if(found>0){
            System.out.println("Bulundu");
        }
        else{
            System.out.println("bulunamadı");
        }
    }

    private static void searchInMatrix(int[][] matrix, int item)
    {
        // TODO matrix adlı matris içinde item elemanını arayan bir kod yazın.
        // Eğer bulamazsanız konsola "Aradığınız eleman bulunamadı." yazdırın.
        // Eğer bulursanız konsola kaçıncı satır ve sütunda bulunduğunu yazın.
        //     Örnek: "Aradığınız eleman 3. satır ve 5. sütunda bulunmuştur.
    }

    private static void shiftArray(int[] array)
    {
        // TODO parametre olarak verilen dizinin elemanlarını birer aşağı kaydırın.
        // Yani, 1. eleman 2. eleman olsun, 2. eleman da 3. eleman olsun.
        // Son elemanı ise ilk eleman olarak ayarlayın.
        // ÖNEMLİ: Bu işlemi başka bir dizi kullanmadan yapın.
        int temp;


        for(int i=0;i<array.length;i++)
        {
            array[i]=i;
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        temp=array[array.length-1];
        for(int i=array.length-1;i>0;i--)
        {
            array[i]=array[i-1];
        }
        array[0]=temp;

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }



    }
}
