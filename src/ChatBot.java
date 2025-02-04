import java.util.Scanner;

class ChatBot {
    private static final Scanner scanner = new Scanner(System.in);
    private final String name;
    private final String birthYear;

    public ChatBot(String name, String birthYear) {
        this.name = name;
        this.birthYear = birthYear;

    }

    public void start() {
        introduceBot();
        askUserName();
        calculateUserAge();
        countToNumber();
        runKnowledgeTest();
        sayGoodbye();
    }

    private void introduceBot() {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    private void askUserName() {
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    private void calculateUserAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    private void countToNumber() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    private void runKnowledgeTest() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (scanner.nextInt() != 2) {
            System.out.println("Please, try again.");
        }
    }

    private void sayGoodbye() {
        System.out.println("Congratulations, have a nice day!");
    }

}