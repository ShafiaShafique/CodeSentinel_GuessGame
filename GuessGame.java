import java.util.Scanner;

class game{
    Scanner sc = new Scanner(System.in);
    int generated_num;
    int user_num;
    int guesses;
    public game(){
        generated_num = (int)(Math.random()*100)+1;
        user();
    }
    public void user(){
        System.out.println("Enter number: ");
        user_num = sc.nextInt();
        isCorrect();
    }
    public void setGuesses(int n){
        guesses = n;
    }
    public void isCorrect(){
        if(user_num == generated_num){
            getGuesses();
        }
        else if(user_num > generated_num){
            System.out.println("Your Entered Number is Greater than Generated Number");
            guesses += 1;
           user();
        }
        else if(user_num < generated_num){
            System.out.println("Your Entered Number is Smaller than Generated Number");
            guesses += 1;
            user();
        }
    }
    public void getGuesses(){
        System.out.println("You guessed after trying "+ guesses +" times!");

    }
}
public class GuessGame {
    public static void main(String[] args) {
        game g = new game();
        g.setGuesses(0);
    }
}
