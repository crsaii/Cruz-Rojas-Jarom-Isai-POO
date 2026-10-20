public class Main {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.print(f.imprimirFigura());
        
        f = new Circular(3);
        System.out.print(f.imprimirFigura());
    }
}