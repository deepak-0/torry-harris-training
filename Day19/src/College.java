public class College {
    private String collegeName;
    private int collegeId;
    private String collegePlace;



    public College(String collegeName, int collegeId, String collegePlace) {
        this.collegeName = collegeName;
        this.collegeId = collegeId;
        this.collegePlace = collegePlace;
    }

    public void displayCollege(){
        System.out.println("College Name : "+collegeName);
        System.out.println("College ID : "+collegeId);
        System.out.println("College Place : "+collegePlace);
    }
}
