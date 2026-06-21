import java.util.*;

public class Exam {
    public static void main(String args[]){
        DataBase database=new DataBase();
        Scanner sc=new Scanner(System.in);
        StudentInfo student1 = new StudentInfo("Antony", "123");
        database.addStudent(student1);
        StudentInfo student2 = new StudentInfo("Asath", "123");
        database.addStudent(student2);
        QuestionBank questionBank=new QuestionBank();



        while(true) {
            System.out.println("----------Online Assesgnment Test----------");
            System.out.println("");
            System.out.println("1.Login");
            System.out.println("2.Exit");
            int step=sc.nextInt();
            sc.nextLine();
            while(step==1){
                System.out.println("Enter the operation");
                System.out.println("1.Attent Assesment");
               // System.out.println("2.Leaderboard");
                System.out.println("2.Profile");
                System.out.println("3.Exit");
                int operation=sc.nextInt();
                sc.nextLine();

                switch(operation) {

                    case 1 -> {
                        System.out.println();
                        System.out.println("---------- Welcome to Online Assesment ----------");
                        System.out.println();
                        System.out.println("Enter your Username");
                        String username = sc.nextLine();

                        System.out.println("Enter your Password");
                        String password = sc.nextLine();
                        StudentInfo student = database.data(username, password);
                        if (student != null) {
                            System.out.println("All the Best");
                            System.out.println("--------------------------------------------");
                            int mark = questionBank.Attenttest(student);
                            student.setMark(mark);
                            System.out.println("Exam Result");
                            student.display();


                        } else {
                            System.out.println("Invalid password or username");
                            System.out.println("--------------------------------------------");
                            System.out.println();

                        }
                    }
                    case 2 -> {
                        student1.display();
                    }
                    case 3-> {
                        System.out.println("Thank You");
                        return;
                    }
                    default -> {
                        System.out.println("Invalid Operation");
                    }
                }





            }
        }

    }
}
