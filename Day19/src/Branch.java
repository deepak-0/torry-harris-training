public class Branch extends College{
     private String branchName;
     private  int branchId;

    public Branch(String collegeName, int collegeId, String collegePlace, String branchName, int branchId) {
        super(collegeName, collegeId, collegePlace);
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public void displayBranch(){
        System.out.println("Branch Name : "+branchName);
        System.out.println("Branch Id : "+branchId  );
    }
}
