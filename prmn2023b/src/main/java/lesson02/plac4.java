package lesson02;

import java.util.Scanner;

public class plac4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int num = input.nextInt();

        System.out.println("氏名：" + name + "学籍番号：" + num);
    }
}
