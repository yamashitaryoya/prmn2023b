package lesson02;

import java.security.KeyStore;

public class Login {
    String[][] students;
    int idIndex;

    Login(String[][] studentList){
        this.students = studentList;
    }

    boolean checkGakuseki(String inp){
        for(int i=0; i< students.length; i++){
            if(students[i][0].equals(inp)){
                idIndex = i;
                return true;
            }
        }
        return false;
    }

    boolean checkPassword(String inp){
        if(students[idIndex][1].equals(inp)){
            return true;
        }else{
            return false;
        }
    }
}
