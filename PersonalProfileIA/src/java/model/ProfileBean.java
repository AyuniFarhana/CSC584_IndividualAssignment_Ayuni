package model;
public class ProfileBean {
    private String studentid;
    private String name;
    private String program;
    private String email;
    private String hobbies;
    private String intro;
    
    public ProfileBean() {}
    
    public ProfileBean(String studentid, String name, String program, String email, String hobbies, String intro){
        this.studentid=studentid;
        this.name=name;
        this.program=program;
        this.email=email;
        this.hobbies=hobbies;
        this.intro=intro;
    }
    
    //getter method
    public String getStudentid(){
        return studentid;
    }
    public String getName(){
        return name;
    }
    public String getProgram(){
        return program;
    }
    public String getEmail(){
        return email;
    }
    public String getHobbies(){
        return hobbies;
    }
    public String getIntro(){
        return intro;
    }
    
    //setter method
    public void setStudentid(String studentid){
        this.studentid=studentid;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setHobbies(String hobbies){
        this.hobbies=hobbies;
    }
    public void setIntro(String intro){
        this.intro=intro;
    }
}
