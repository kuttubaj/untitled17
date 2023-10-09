final public class GTX extends Nitro{
private int age;
private Dell dell;

    public GTX(int nvidia) {
        super(nvidia);
    }

    public int getAge() {
        return age;
    }

    public Dell getDell() {
        return dell;
    }

    @Override
    public void coreI5(String name) {
        super.coreI5(name);
        System.out.println("я перезаписан");
    }
}
