public class Pet{
    int age;
    Color color;
    Shelter shelter;


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

    public String getInfo() {
        return "age: " + getAge() + "color:" + getColor() + " shelter : " + getShelter();
    }
}
