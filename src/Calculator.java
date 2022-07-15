import java.util.Scanner;


public class Calculator {

    static int Toplama(int x,int y){

        int toplam=x+y;

        return toplam;
    }

    static int cıkarma(int x,int y){

        int cıkarma=x-y;

        return cıkarma;
    }


    static int carpma(int x,int y){

        int carpma=x*y;

        return carpma;
    }

    static int bolme(int x,int y){

        if(y==0){

           return 0;

        }
        else{
            int bolme=x/y;

            return bolme;
        }
    }


    static int uslu( int ustlu,int taban){

       int a=1;
       while(0<ustlu) {
           ustlu--;

           a*=taban;

        }
       return a;
    }


    static int faktoriyel(int x)
    {

    int faktoriyel=1;

        for(int i=0; i<x; i++)
        {
            faktoriyel *= (x-i) ;

        }

        return faktoriyel;
    }



    static int mod(int x,int y){

        int mod=x%y;

        return mod;}

    static int alan_cevre(int x, int y, String choose){

        if(choose.equals("Alan")){
            int Alan = x * y;
            return Alan;
        }

        else{
            int cevre = (x + y)*2 ;
            return cevre;
        }

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1-Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma \n8- Dikdörtgen Alan ve Çevre Hesabı \n0- Çıkış yap");


        int choose;
        do {

            System.out.println("Lütfen bir işlem seçiniz :");
            choose = input.nextInt();

            switch (choose) {

                case 1:
                    System.out.println("Please enter the two numbers");
                    int x = input.nextInt();
                    int y = input.nextInt();

                    System.out.println(Toplama(x, y));

                    break;

                case 2:
                    System.out.println("Please enter the two numbers");
                    x = input.nextInt();
                    y = input.nextInt();

                    System.out.println(cıkarma(x, y));


                    break;

                case 3:


                    System.out.println("Please enter the two numbers");
                    x = input.nextInt();
                    y = input.nextInt();
                    System.out.println(carpma(x, y));
                    break;

                case 4:
                    System.out.println("Please enter the two numbers");
                    x = input.nextInt();
                    y = input.nextInt();
                    if(bolme(x, y)== 0 && y==0){

                        System.out.println("Bölen değer \"0\" yapılamaz ");

                    }

                    else{

                        System.out.println(bolme(x, y));}


                    break;

                case 5:

                    System.out.println("Please enter the two numbers");
                    int ustlu = input.nextInt();
                    int taban = input.nextInt();
                    System.out.println(uslu(ustlu, taban));

                    break;

                case 6:

                    System.out.println("Please enter the numbers");
                    x = input.nextInt();
                    System.out.println(faktoriyel(x));

                    break;

                case 7:

                    System.out.println("Please enter the two numbers");
                    x = input.nextInt();
                    y = input.nextInt();
                    System.out.println(mod(x, y));

                    break;

                case 8:

                    System.out.println("Do you want to calculate area or perimeter?");
                    String chose = input.next();
                    System.out.println("Enter the short and long side of the rectangle");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    String Alan = "Alan";
                    String cevre = "cevre";

                    switch (chose) {

                        case "Alan":
                            System.out.println(alan_cevre(a, b, Alan));
                            break;

                        case "cevre":
                            System.out.println(alan_cevre(a, b, cevre));
                            break;

                        default:

                    }

                    break;

                case 0:

                    break;

                default:

                    System.out.println("You made a wrong choice, please try again later.");

            }

        }

        while (choose != 0);
    }
}
