package PACKAGE_NAME;public class odevv {import java.util.Scanner;
public class odevv {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
                Scanner inp= new Scanner(System.in);
                System.out.print("Matematik notunuzu giriniz: ");
                mat=inp.nextInt();
                System.out.print("Fizik notunuzu giriniz: ");
                fizik=inp.nextInt();
                System.out.print("Kimya notunuzu giriniz: ");
                kimya=inp.nextInt();
                System.out.printf("turkce notunuzu giriniz:");
                turkce=inp.nextInt();
                System.out.print("Tarih notunuzu giriniz: ");
                tarih=inp.nextInt();
                System.out.print("Muzik notunuzu giriniz: ");
                muzik=inp.nextInt();
                int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
                double Sonuc = toplam / 6;
                System.out.println("Ortalamanız: "+Sonuc);
        String sinifDurumu = (Sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);





    }
}
























  
}
