package database;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter your choice: 1.InsertData 2.Update name 3.Delete Data 4.Read data 5.Exit");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Roll no:");
                    int RollNo=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String Name=sc.nextLine();
                    System.out.println("Enter email:");
                    String email=sc.nextLine();
                    Student stu=new Student(RollNo,Name,email);
                    StudentDBMS.InsertData(stu);
                    break;
                case 2:
                    System.out.println("Enter the Rollno to update:");
                    RollNo=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new Name:");
                    Name=sc.nextLine();
                    StudentDBMS.UpdateData(RollNo,Name);
                    break;
                case 3:
                    System.out.println("Enter the Roll no to delete: ");
                    RollNo=sc.nextInt();
                    StudentDBMS.DeleteData(RollNo);
                    break;
                case 4:
                    StudentDBMS.ReadData();
                    break;

                case 5:
                    System.exit(0);

                default:
                    throw new ArithmeticException();
            }
            
        }
       
    }
}
