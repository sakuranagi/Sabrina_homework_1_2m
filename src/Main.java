public class Main {
    public static void main(String[] args) {

        Factory sanrio = new Factory("Sanrio", "China");
        Animal animal = new Animal(ToyType.BEAR, Material.PLUSH, sanrio, "Panda");
        System.out.println(animal.getInfo());
        animal.makeVoice();

        System.out.println("--------------------------------");
        Factory ashdown = new Factory("Ashdown", "England");

        Bear winniePooh = new Bear(ToyType.BEAR, Material.PLUSH, ashdown,"Winnie the Pooh", Color.YELLOW);
        System.out.println(winniePooh.getInfo());
        winniePooh.makeVoice();

        System.out.println("--------------------------------");
        Factory geingen = new Factory("Geingen", "German");
        Bear teddy = new Bear(ToyType.BEAR, Material.PLUSH, geingen, "Teddy", Color.GREY);
        System.out.println(teddy.getInfo());
        teddy.makeVoice("Hi my dear friend");
    }


}