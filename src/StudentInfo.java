import java.util.HashMap;

public class StudentInfo {

    String username;
    private String password;
    private int mark;
    private float percentage;
    private String grade;
    static int noOfQuestion=10;

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
        return (float)(mark*100)/noOfQuestion;
    }

    String calculateGrade(int mark){
      switch(mark){
          case 0,1-> {
              return "F";
          }
          case 2,3 -> {
              return "B+";
          }
          case 4,5 ->{
              return "B";
          }
          case 6,7->{
              return "A";
          }
          case 8,9->{
              return "A+";
          }
          case 10 ->{
              return "O";
          }

      }
        return "";
    }
    void display(){
        System.out.println("----------------------------------------------");
        System.out.println("UserName :"+username);
        if(mark==-1) {
            System.out.println("Did not attend the assesment");
            return;
        }
        System.out.println("Total Question: "+noOfQuestion);
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

