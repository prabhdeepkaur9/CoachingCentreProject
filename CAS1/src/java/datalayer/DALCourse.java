 
package datalayer;
import java.sql.*;
import java.util.ArrayList;
public class DALCourse {
    
    private Connection cn;

    public DALCourse() {
        
        cn=DBOperations.getConnection();
    }
    public eStatus saveCourse(beans.Course course)
    {
           
        eStatus ret=null;
        try
        {       Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(("select * from courses where CourseName='"+course.getCourseName()+"'"));
                if(rs.next()==true)
                {
                    ret=eStatus.Duplicate;
                }
                rs.close();
                
                if(ret==null)
                {
             PreparedStatement ps=cn.prepareStatement("insert into Courses values(?,?,?)");
             ps.setString(1,course.getCourseName());
             ps.setFloat(2, course.getFee());
             ps.setString(3, course.getDuration());
             
             ps.executeUpdate();
       
             ret=eStatus.Succeeded;
                }}//try
        catch(Exception ex)
        {
   
         ret=eStatus.Fail;
   
         }//catch
   
            return ret;
        }//function 
    
      
         
        public eStatus deleteCourse(int pCourseId)
        {   
            eStatus ret=null;
            try{
                
                
                PreparedStatement ps=cn.prepareStatement("delete from Courses where CourseId=?");
                   ps.setInt(1, pCourseId);
                   ps.executeUpdate();
                   ret=eStatus.Delete;
            
                }
            catch(Exception ex)
            {
            
            ret=eStatus.Fail;            
            }    

            return ret;

}//Function   
        
        public ArrayList<beans.Course> getCourses()
        {       
            ArrayList<beans.Course> AllCourses=new ArrayList<beans.Course>();
            try
            {
            
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery("Select * from Courses");
                
                beans.Course c;
                
                while(rs.next())
                {
                      c=new beans.Course();
                      c.setCourseId(rs.getInt("CourseId"));
                      c.setCourseName(rs.getString("CourseName"));
                      c.setFee(rs.getFloat("Fee"));
                      c.setDuration(rs.getString("Duration"));
                      
                      AllCourses.add(c);
                      
                }//while
                rs.close();
                
                }//try
            
            catch(Exception ex)
            {    
                System.out.println(ex); 
            }   //catch 
                
        return AllCourses;
       }//function
}//Class
       