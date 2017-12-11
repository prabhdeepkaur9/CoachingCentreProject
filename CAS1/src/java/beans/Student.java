package beans;
public class Student {
   private int Registrationid;
   private String Name;
   private String Gender;
   public beans.Course CourseInfo=new Course();

    public int getRegistrationid() {
        return Registrationid;
    }

    public void setRegistrationid(int Registrationid) {
        this.Registrationid = Registrationid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
