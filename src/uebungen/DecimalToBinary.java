package uebungen;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary {
    //girilen decimal bir degeri binary degere ceviren bir method olusturunuz
    //onrek 12 = 1100


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("decimal deger giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi + "  decimal degerin binary karsiligi  " + binaryDonusum(sayi));


    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;
        }
        ArrayList<Integer> tersList=new ArrayList<>();
        //Collections.reverse(binary);  //(bu ters cevirmenin kisa hali)
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersList.add(binary.get(i));


        }

        return tersList;
    }
}
