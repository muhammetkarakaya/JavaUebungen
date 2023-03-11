package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        sb1.append("mustafa");

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//7

        System.out.println(sb1.append(" Yilmaztürk"));
        System.out.println(sb1.capacity());//34 = 2* eski capacitiy +2
        System.out.println(sb1.length());//18

        sb1.append("javayi cok sever sabah aksam calisir");
        System.out.println(sb1.capacity());//70 = 2*34+2
        System.out.println(sb1.length());//54

        //2. yöntem

        StringBuilder sb2 =new StringBuilder("java candir");
        System.out.println(sb2.capacity());//27
        System.out.println(sb2.length());//11

        //3.yöntem
        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("12345678901");
        System.out.println(sb3.capacity());//11
        System.out.println(sb3.length());//11

        sb3.append("  : Tc No");
        System.out.println(sb3.capacity());//24
        System.out.println(sb3.length());//20





    }
}
