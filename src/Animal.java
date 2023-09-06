public class Animal extends Toy {
    private String name;


    public Animal(ToyType toyType, Material material, Factory factory, String name) {
        super(toyType, material, factory);
        this.name = name;
    }

    public String getName() {
        return name;
    }


    final void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice() {
        System.out.println("Animal makes voice");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nName: " + name;
    }
}