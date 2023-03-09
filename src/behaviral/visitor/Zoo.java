package behaviral.visitor;

public class Zoo implements IPlace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
