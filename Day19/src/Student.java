public class Student extends Branch{
    private String studentName;
    private int studentId;

    public Student(String collegeName, int collegeId, String collegePlace, String branchName,
                   int branchId, String studentName, int studentId) {
        super(collegeName, collegeId, collegePlace, branchName, branchId);
        this.studentName = studentName;
        this.studentId = studentId;
    }
    public void displayStudent(){
        displayCollege();
        displayBranch();
        System.out.println("Branch Id : "+getBranchId() + " (By accessing Private attribute )");
        System.out.println("Student Name : "+studentName);
        System.out.println("Student ID : "+studentId);
        System.out.println("----------------------------");
    }

}
