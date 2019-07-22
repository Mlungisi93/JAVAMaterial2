public class Shirt {
    private int collarSize;
    private int sleeveLength;
    private String material;

    public static void main(String[] args)
    {
        Shirt shirt = new Shirt();
        shirt.display();
        Shirt shirt2 = new Shirt(10,20,"Cottton");
        shirt2.display();
    }



    public Shirt()
    {
        collarSize = 0;
        sleeveLength = 0;
        material = "Unknown";
    }

//    Overloaded constuctor
    public Shirt(int collarSize, int sleeveLength, String material)
    {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
        this.material = material;
    }

    public void display()
    {
        System.out.println("Color size: "+getCollarSize()+ " Sleeve length: "+ getSleeveLength()+" Material: "+getMaterial());
    }

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
