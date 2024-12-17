public class Student {
    private String studentID;
    private String name;


    public Student(){
        new Student("00000000","未知");
    }

    public Student(String studnetID,String name){
        this.studentID = studnetID;
        this.name = name;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printDate(){
        System.out.printf("%s %s",studentID,name);
    }
}
