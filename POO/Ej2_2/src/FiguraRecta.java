public abstract class FiguraRecta extends Figura2D {
    protected int base;
    protected int altura;

    public FiguraRecta(String figura, int base, int altura) {
        super(figura);
        this.base = base;
        this.altura = altura;
    }
}