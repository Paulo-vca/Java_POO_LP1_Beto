package lp.ponto;

public class XeY_ponto {
    //Atributos
    private double x = 0;
    private double y = 0;
        
    public XeY_ponto() {}


    public XeY_ponto(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }
    // Metodos

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void move(double nX, double nY) {
        this.x = nX;
        this.y = nY; 
    }

    public double distance(XeY_ponto p1, XeY_ponto p2) {
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        System.out.println(Math.sqrt(d));
        return Math.sqrt(d);
    }

    public String toString(){
        return "Ponto ("+ this.x +","+ this.y +")";
    }
}
