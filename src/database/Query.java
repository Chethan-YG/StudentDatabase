package database;
public class Query {
    public static String insertData="insert into Student(RollNo,Name,email) values(?,?,?);";
    public static String updateData="update Student set Name=? where RollNo=?;";
    public static String deleteData="Delete from student where RollNo=?;";
    public static String selectData="Select RollNo, Name, email from Student;";
}
