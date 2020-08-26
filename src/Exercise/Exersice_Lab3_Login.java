package Exercise;

import java.util.Scanner;

public class Exersice_Lab3_Login {
    public static void main(String[] args) {

        String username = "mit212";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        int count =0;
        do {
            System.out.print("username: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();
            if (u.equals(username) && p.equals(password)){
                System.out.println("Weicome, to MT System.");
                break;
            } else {
                System.out.println("Username or Password is not corrected.");
                count++;
                if (count == 3) {
                    System.out.println("Your account has been locked. Please admin.");
            }

        }
    } while (count < 3);
}
}