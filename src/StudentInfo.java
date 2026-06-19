import java.util.HashMap;

public class StudentInfo {

    String username;
    String password;
    int mark;

    public StudentInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void display(){
        System.out.println("UserName :"+username);
        System.out.println("Password :"+password);
        if(mark==0) {
            System.out.println("Did not attend the assesment");
            return;
        }
        System.out.println("Mark :"+mark);

    }
}

