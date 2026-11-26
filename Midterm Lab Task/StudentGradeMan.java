import java.util.Scanner;
 
    public class StudentGradeMan {
    public static double getAverage(double gr1, double gr2, double gr3)
    {
        double ave=0;
        ave = (gr1 + gr2 +gr3) / 3;
        return ave;
    }
 
    public static String getRemarks(double ave)
    {
        if (ave >=60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
    public static void studInfo(String studNum, String studName, String course, String yearLevel)
    {
        System.out.println("------------------------------");
        System.out.println("Student Number       :" + studNum);
        System.out.println("Student Name         :" + studName);
        System.out.println("Course               :" + course);
        System.out.println("Year Level           :" + yearLevel);
        System.out.println("------------------------------");
 
    }
 
    public static String getEquiv(double ave, char choice)
    {
        String equiv = "";
        switch (Character.toUpperCase(choice)) {
            case 'L':
                if (ave >= 90) {
                    equiv = "A";
                } else if (ave >= 83) {
                        equiv = "B";
                    }
                    else if (ave >= 75) {
                        equiv = "C";
                    }
                    else if (ave >= 60) {
                        equiv = "D";
                    }
                    else {
                        equiv = "F";
                    }
                    break;
 
            case 'N':
                if (ave >= 96) {
                    equiv = "4.00";
                } else if (ave >= 90) {
                        equiv = "3.50";
                    } else if (ave >= 84) {
                        equiv = "3.00";
                    } else if (ave >= 77) {
                        equiv = "2.50";
                    } else if (ave >= 70) {
                        equiv = "2.00";
                    }
                    else {
                        equiv = "1.00";
                    }
                    break;
 
            default:
            equiv = "Invalid choice";
                }
        return equiv;
 
                }
   
    public static void displayResult(double ave, char choice)
    {
      String label;
      if (Character.toUpperCase(choice) == 'L')  {
    label = "Letter Grade is";
    } else {
        label = "Numeric Grade is";
    }
 
    System.out.println("------------------------------");
    System.out.printf("%-20s: %.2f%n", "Average is", ave);
    System.out.printf("%-20s: %s%n", label, getEquiv(ave, choice));
    System.out.printf("%-20s: %s%n", "Remarks", getRemarks(ave));
    System.out.println("------------------------------");
}
    public static void main(String args[])
    {
        double gr1,gr2,gr3;
        Scanner sc = new Scanner(System.in);
   
        System.out.println("------------------------------");
        System.out.print("Student Number            :");
        String studNum = sc.nextLine();
        System.out.print("Student Name              :");
        String studName = sc.nextLine();
        System.out.print("Course                    :");
        String course = sc.nextLine();
        System.out.print("Year Level                :");
        String yearLevel = sc.nextLine();
 
        studInfo(studNum, studName, course, yearLevel);
 
        System.out.println("Enter Grades");
        System.out.printf("Grade 1                  : ");
        gr1 = sc.nextDouble();
        System.out.printf("Grade 2                  : ");
        gr2 = sc.nextDouble();
        System.out.printf("Grade 3                  : ");
        gr3 = sc.nextDouble();
       
        System.out.println("------------------------------");
        System.out.println("Display Letter Grade or Numeric Grade[L|N]?");
        char choice = sc.next().charAt(0);
 
        double average = getAverage(gr1,gr2,gr3);
        displayResult(average, choice);
        sc.close();
    }
}