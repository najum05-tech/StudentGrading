import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("=====welCome to quiz grading calculator=====");

        float x;
        while(true) {
            System.out.println("Enter your Quiz marks= ");
            x= grade.nextFloat();
            if (x < 0 || x > 15) {
                System.out.println("Invalid Quiz Marks");
            }
            else
            {
                break;
            }
        }
        float y;
        while(true) {
            System.out.println("Enter your Assignment marks= ");
            y= grade.nextFloat();
            if (y < 0 || y > 10) {
                System.out.println("Invalid Assignment Marks");
            }
            else
            {
                break;
            }
        }
        float z;
        while(true) {
            System.out.println("Enter your Mid marks= ");
            z= grade.nextFloat();
            if (z < 0 || z > 25) {
                System.out.println("Invalid Mid Marks");
            }
            else
            {
                break;
            }
        }
        float f;
        while(true) {
            System.out.println("Enter your Final marks= ");
            f= grade.nextFloat();
            if (f < 0 || f > 50) {
                System.out.println("Invalid Marks");
            }
            else
            {
                break;
            }
        }
        System.out.println("Quiz Marks= " +x);
        System.out.println("Assignment Marks= " +y);
        System.out.println("Mid Marks= " +z);
        System.out.println("Final Marks= " +f);
        System.out.println();

        float total=   x+y+z+f;
        System.out.println("Total Marks= " +total);
        System.out.println();

        double average= total/4;
        System.out.println("Average= " +average);
        System.out.println();

        System.out.println( "Grade= ");
        if(total >= 85) {
            System.out.println("A+");
        }
        else if(total >= 80 && total <= 84) {
            System.out.println("A-");
        }
        else if(total >= 75 && total <= 79) {
            System.out.println("B+");
        }
        else if(total >= 70 && total <= 74) {
            System.out.println("B");
        }
        else if(total >= 65 && total <= 69) {
            System.out.println("B-");
        }
        else if(total >= 60 && total <= 64) {
            System.out.println("C+");
        }
        else if(total >= 55 && total <= 59) {
            System.out.println("C");
        }
        else if(total >= 50 && total <= 54) {
            System.out.println("C-");
        }
        else if(total >= 45 && total <= 49) {
            System.out.println("D+");
        }
        else {
            System.out.println("F");
        }



    }
}