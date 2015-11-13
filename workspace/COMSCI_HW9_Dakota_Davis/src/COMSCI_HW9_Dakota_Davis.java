import java.util.Scanner;
public class COMSCI_HW9_Dakota_Davis {
	public static void main(String[] args) {
		
		//Introduction copied from my previous submission
		System.out.println("Let's play a game!");
		System.out.println("With every correct answer, the next question will be harder.");
		System.out.println("With every incorrect answer, the next question will be easier.");
		System.out.println("There will be four rounds.");
		System.out.println("Good luck!");
		
		//Call the addition game method.
		AdditionGameMethod();
	}
	//Create a method for the Addition Game
	public static void AdditionGameMethod() {
		
		//Set up variables
		int difficulty = 10;
		int difficultyIncrement = 10;
		int score = 0;
		
		// Create a for loop to run four rounds
		int numberOfRounds = 4;
		for(int Round = 1; 
		Round <= numberOfRounds;  
		Round = Round + 1){
			
			System.out.print("Round " + Round + ")");
			boolean isAnswerCorrect = getAndCheckStudentAnswer(difficulty);
			if(isAnswerCorrect){
				System.out.print("Score: ");
				score = score + difficulty;
				System.out.println(score + ". ");
				
				//Increase the difficulty when correct.
				if(Round<numberOfRounds){
					difficulty = difficulty * difficultyIncrement;

				}
			}else{
				//Decrease the difficulty when incorrect.
				System.out.print("Your score is " + score + ". ");
				if(Round<numberOfRounds){
					if(difficulty>5){
						difficulty = difficulty / difficultyIncrement;
					}
					System.out.println(difficulty + ".");
					
				}
				
			}
		}
		System.out.println("Game over. ");
		System.out.println("Your final score is: " + score);
		if(score == 11110){
		System.out.println("Congratulations, you got the high score!");}
	}
	//Create boolean to receive and check the input.
	public static boolean getAndCheckStudentAnswer(int hardness) {
		int number1 = (int)(Math.random()*hardness);
		int number2 = (int)(Math.random()*hardness);
		System.out.print(" Add " + number1 + " and " + number2 +": ");
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (number1 + number2)){
			System.out.print("Correct. ");
			return true;
		}else{
			System.out.println("Incorrect. Correct answer was: " 
					+ (number1 + number2) + ".");
			return false;
		}

}




	}

