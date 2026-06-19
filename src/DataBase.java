import java.util.ArrayList;

public class DataBase {
    ArrayList<StudentInfo> list=new ArrayList<>();

    void addStudent(StudentInfo studentinfo){
        list.add(studentinfo);
    }
    void displayStudent(){
         if(list.size()==0) System.out.println("No student record found");
         else{
             for(StudentInfo student:list){
                 student.display();
             }
         }
    }
    boolean check(String username,String password){
        for(StudentInfo student:list){
            if(student.username.equals(username) && student.password.equals(password)){
                return true;
            }
        }
        return false;
    }
}
