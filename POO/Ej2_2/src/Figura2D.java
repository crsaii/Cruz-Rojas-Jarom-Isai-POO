public abstract class Figura2D implements FiguraPlana {
    protected String figura;

    public Figura2D(String figura) {
        this.figura = figura;
    }

    public String imprimirFigura() {
        return "Se imprime una FiguraPlana...\n";
    }
}