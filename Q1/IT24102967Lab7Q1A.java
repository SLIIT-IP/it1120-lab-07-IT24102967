import java.util.Scanner;

public class IT24102967Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4];
        int sum = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i]; 
        }

        
        double average = sum / 4.0;

       
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

 
    }
} 
