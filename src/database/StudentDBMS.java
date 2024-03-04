package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDBMS {
   public static void InsertData(Student stu) throws SQLException{
       Connection con= DB.connect();
       String query=Query.insertData;
       try
       {
           PreparedStatement pstm=con.prepareStatement(query);
           pstm.setInt(1, stu.getROllNo());
           pstm.setString(2,stu.getName());
           pstm.setString(3, stu.getEmail());
           pstm.executeUpdate();
           con.close();
       }
       catch (Exception e)
       {
           System.out.println("Error; "+ e);
       }

   }

   public static void UpdateData(int Rollno, String Name)
   {
       Connection con= DB.connect();
       String query=Query.updateData;
       try {
           PreparedStatement pstm=con.prepareStatement(query);
           pstm.setString(1,Name);
           pstm.setInt(2,Rollno);
           pstm.execute();
           con.close();
       }
       catch (Exception e)
       {
           System.out.println("Error: "+ e);
       }
   }

   public static void DeleteData(int RollNo)
   {
       Connection con= DB.connect();
       String query=Query.deleteData;
       try {
           PreparedStatement pstm=con.prepareStatement(query);
           pstm.setInt(1,RollNo);
           pstm.execute();
           con.close();
       }
       catch (Exception e)
       {
           System.out.println("Error: "+ e);
       }

   }

   public static void ReadData() throws SQLException {

           Connection con = DB.connect();
           String query = Query.selectData;
           try{
           PreparedStatement pstm = con.prepareStatement(query);
           ResultSet rs = pstm.executeQuery();

           while (rs.next()) {
               int Column1 = rs.getInt("RollNo");
               String Column2 = rs.getString("Name");
               String Column3 = rs.getString("email");
               System.out.println(Column1 + " " + Column2 + " " + Column3);

           }
           con.close();
       }
       catch (Exception e)
       {
           System.out.println("Error"+ e);
       }
   }

}
