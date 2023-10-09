
public class Main {
    public static void main(String[] args) {
//        Shelter shelter1 = new Shelter("myagkie ruchki", "-");
//        Shelter shelter2 = new Shelter("geeks", "-");
//        Dog dog1 = new Dog("Barsik", "avcharka", "day lapy");
//        Dog dog2 = new Dog("Simba", "lev", Color.BROWN, shelter1);
//        Dog dog3 = new Dog("Blinchik", "kuxnya", Color.WHITE, shelter2, "lojis");
//
//        System.out.println(dog1.getInfo());
//        System.out.println(dog2.getInfo());
//        System.out.println(dog3.getInfo());
//        dog1.makeVoice("nyam - nyam", 2);
//        dog1.makeVoice("rrrrrr");
//        dog1.makeVoice();

        Nitro objectA = new Nitro(5);
        GTX objectB = new GTX(9);
        GTX objectC = new GTX(2);

        System.out.println(objectA.getData() + objectA.getNvidia());
        System.out.println(objectB.getAge() + objectB.getNvidia() + objectB.getData());
        System.out.println(objectC.getAge() + objectC.getNvidia() + objectC.getData());

        objectA.coreI5();
        objectB.coreI5();
        objectC.coreI5();

    }
}