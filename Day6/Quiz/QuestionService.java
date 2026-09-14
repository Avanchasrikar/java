import java.util.*;

public class QuestionService {
        Question[] questions = new Question[5];
        String selection[] = new String[5];

        public QuestionService(){
          questions[0] = new Question(
    1,
    "Which language is used for Java development?",
    "Java",
    "Python",
    "CSS",
    "HTML",
    "Java"
);

questions[1] = new Question(
    2,
    "Which language is mainly used for web page styling?",
    "Java",
    "Python",
    "CSS",
    "HTML",
    "CSS"
);

questions[2] = new Question(
    3,
    "Which language is used to structure a web page?",
    "Java",
    "Python",
    "CSS",
    "HTML",
    "HTML"
);

questions[3] = new Question(
    4,
    "Which language is commonly used for data science?",
    "Java",
    "Python",
    "CSS",
    "HTML",
    "Python"
);

questions[4] = new Question(
    5,
    "Which keyword is used to create an object in Java?",
    "class",
    "new",
    "this",
    "static",
    "new"
); 

        }

        public void displayQuestions()
        {
            int i = 0;
           for (Question q : questions) {

    System.out.println("Question no.: " + q.getId());
    System.out.println(q.getQuestion());
    System.out.println(q.getOpt1());
    System.out.println(q.getOpt2());
    System.out.println(q.getOpt3());
    System.out.println(q.getOpt4());
    Scanner sc =new Scanner(System.in);
  selection[i] =  sc.nextLine();
  i++;

}
        for(String s :selection)
        {
            System.out.println(s);
        }
        }


        public void printScore(){
            int  score = 0;
            for(int i =0;i<questions.length;i++){
                Question que = questions[i];
                String answer = que.getAnswer();

                String userAnswer =  selection[i];
                if(answer.equals(userAnswer))
                {
                    score++;
                }
            }
            System.out.println("score :" + score);
        }
    
}
 