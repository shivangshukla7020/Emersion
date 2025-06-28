import java.util.*;

public class QuizPlatform{
    String[] correctAns;
    List<Integer> userScores;
    String[] userAns;
    int score = -1;

    public QuizPlatform(){
        this.correctAns = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        this.userScores = new ArrayList<>();
    }

    public void addAns(String[] userAns){

        try{
            if(this.score != -1){
                userScores.add(score);
                this.score = -1;
            }
            if(userAns.length != 10){
                throw new Exception("InvalidQuizSubmissionException");
            }
            this.userAns = userAns;
        }
        catch(Exception e){
            System.out.println("Wrong input Provided");
        }
    }

    public void compareAns(){
        checkInput();
        for(int i = 0; i < 10; i++){
            System.out.println(i+1 + " : " + (correctAns[i].equals(this.userAns[i]) ? "Correct" : "Wrong"));
        }
    }

    public int getScore(){
        checkInput();

        int score = 0;

        for(int i = 0; i < 10; i++){
            score += this.userAns[i].equals(correctAns[i]) ? 1 : 0;
        }

        this.score = score;
        
        return score;
    }

    public char getGrade(){
        checkInput();

        int score = getScore();

        if(score > 8){
            return 'A';
        }
        else if(score > 7){
            return 'B';
        }
        else if(score > 5){
            return 'C';
        }
        return 'D';
    }

    private void checkInput(){
        try{
            if(this.userAns == null){
                throw new Exception("No input provided");
            }
        }
        catch(Exception e){
            System.out.println("No Input Provided");
        }
    }

    public static void main(String[] args){
        QuizPlatform qp = new QuizPlatform();

        String[] userAns = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        qp.addAns(userAns);
        qp.compareAns();

    }
}