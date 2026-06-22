import java.util.*;
public class QuestionBank {
    Scanner sc=new Scanner(System.in);
    ArrayList<Question> questions=new ArrayList<>();


    public QuestionBank() {
        questions.add(new Question(
                "Which keyword is used to create an object in Java?",
                new String[]{"A. class", "B. new", "C. object", "D. this"},
                'B'
        ));

        questions.add(new Question(
                "Which method is the entry point of a Java program?",
                new String[]{"A. start()", "B. run()", "C. main()", "D. init()"},
                'C'
        ));

        questions.add(new Question(
                "Which of the following is not a primitive data type in Java?",
                new String[]{"A. int", "B. float", "C. String", "D. char"},
                'C'
        ));

        questions.add(new Question(
                "Which collection stores unique elements only?",
                new String[]{"A. ArrayList", "B. LinkedList", "C. HashSet", "D. Vector"},
                'C'
        ));

        questions.add(new Question(
                "Which operator is used to compare two values?",
                new String[]{"A. =", "B. ==", "C. !=", "D. &&"},
                'B'
        ));

        questions.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"A. implements", "B. inherits", "C. extends", "D. super"},
                'C'
        ));

        questions.add(new Question(
                "Which package contains the Scanner class?",
                new String[]{"A. java.io", "B. java.lang", "C. java.util", "D. java.net"},
                'C'
        ));

        questions.add(new Question(
                "What is the size of an int in Java?",
                new String[]{"A. 8 bits", "B. 16 bits", "C. 32 bits", "D. 64 bits"},
                'C'
        ));

        questions.add(new Question(
                "Which keyword is used to stop a loop?",
                new String[]{"A. continue", "B. break", "C. return", "D. exit"},
                'B'
        ));

        questions.add(new Question(
                "Which exception occurs when dividing by zero with integers?",
                new String[]{"A. IOException", "B. ArithmeticException", "C. NullPointerException", "D. NumberFormatException"},
                'B'
        ));
    }
    void displayAllQuestion(){
        for(Question question:questions){
               question.display() ;
        }
    }
    int Attenttest(StudentInfo student){
        Collections.shuffle(questions);
      //  Timer timer=new Timer();
     //   timer.start();

        int mark=0;
     //   while(n>0 && !Timer.examFinished){
        for(int i=0;i<questions.size();i++){

            questions.get(i).display();
            char useroption=sc.next().charAt(0);
            if(questions.get(i).corrrectOption==useroption) {
                mark++;
            }
           /* if(n==0){
                Timer.examFinished=true;
                timer.interrupt();
            }
            */

        }
        return mark;
    }
}
