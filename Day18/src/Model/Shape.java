package Model;

public abstract class Shape {
  private int noOfSides;

  abstract public void area();

  public int getNoOsSides(){
      return noOfSides;
  }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }
}
