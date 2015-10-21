import java.util.Scanner;
public class COMSCI_HW5_Dakota_Davis {
	public static void main(String[] args) {
        // This is my master branch.
        // Outline for addition problem.
        
		int score = 0;
        int hardnessOfQuestion = 10;
        // Round 1
        //    Generate 2 random numbers
        int number1 = (int)(Math.random() * hardnessOfQuestion);
        int number2 = (int)(Math.random() * hardnessOfQuestion);
        
        int correctAnswer = number1 + number2;
        
        //  Ask the user to add these two numbers together
        System.out.println
        ("What is " + number1 + " + " + number2 + "?");
        
        //  Read in their response
        Scanner input = new Scanner(System.in);
        int studentAnswer = input.nextInt();
        //  Check if the answer was correct
        //        IF correct
        if (studentAnswer == correctAnswer){
            //            Tell them it was correct
            
            //            Give them points
            score += hardnessOfQuestion;
            System.out.println("Score:" + score);
            //            Make the next question harder
            System.out.println("Answer was correct");
            hardnessOfQuestion *= 10;
        }
        //        IF not correct
        else{
            //            Tell them it was wrong
            System.out.println("Answer was not correct");
            //             Tell them the correct answer
            System.out.println("Correct answer was: " + correctAnswer);
            //            Do not give them points
            //            Make the next question easier
            if(hardnessOfQuestion>10){
                hardnessOfQuestion /=10;
            }
            
        }
        // Round 2
        //    Generate 2 random numbers
        int number3 = (int)(Math.random() * hardnessOfQuestion);
        //System.out.println("Number1 is :" + number1 );
        
        int number4 = (int)(Math.random() * hardnessOfQuestion);
        //System.out.println("Number2 is :" + number2 );
        
        int correctAnswer2 = number3 + number4;
        
        //  Ask the user to add these two numbers together
        System.out.println
        ("What is " + number3 + " + " + number4 + "?");
        
        //  Read in their response
        Scanner input2 = new Scanner(System.in);
        int studentAnswer2 = input2.nextInt();
        //  Check if the answer was correct
        //        IF correct
        if (studentAnswer2 == correctAnswer2){
            //            Tell them it was correct
            
            //            Give them points
            score += hardnessOfQuestion;
            System.out.println("Score:" + score);
            //            Make the next question harder
            System.out.println("Answer was correct");
            hardnessOfQuestion *= 10;
        }
        //        IF not correct
        else{
            //            Tell them it was wrong
            System.out.println("Answer was not correct");
            //             Tell them the correct answer
            System.out.println("Correct answer was: " + correctAnswer);
            //            Do not give them points
            //            Make the next question easier
            if(hardnessOfQuestion>10){
                hardnessOfQuestion /=10;
                
        //Round 3
                
                //    Generate 2 random numbers
                int number5 = (int)(Math.random() * hardnessOfQuestion);
                int number6 = (int)(Math.random() * hardnessOfQuestion);
                
                int correctAnswer3 = number5 + number6;
                
                //  Ask the user to add these two numbers together
                System.out.println
                ("What is " + number5 + " + " + number6 + "?");
                
                //  Read in their response
                Scanner input3 = new Scanner(System.in);
                int studentAnswer3 = input.nextInt();
                //  Check if the answer was correct
                //        IF correct
                if (studentAnswer3 == correctAnswer3){
                    //            Tell them it was correct
                    
                    //            Give them points
                    score += hardnessOfQuestion;
                    System.out.println("Score:" + score);
                    //            Make the next question harder
                    System.out.println("Answer was correct");
                    hardnessOfQuestion *= 10;
                }
                //        IF not correct
                else{
                    //            Tell them it was wrong
                    System.out.println("Answer was not correct");
                    //             Tell them the correct answer
                    System.out.println("Correct answer was: " + correctAnswer);
                    //            Do not give them points
                    System.out.println("Score: " + score);
                    //            Make the next question easier
                    if(hardnessOfQuestion>10){
                        hardnessOfQuestion /=10;
                        
                //Round 4
                        // Round 1
                        //    Generate 2 random numbers
                        int number7 = (int)(Math.random() * hardnessOfQuestion);
                        int number8 = (int)(Math.random() * hardnessOfQuestion);
                        
                        int correctAnswer4 = number1 + number2;
                        
                        //  Ask the user to add these two numbers together
                        System.out.println
                        ("What is " + number7 + " + " + number8 + "?");
                        
                        //  Read in their response
                        Scanner input4 = new Scanner(System.in);
                        int studentAnswer4 = input.nextInt();
                        //  Check if the answer was correct
                        //        IF correct
                        if (studentAnswer4 == correctAnswer4){
                            //            Tell them it was correct
                            
                            //            Give them points
                            score += hardnessOfQuestion;
                            System.out.println("Score:" + score);
                            //            Make the next question harder
                            System.out.println("Answer was correct");
                            hardnessOfQuestion *= 10;
                        }
                        //        IF not correct
                        else{
                            //            Tell them it was wrong
                            System.out.println("Answer was not correct");
                            //             Tell them the correct answer
                            System.out.println("Correct answer was: " + correctAnswer);
                            //            Do not give them points
                            //            Make the next question easier
                            if(hardnessOfQuestion>10){
                                hardnessOfQuestion /=10;
                            }
                            
                        }
                    }
                    
                }

            
        }}}    }


	


