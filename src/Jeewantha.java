import java.util.Scanner;

class Student{
    public void details(){
        Scanner scan= new Scanner(System.in);
        String s;
        int n,m;
        System.out.println("Welcome to University Management System\n");
        System.out.println("...");
        System.out.println("Student Registration\n");
        System.out.println("Please submit followint informations,");
        System.out.println("1.Name :");
        s=scan.nextLine();
        System.out.println("2.Age :");
        n=scan.nextInt();
        System.out.println("3. Select course number from following list,\n[1] SENG 11111 - Introduction to Programming\n[2] SENG 11112 - Fundamentals of Engineering\n[3] SENG 11113 - Data Structures and Algorithms");
        m=scan.nextInt();

        System.out.println("Welcome to University Management System\n");
        System.out.println("...");
        System.out.println("Student Registration Completed,");
        System.out.println("Name    :"+ s);
        System.out.println("Age     :"+n);
        switch (m){
            case 1: System.out.println("Subject : SENG 11111: Introduction to Programming"); break;
            case 2: System.out.println("Subject : SENG 11112: Fundamentals of Engineering"); break;
            case 3: System.out.println("Subject : SENG 11113: Data Structures and Algorithms"); break;
        }
    }
}

class Lecture{
    public void details(){
        Scanner scan= new Scanner(System.in);
        String s;
        int n,m;
        System.out.println("Welcome to University Management System\n");
        System.out.println("...");
        System.out.println("Lecturer Registration\n");
        System.out.println("Please submit followint informations,");
        System.out.println("1.Name :");
        s=scan.nextLine();
        System.out.println("2.Age :");
        n=scan.nextInt();
        System.out.println("3. Select course number from following list,\n[1] SENG 11111 - Introduction to Programming\n[2] SENG 11112 - Fundamentals of Engineering\n[3] SENG 11113 - Data Structures and Algorithms");
        m=scan.nextInt();

        System.out.println("Welcome to University Management System\n");
        System.out.println("...");
        System.out.println("Lecturer Registration Completed,");
        System.out.println("Name    :"+ s);
        System.out.println("Age     :"+n);
        switch (m){
            case 1: System.out.println("Subject : SENG 11111: Introduction to Programming"); break;
            case 2: System.out.println("Subject : SENG 11112: Fundamentals of Engineering"); break;
            case 3: System.out.println("Subject : SENG 11113: Data Structures and Algorithms"); break;
        }
    }
}

public class Jeewantha {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to University Management System\n");
        System.out.println("Please select an option to proceed,");
        System.out.println("Press [1] Register as a Student");
        System.out.println("Press [2] Register as a Lecturer");
        int n;
        n= scan.nextInt();
        Student new1= new Student();
        Lecture new2= new Lecture();
        if(n==1){
            new1.details();
        }
        else if(n==2){
            new2.details();
        }
        else{
            System.out.println("Wrong!!!");
        }
    }
}
