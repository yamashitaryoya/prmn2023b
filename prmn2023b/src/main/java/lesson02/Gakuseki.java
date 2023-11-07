package lesson02;

public class Gakuseki {
    String mine;
    void check(String inp){
        if(mine.equals(inp)){
            System.out.println("Complete!!");
        }
        else{
            System.out.println("Error!!");
        }
    }
}
