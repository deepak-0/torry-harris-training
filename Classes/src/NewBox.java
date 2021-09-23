public class NewBox {
    private int length;
    private int width;
    private int height;

    public NewBox(int length,int width,int height){
        this.height=height;
        this.width=width;
        this.length=length;
    }
    public void display(){
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Length :"+length);

    }
    public int getVolume(){
        return height*width*length;
    }
    public int getLength(){
        return length*(20/100);
    }
    public int getWidth(){
        return width*(30/100);
    }
    public int getHeight(){
        return height*(10/100);
    }

}
