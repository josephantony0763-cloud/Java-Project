import java.util.HashMap;

public class StudentInfo {

    String username;
    private String password;
    private int mark;
    private float percentage;
    private String grade;

    public StudentInfo(String username, String password) {
        this.username = username;
        this.password = password;
        mark=-1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
        percentage=calculatePercentage(mark);
        grade=calculateGrade(mark);
    }
    float calculatePercentage(int mark){
        return (float)(mark*100)/5;
    }

    String calculateGrade(int mark){
        String c[]={"F","B","B+","A","A+"};
        return c[mark];
    }
    void display(){
        System.out.println("----------------------------------------------");
        System.out.println("UserName :"+username);
    //    System.out.println("Password :"+password);
        if(mark==-1) {
            System.out.println("Did not attend the assesment");
            return;
        }
        System.out.println("Total Question: 5");
        System.out.println("Correct Answer:"+mark);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        if(mark>=3){
            System.out.println("STATUS: PASS");
        }
        else{
            System.out.println("STATUS: FAIL");
        }
        System.out.println("----------------------------------------------");

    }
}

