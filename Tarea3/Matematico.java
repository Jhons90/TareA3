
/**
 * Write a description of class MatematicoMejorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico{
    private  Calculadora cal;
    public Matematico(){
        this.cal= new Calculadora();
    }

    public String calcularEcuacion(int a,int b,int c){
        String res;
        res=cal.calcularEcuacion( a, b, c);
        return res;

    }

    public String verificarEcuacion(int xp1,int yp1,int xp2,int yp2){
        String res;
        res=cal.verificarEcuacion(xp1,yp1,xp2,yp2);
        return res;
    }

    public double calcularCateto(double cateto,double hipotemusa){
        double res;
        res=cal.calcularCateto(cateto,hipotemusa);
        return res;

    }
}
