package datalayer;
import beans.Student;
import java.sql.*;
import java.util.ArrayList;

public class DALStudent {
    
    private Connection cn;
    
    public DALStudent()
    {
            
    }
    public eStatus saveStudent(beans.Student student)
    {
        eStatus ret=null;
         cn=DBOperations.getConnection();
    
        
        try{
                    if(ret==null)
                    {
                        PreparedStatement ps=cn.prepareStatement("insert into Students values(?,?,?)");
            
                        ps.setString(1, student.getName());
                         ps.setString(2, student.getGender());
                           ps.setInt(3,student.CourseInfo.getCourseId());
            
            ps.executeUpdate();
            ret = eStatus.Succeeded;   
                    }//if
        }//try
        
        catch(Exception ex)
        {
           ret = eStatus.Fail;
        
       }
    
    return ret;
    }//function
    
    public ArrayList<beans.Student> getStudents()
    {
     ArrayList<beans.Student> AllStudents=new ArrayList<beans.Student>();
      try{
      
      Statement st=cn.createStatement();
      ResultSet rs=st.executeQuery("Select S.RegistrationId,S.Name,S.Gender,C.CourseId from  courses as [C],students as [S] where C.CourseId=S.CourseId" );
      beans.Student s;
      
      while(rs.next())
      {
      
      s=new Student();
      s.setRegistrationid(rs.getInt("RegistrationId"));
      s.setName(rs.getString("Name"));
      s.setGender(rs.getString("Gender"));
      s.CourseInfo.setCourseId(rs.getInt("CourseId"));
      
      AllStudents.add(s);
      
      
      
      }
      
      rs.close();
      }//try
      
      catch(Exception ex)
      {
      System.out.println(ex);
      
      }
      
      return AllStudents;
    }
    
    
    
    
}
