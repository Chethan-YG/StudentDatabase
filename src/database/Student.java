package database;
public class Student {
    private int ROllNo;
    private String Name;
    private String email;
    public Student(int RollNo,String Name, String email )
    {
        this.ROllNo=RollNo;
        this.Name=Name;
        this.email=email;
    }


    public int getROllNo()
    {
        return ROllNo;
    }

    public String getName()
    {
        return  Name;
    }

    public String getEmail()
    {
        return email;
    }
}
