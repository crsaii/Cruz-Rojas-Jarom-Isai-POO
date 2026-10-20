public class Circular extends FiguraCircular {

    public Circular(int radio) {
        super("Circulo", radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String imprimirFigura() {
        double a = calcularArea();
        double p = calcularPerimetro();
        
        String areaString = String.format("%.2f", a).replace(',', '.');
        String perimetroString = String.format("%.2f", p).replace(',', '.');
        
        return super.imprimirFigura() + 
               "Se imprime un Circulo con radio: " + this.radio + 
               ", area: " + areaString + ", perimetro: " + perimetroString + "\n";
    }
}