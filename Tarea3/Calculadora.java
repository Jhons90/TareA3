
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora{
   
    public String calcularEcuacion(int a,int b,int c){
        String res;
        int D=((b*b)-(4*a*c));
        
        
        if(D>=0){

            double x1=((-b+ Math.sqrt(D)) /(2*a));
            double x2=((-b-Math.sqrt(D))/(2*a));

            res="primera solucion"+ x1+ "segunda solucion"+x2;

        }else{
            res="no hay solucion real";
        }
        return res;
    }

    public String verificarEcuacion(int xp1,int yp1,int xp2,int yp2){
        String res;
        
        int m=(yp2-yp1);
        int n=(xp2-xp1);
        res="y-yp1="+m+"/"+n+"(x-xp1)";
        return res;

    }

    public double calcularCateto (double cateto,double hipotemusa){
        double res;
        res=Math.sqrt(Math.pow((hipotemusa),2)-(Math.pow ((cateto),2)));
  
        return res;
    }
}

