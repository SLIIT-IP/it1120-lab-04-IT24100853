import java.util.Scanner;

public class IT24100853Lab4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid input for exam marks.Terminating the program ");
            examMarks = input.nextDouble();
        }

        
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid input for lab submission marks.Terminating the program");
            labMarks = input.nextDouble();
        }

        
        System.out.print("Enter percentage taken from exam marks: ");
        double examPercentage = input.nextDouble();
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid input for percentage given from exam marks.Terminating the program ");
            examPercentage = input.nextDouble();
        }

        
        System.out.print("Enter percentage taken from lab submission marks: ");
        double labPercentage = input.nextDouble();
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid input for percentage given from lab submission marks.Terminating the program");
            labPercentage = input.nextDouble();
        }

        
        while (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100.Terminating the program");

            System.out.print("Enter percentage taken from exam marks: ");
            examPercentage = input.nextDouble();
            while (examPercentage < 0 || examPercentage > 100) {
                System.out.print("Invalid input for percentage given from exam marks.Terminating the program ");
                examPercentage = input.nextDouble();
            }

            System.out.print("Enter percentage taken from lab submission marks: ");
            labPercentage = input.nextDouble();
            while (labPercentage < 0 || labPercentage > 100) {
                System.out.print("Invalid input for percentage given from lab submission marks.Terminating the program ");
                labPercentage = input.nextDouble();
            }
        }

        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("The Exam final mark is: " + finalMark);
    }
}