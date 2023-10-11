public abstract class Pet{
    protected int age;
    protected Color color;
    protected Shelter shelter;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return age = 2;
    }

    final public String getInfo() {
        return "age: " + getAge() + "color:" + getColor() + " shelter : " + getShelter();
    }
}
