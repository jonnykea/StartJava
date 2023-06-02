package tasks.decorator;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return  decorateWithGarland() + tree.decorate();
    }

    private String decorateWithGarland() {
        return "with Garland ";
    }
}
