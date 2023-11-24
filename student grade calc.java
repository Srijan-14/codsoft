import java.util.Scanner;
class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter marks for subject 1:");
        int m1 = scanner.nextInt();
        System.out.println("Enter marks for subject 2:");
        int m2 = scanner.nextInt();
        System.out.println("Enter marks for subject 3:");
        int m3 = scanner.nextInt();
        System.out.println("Enter marks for subject 4:");
        int m4 = scanner.nextInt();
        System.out.println("Enter marks for subject 5:");
        int m5 = scanner.nextInt();
        int totalMarks = m1+m2+m3+m4+m5;
        double percentage = (totalMarks * 100) / 500;
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Student name: " + name);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}