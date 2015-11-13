# Homework 9: Methods and Loops
### Introduction
In this assignment I will simplify the addition game from homework 6 using methods and loops. Methods are a way to simplify code, and loops are used to repeatedly run the same code a number of times. This project will be using Git for source code management, and can be found at the url: https://github.com/dakotadavis/Addition-Game-Loops.git
### Outline

### References and Literature
* Liang, Y. (2014). Introduction to Java programming: Comprehensive version (Tenth ed.).

* Dr. Evert's AdditionGameLoopMethods example (as a template for my code).

### Code
```Java
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
				//Display final score
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
```
### Console Output
Let's play a game!

With every correct answer, the next question will be harder.

With every incorrect answer, the next question will be easier.

There will be four rounds.

Good luck!

Round 1) Add 7 and 2: 9

Correct. Score: 10. 

Round 2) Add 95 and 89: 184

Correct. Score: 110. 

Round 3) Add 437 and 697: 1134

Correct. Score: 1110. 

Round 4) Add 1942 and 6688: 8630

Correct. Score: 11110. 

Game over. 

Your final score is: 11110

Congratulations, you got the high score!


### Command Prompt
**All previous git commands were lost, as I didn't know the command prompt began deleting lines as you advance.**

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git commit -m "trying to get t
o a good starting point"
[master 84d4740] trying to get to a good starting point
 1 file changed, 1 insertion(+)
 create mode 160000 workspace/COMSCI_HW9_Dakota_Davis/Addition-Game-Loops

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git push
fatal: No configured push destination.
Either specify the URL from the command-line or configure a remote repository us
ing

    git remote add <name> <url>

and then push using the remote name

    git push <name>


C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git remote add Addition-Game-L
oops https://github.com/dakotadavis/Addition-Game-Loops.git
fatal: remote Addition-Game-Loops already exists.

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git push Addition-Game-Loops
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream Addition-Game-Loops master


C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git push --set-upstream Additi
on-Game-Loops master
Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 24, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (22/22), done.
Writing objects: 100% (24/24), 4.53 KiB | 0 bytes/s, done.
Total 24 (delta 7), reused 0 (delta 0)
To https://github.com/dakotadavis/Addition-Game-Loops.git
   6302f8e..84d4740  master -> master
Branch master set up to track remote branch master from Addition-Game-Loops.


C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git add .

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git commit -m "still trying...
"
On branch master
Your branch is up-to-date with 'Addition-Game-Loops/master'.
Changes not staged for commit:
        modified:   ../COMSCI_HW5_Dakota_Davis/bin/COMSCI_HW5_Dakota_Davis.class

        modified:   ../COMSCI_HW5_Dakota_Davis/src/COMSCI_HW5_Dakota_Davis.java

Untracked files:
        ../../.eclipse/
        ../../.hydrogen/
        ../../.oracle_jre_usage/
        ../../.p2/
        ../../AppData/
        ../../COMSCI_4_16_1411/
        ../../Contacts/
        ../../Desktop/
        ../../Documents/
        ../../Downloads/
        ../../Favorites/
        ../../Links/
        ../../Music/
        ../../NTUSER.DAT
        ../../NTUSER.DAT{bbed3e3a-0b41-11e3-8249-d6927d06400b}.TxR.0.regtrans-ms

        ../../NTUSER.DAT{bbed3e3a-0b41-11e3-8249-d6927d06400b}.TxR.1.regtrans-ms

        ../../NTUSER.DAT{bbed3e3a-0b41-11e3-8249-d6927d06400b}.TxR.2.regtrans-ms

        ../../NTUSER.DAT{bbed3e3a-0b41-11e3-8249-d6927d06400b}.TxR.blf
        ../../NTUSER.DAT{bbed3e3b-0b41-11e3-8249-d6927d06400b}.TM.blf
        ../../NTUSER.DAT{bbed3e3b-0b41-11e3-8249-d6927d06400b}.TMContainer000000
00000000000001.regtrans-ms
        ../../NTUSER.DAT{bbed3e3b-0b41-11e3-8249-d6927d06400b}.TMContainer000000
00000000000002.regtrans-ms
        ../../OneDrive/
        ../../Pictures/
        ../../README.md
        ../../Rhiannon.h2song
        ../../Rhiannon.wav
        ../../Rhiannon2.wav
        ../../Saved Games/
        ../../Searches/
        ../../Tracing/
        ../../Videos/
        ../../eclipse/
        ../../map.rdm
        ../../ntuser.dat.LOG1
        ../../ntuser.dat.LOG2
        ../../ntuser.ini
        ../.metadata/
        ../.recommenders/
        ../COMSC1_HW2_Dakota_Davis/
        ../COMSC1_HW3_Dakota Davis/
        ../COMSC1_HW4_Dakota_Davis/
        ../COMSCI_HW5_Dakota_Davis/README.md
        ../COMSCI_HW5_Dakota_Davis/bin/yo.class
        ../COMSCI_HW5_Dakota_Davis/src/yo.java
        ../COMSCI_HW9_Dakota_/
        ../COMSCI_HW9_Methods_&_Loops/
        ../COMSC_1033_HW1_Davis_Dakota/
        ../yo/

no changes added to commit

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Everything up-to-date

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git add .

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git commit -m "finished game u
sing Dr. Evert's template."
[master 1d5e044] finished game using Dr. Evert's template.
 2 files changed, 75 insertions(+), 3 deletions(-)
 rewrite workspace/COMSCI_HW9_Dakota_Davis/bin/COMSCI_HW9_Dakota_Davis.class (74
%)

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 2.83 KiB | 0 bytes/s, done.
Total 8 (delta 3), reused 0 (delta 0)
To https://github.com/dakotadavis/Addition-Game-Loops.git
   84d4740..1d5e044  master -> master

C:\Users\Dakota\workspace\COMSCI_HW9_Dakota_Davis>

### Summary
For this assignment I learned the significance of methods and loops. The methods used in this assignment were much easier to manage than the several lines of code needed for each rode previously. Methods also mean I am able to make this game conceivably infinite if I'd like. I can see the loops used in the assignment being used for a number of very practical applications, including video game Random Number Generation. 
