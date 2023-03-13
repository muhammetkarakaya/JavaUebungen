package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        //System.out.println(sb1 == str);
        //data türü farkli , karsilastirma yapilamaz

        System.out.println(sb1 == sb2);//false
        System.out.println(sb1 == sb1);//true

        System.out.println(sb1.equals(sb2));//false
        //icerik ayni olsa bile StringBuilder de equals False verir.

        System.out.println(sb1.equals(str));//false
        System.out.println(sb1.equals(sb1));//true

        //bunun icin compare methidu kullanilir
        System.out.println(sb1.compareTo(sb2));//0
       //System.out.println(sb1.compareTo(str));//CTE



    }
}
