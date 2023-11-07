package lesson02;

import java.util.Scanner;

public class plac5 {
    public static void main(String[] args) {
        String name_1 = "千歳花子";
        int num_1 = 2110000;
        Scanner input = new Scanner(System.in);
        Login_2 log = new Login_2(name_1, num_1);

        System.out.print("名前を入力" );
        String name_2 = input.next();
        System.out.print("学籍番号を入力");
        int num_2 = input.nextInt();
        log.message(name_2, num_2);
    }
}
