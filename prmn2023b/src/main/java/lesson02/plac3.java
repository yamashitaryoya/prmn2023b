package lesson02;

import java.util.Scanner;

public class plac3 {
    public static void main(String[] args) {
        String[][] gakusekilist = new String[5][2];

        gakusekilist[0][0] = "b2222000";
        gakusekilist[0][1] = "abcd";
        gakusekilist[1][0] = "b2222111";
        gakusekilist[1][1] = "efgh";
        gakusekilist[2][0] = "b2222222";
        gakusekilist[2][1] = "ijkl";
        gakusekilist[3][0] = "b2222333";
        gakusekilist[3][1] = "mnop";
        gakusekilist[4][0] = "b2222444";
        gakusekilist[4][1] = "qrst";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力　");
        String inpGakuseki = scan.next();

        Login action = new Login(gakusekilist);

        boolean register, match = false;

        register = action.checkGakuseki(inpGakuseki);

        if(register){
            System.out.print("パスワードを入力　");
            String inpPassword = scan.next();
            match = action.checkPassword(inpPassword);
        }else{
            System.out.println("Error");
            System.exit(0);
        }

        if(match){
            System.out.println("ログイン完了");
        }else{
            System.out.println("不正なアクセス");
            System.exit(0);
        }



    }
}
