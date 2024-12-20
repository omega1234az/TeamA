import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    

    public static int calculateAge(int christainEra) {
        int currentYear = 2024;  
        return currentYear - christainEra;
    }
    

    public static String scoreToGrade(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B+";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C+";
        } else if (score >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Christain Era (Year of Birth): ");
        int christainEra = scanner.nextInt();
        
        System.out.print("Enter Software Testing Score: ");
        int score = scanner.nextInt();
        
        
        int age = calculateAge(christainEra);
        String grade = scoreToGrade(score);
        String filePath = "output/textfile.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("Software Testing Grade: " + grade + "\n");
            System.out.println("Data written to student_info.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
