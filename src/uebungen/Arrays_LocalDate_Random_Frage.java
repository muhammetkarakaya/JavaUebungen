package uebungen;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Arrays_LocalDate_Random_Frage {
    /*
        Bu uygulama bir Arraye random olarak oluşturulan 10 tarih ekleyin ve bu tarihleri en eskiden yeniye doğru sıralayınız.

        Yil degiskeni icin 2013 ila 2023 arasinda random sayi uretin
        Ay degiskeni icin 1 ila 12 arasinda random sayi uretin
        Gun degiskeni icin 1 ila 28 arasinda random sayi uretin

        LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
    */

    static LocalDate[] tarihler =new LocalDate[10];
    public static void main(String[] args) {
        Random rnd=new Random();

        for (int i = 0; i < 10; i++) {
            int yil=rnd.nextInt(2023);//jdk 17 de iki aralik kullaniilabilr
            int ay= rnd.nextInt(13); //bu yüzden calismiyor
            int gun= rnd.nextInt(29);

            tarihOlustur(yil,ay,gun,i);
        }
        Arrays.sort(tarihler);

        for (LocalDate each: tarihler) {
            System.out.println(each);
        }
    }

    private static void tarihOlustur(int yil, int ay, int gun, int index) {//(2022,10,15,0)
        tarihler[index]=LocalDate.of(yil,ay,gun);//tarihler[0]=2022-10-15
        //tarihler[1]=2103-1-1
    }

}
