package lesson02;

import java.util.Scanner;
public class plac1 {
    public static void main(String[] args) {
        String number = "B2222430";

        Gakuseki student = new Gakuseki();
        student.mine = number;

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力");
        String gakuseki = scan.next();

        student.check(gakuseki);
    }
}
