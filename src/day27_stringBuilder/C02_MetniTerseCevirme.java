package day27_stringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {
        //verilen metrni terse cevir

        String str = "java candir";

        StringBuilder sb =new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);//ridnac avaj

        System.out.println(str);//java candir
    }
}
