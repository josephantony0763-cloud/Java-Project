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
            System.out.println("Enter the operation");
            System.out.println("1.Attent Assesment");
            System.out.println("2.Leaderboard");
            System.out.println("3.Profile");
            System.out.println("4.Exit");
            int operation=sc.nextInt();
            sc.nextLine();


            switch(operation) {

               case 1-> {
                   System.out.println();
                   System.out.println("---------- Welcome to Online Assesment ----------");
                   System.out.println();
                   System.out.println("Enter your Username");
                   String username = sc.nextLine();

                   System.out.println("Enter your Password");
                   String password = sc.nextLine();
                   if (database.check(username, password)) {
                       System.out.println("All the Best");
                       System.out.println("--------------------------------------------");
                       System.out.println(questionBank.Attenttest(database.data(username,password)));



                   } else {
                       System.out.println("Invalid password or username");
                       System.out.println("--------------------------------------------");
                       System.out.println();

                   }
               }
               case 4->{
                   questionBank.displayAllQuestion();
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
