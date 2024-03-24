
import java.util.Scanner;
public class GradeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double numericValue=0;
         String grade  ="";
        System.out.printf("Enter the grade: ");
        grade= sc.nextLine();
        if (grade.equals("A+") || grade.equals("A"))
        {
            numericValue = 4.0;
        }
        else if (grade.equals("A-"))
        {
           numericValue = 3.7;
        }
        else if (grade.equals("B+"))
        {
          numericValue = 3.3;
        }
        else if (grade.equals("B"))
        {
            numericValue = 3.0;
        }
        else if (grade.equals("B-")) {
            numericValue = 2.7;
        }
        else if (grade.equals("C+"))
        {
          numericValue = 2.3;
        }
        else if (grade.equals("C"))
        {
            numericValue = 2.0;
        }
        else if (grade.equals("C-"))
        {
           numericValue = 1.7;
        }
        else if (grade.equals("D+"))
        {
            numericValue = 1.3;
        }
        else if (grade.equals("D"))
        {
            numericValue = 1.0;
        }
        else
        {
            numericValue = 0;
        }
            System.out.printf("Grade:%.2f",numericValue);
    }
}