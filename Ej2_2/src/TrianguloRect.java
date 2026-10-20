public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        super("Triangulo", ancho, alto);
    }

    @Override
    public double calcularArea() {
        double resultado = (this.base * this.altura) / 2.0;
        return resultado;
    }

    @Override
    public double calcularPerimetro() {
        double cateto1 = this.base;
        double cateto2 = this.altura;
        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        
        double perimetro = cateto1 + cateto2 + hipotenusa;
        return perimetro;
    }

    @Override
    public String imprimirFigura() {
        double a = calcularArea();
        double p = calcularPerimetro();
        
        String areaString = String.format("%.2f", a).replace(',', '.');
        String perimetroString = String.format("%.2f", p).replace(',', '.');
        
        return super.imprimirFigura() + 
               "Se imprime un Triangulo con alto: " + this.altura + ", ancho: " + this.base + 
               ", area: " + areaString + ", perimetro: " + perimetroString + "\n";
    }
}