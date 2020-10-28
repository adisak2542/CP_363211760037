package Exercise;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);



        System.out.println("num1: ");
        int num1 =Scanner.nextInt();
        System.out.println("num 2: ");
        int num2 =Scanner.nextInt();
        System.out.println("num 3: ");
        int num3 =Scanner.nextInt();
        System.out.println("num 4: ");
        int num4 =Scanner.nextInt();
        System.out.println("num 5: ");
        int num5 =Scanner.nextInt();
        System.out.println("num 6: ");
        int num6 =Scanner.nextInt();
        System.out.println("num 7: ");
        int num7 =Scanner.nextInt();
        System.out.println("num 8: ");
        int num8 =Scanner.nextInt();
        System.out.println("num 9: ");
        int num9 =Scanner.nextInt();
        System.out.println("num 10: ");
        int num10 =Scanner.nextInt();

        int Toal = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        int avg = Toal/10;

        System.out.println("num :"+Toal);
        System.out.println("avg:"+avg);



    }
}
