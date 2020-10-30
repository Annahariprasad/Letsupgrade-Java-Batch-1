//QUIZ APPLICATION

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        //Quiz Application
        Game game  = new Game();
        game.initGame();
        game.play();
    }    
}

class Question{

    String question,option1,option2,option3,option4;
    int correctAnswer, userAnswer;
    Scanner sc = new Scanner(System.in);

    public boolean askQuestion(){
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Enter your answer : ");
        userAnswer = sc.nextInt();
        if(correctAnswer == userAnswer){
            return true;
        }
            return false;
    }
}

class Player{

    Scanner sc = new Scanner(System.in);
    String name; int score = 0;

    public void getDetails(){
        System.out.println("Player Name : ");
        name = sc.next();    
    }
}

class Game{

    Player player = new Player();
    Question questions[] = new Question[5];
    String[] questionsdata = {"\nWhich is Thor's Weapon","\nWhich is IronMan's Weapon"};
    String[] options1 = {"Shield","Arrow"};
    String[] options2 = {"Arrow","Shield"};
    String[] options3 = {"Guns","ArmorSuit"};
    String[] options4 = {"ThunderAxe","KarateSkills"};
    int[] correctAnswers = {4,3};
    public void initGame(){
        for(int i=0; i<2; i++){
            questions[i] = new Question();
        }
        for(int i=0; i<2; i++){
        questions[i].question = questionsdata[i];
        questions[i].option1 = options1[i];
        questions[i].option2 = options2[i];
        questions[i].option3 = options3[i];
        questions[i].option4 = options4[i];
        questions[i].correctAnswer = correctAnswers[i];
        }
 }

    public void play(){

        player.getDetails();
        for(int i=0; i<2; i++){
            boolean status = questions[i].askQuestion();
        if(status == true){
            player.score++;
            System.out.println("Amazing Your answer is right!!\n");
        } else {
            System.out.println("Sorry man Ur answer is wrong!!\n");
        } 
    } 
        System.out.println(player.name+" your score is "+player.score);
    } 
}