package demoincapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();

        stu.setFirstName("Mohammad");
        stu.setLastname("Reza");
        stu.setStudentId(101);
        stu.department = "QA";
        stu.setDepartment("QAaaa");


        stu.studentinfo();


        /*stu1.firstName = "Leon";
        stu1.lastname = "Subhan";
        stu1.studentId = 102;
        stu1.department = "QA";

        stu1.studentinfo();

        stu2.firstName = "Ali";
        stu2.lastname = "Murtaza";
        stu2.studentId = 103;
        stu2.department = "QA";

        stu2.studentinfo();

        stu3.firstName = "Sarwat";
        stu3.lastname = "Wasim";
        stu3.studentId = 104;
        stu3.department = "QA";

        stu3.studentinfo();

        stu4.firstName = "Noshin";
        stu4.lastname = "Rahman";
        stu4.studentId = 105;
        stu4.department = "QA";

        stu4.studentinfo();*/

    }

}
