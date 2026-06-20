public class Question {
    String Question;
    String[] Option;
    char corrrectOption;

    public Question(String question, String[] option, char corrrectOption) {
        Question = question;
        Option = option;
        this.corrrectOption = corrrectOption;
    }

    void display(){
        System.out.println(Question);
        for(int i=0;i<4;i++){
            System.out.println(Option[i]);
        }

    }
}
