final public class Bear extends Animal{
private Color color;

    public Bear(ToyType toyType, Material material,Factory factory, String name, Color color) {
        super(toyType, material, factory, name);
        this.color = color;
    }


    public Color getColor() {
        return color;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }

    @Override
    void makeVoice() {
        super.makeVoice("RRRRR! Hi!");
    }
}
