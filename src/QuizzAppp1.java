
	import java.util.Scanner;

	public class QuizzAppp1 {

	    private static final int rewardAmount = 0;

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); 

	        Player player = new Player(name, age);

	        
	        System.out.print("Are you ready to take the quiz? (yes/no): ");
	        String ready = scanner.nextLine();

	        if (!ready.equalsIgnoreCase("yes")) {
	            System.out.println("Game terminated.");
	            return;
	        }

	    
	        System.out.println("Welcome to the Quiz App!");
	        System.out.println("Rules:");
	        System.out.println("- Each question has 4 options.");
	        System.out.println("- You have 2 lifelines.");
	        System.out.println("- Lifelines can be used only once.");
	        System.out.println("- Wrong answer terminates the game.");

	        
	        int currentQuestion = 0;
	        int score = 0;
	        int lifelinesUsed = 0;

	        while (true) {
	            System.out.println("\nQuestion " + (currentQuestion + 1) + ":");
	            System.out.println("Options:");
	            System.out.println("1. Option A");
	            System.out.println("2. Option B");
	            System.out.println("3. Option C");
	            System.out.println("4. Option D");

	            if (lifelinesUsed < 2) {
	                System.out.println("Do you want to use a lifeline? (yes/no): ");
	                String useLifeline = scanner.nextLine();

	                if (useLifeline.equalsIgnoreCase("yes")) {
	                    if (lifelinesUsed < 2) { 
	                        System.out.println("Choose lifeline:");
	                        System.out.println("1. 50-50");
	                        System.out.println("2. Ask the Audience");
	                        int lifelineChoice = scanner.nextInt();
	                        scanner.nextLine(); 

	                        if (lifelineChoice == 1) {
	                            System.out.println("50-50 lifeline used.");
	                            lifelinesUsed++;
	                        } else if (lifelineChoice == 2) {
	                            System.out.println("Ask the Audience lifeline used.");
	                            lifelinesUsed++;
	                        } else {
	                            System.out.println("Invalid lifeline choice.");
	                        }
	                    } else {
	                        System.out.println("No lifelines remaining.");
	                    }
	                }
	            }

	            System.out.print("Enter your answer (1-4): ");
	            int answer = scanner.nextInt();
	            scanner.nextLine(); 

	            if (answer == answer) {
	                score += rewardAmount;
	                System.out.println("Correct! Your score is: " + score);
	                currentQuestion++;
	            } else {
	                System.out.println("Wrong answer! Game over.");
	                System.out.println("Your final score is: " + score);
	                break;
	            }
	        }

	        scanner.close();
	    }
	}

	class Player {
	    private String name;
	    private int age;

	    public Player(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    	}

