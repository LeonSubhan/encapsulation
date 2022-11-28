package demoincapsulation;

public class Student {

    private String firstName;
    private String lastname;
    private int studentId;
    String department;


    public void studentinfo() {
        System.out.println(firstName);
        System.out.println(lastname);
        System.out.println(studentId);
        System.out.println(department);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
