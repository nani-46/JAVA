import java.util.Scanner;

public class QuizApplication {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Are you ready to play? (yes/no): ");
            String ready = scanner.nextLine();

            if (!ready.equalsIgnoreCase("yes")) {
                System.out.println("Thank you! See you next time.");
                return;
            }

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); 

            QuizPlayer1 player = new QuizPlayer1(name, rollNumber);
            
            System.out.println("Welcome to the Quiz Game!");
            System.out.println("\nRules:");
            System.out.println("1. There are 10 questions.");
            System.out.println("2. Each question has 4 options, only one is correct.");
            System.out.println("3. You have 2 lifelines which can be used once each.");
            System.out.println("4. Wrong answers do not terminate the game, but no points are awarded.");
            System.out.println("5. Correct answers reward points, and you proceed to the next question.");

            String[][] questions = {
            		{"What is the size of int in Java?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "2"},
                    {"Which keyword is used to define a class in Java?", "class", "Class", "define", "new", "1"},
                    {"What is the default value of a boolean variable in Java?", "true", "false", "0", "null", "2"},
                    {"Which of these is a valid Java identifier?", "1identifier", "$identifier", "@identifier", "-identifier", "2"},
                    {"Which method is the entry point for a Java program?", "main()", "start()", "run()", "init()", "1"},
                    {"Which operator is used for concatenation in Java?", "&", "*", "+", "%", "3"},
                    {"What is the extension of a compiled Java class file?", ".java", ".class", ".exe", ".txt", "2"},
                    {"Which package is imported by default in all Java programs?", "java.lang", "java.util", "java.io", "java.net", "1"},
                    {"What does JVM stand for?", "Java Virtual Method", "Java Virtual Machine", "Java Variable Management", "Java Version Manager", "2"},
                    {"Which loop in Java executes at least once?", "for", "while", "do-while", "None of the above", "3"}
                };

            int[] rewards = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

            for (int i = 0; i < questions.length; i++) {
                System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);
                System.out.println("1. " + questions[i][1]);
                System.out.println("2. " + questions[i][2]);
                System.out.println("3. " + questions[i][3]);
                System.out.println("4. " + questions[i][4]);

                System.out.println("Lifelines available: " + player.getLifelines());
                System.out.print("Choose an option (1-4) or type 'lifeline': ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("lifeline")) {
                    if (player.getLifelines() > 0) {
                        player.useLifeline();
                        System.out.println("Lifeline used! Here's a hint: the correct answer is option " + questions[i][5]);
                        System.out.print("Now, choose your answer (1-4): ");
                        answer = scanner.nextLine();
                    } else {
                        System.out.println("No lifelines left! Please choose an answer (1-4): ");
                        answer = scanner.nextLine();
                    }
                }

                if (answer.equals(questions[i][5])) {
                    System.out.println("Correct answer!");
                    player.addScore(rewards[i]);
                } else {
                    System.out.println("Wrong answer. The correct answer was option " + questions[i][5] + ".");
                }
            }

            System.out.println("\nCongratulations, " + player.getName() + "! You completed the quiz.");
            System.out.println("Your total score: " + player.getScore());
            System.out.println("Thank you! See you next time");
        }
    }
     
  
     

