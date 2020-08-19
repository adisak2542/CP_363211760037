package Lab3;

import java.util.Scanner;

public class EXample_for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integers: ");
            int num = sc.nextInt();
            total += num; // ผลรวมเก็บใน total
        }

        System.out.println("Total: " + total);
        System.out.println("Average : " + total/10);




    }
}
