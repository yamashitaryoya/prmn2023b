package lesson02;

public class Keisan {

    int x = 0;

    void sum(int[] numlist){
        for(int i=0; i<numlist.length; i++){
            x += numlist[i];
        }
        System.out.println("合計値：　" + x);
    }

    void check(){
        if(x>=100){
            System.out.println("Great");
        }else if(x>=50){
            System.out.println("Big");
        }else{
            System.out.println("Small");
        }
    }
}
