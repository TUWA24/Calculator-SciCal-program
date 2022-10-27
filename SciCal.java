
import java.util.*;

public class SciCal extends Calc{
    private double expo;
    private double root;
    private double fact;
    private double cube;
    private double perc;
    private double pm;

    public double getExpo() {
        return expo;
    }
    
    public void setExpo(double expo1, double expo2) {
        double num1 = expo1;
        while(expo2 != 1){
            num1  *=  expo1;
            expo2 --;
        }
        this.expo = num1;
    }

    public double getRoot() {
    return root;
    }

    public void setRoot(double root1) {
        double r = Math.sqrt(root1);
        this.root = r;
        
    }

    public double getFact(double n) {
        if (n == 0)    
        return 1;    
        else    
        return(n * getFact(n-1));    
    }

    public void setFact(double n) {
        this.fact = n;
    }
    
    public double getCube() {
        return cube;
    }

    public void setCube(double c) {
        this.cube = c * c * c;
    }
    
    public double getPerc() {
        return perc;
    }

    public void setPerc(double p, double e) {
        this.perc = (p*100) / e;
    }
    
     public double getPm(double r, double y, double o) {
        return pm = r + y - o;
    }

    public void setPm(double p) {
        this.pm = p;
    }
    
    public SciCal(){
        this.expo = 0;
        this.root = 0;
        this.fact = 0;
        this.cube = 0;
        this.perc = 0;
        this.pm = 0;
    }
    
   public double Display(){
       return this.expo;
   }
   public double Display1(){
       return this.root;
   }
   public double Display2(){
       return this.fact;
   }
   public double Display3(){
       return this.cube;
   }
   public double Display4(){
       return this.perc;
   }
   public double Display5(){
       return this.pm;
   }

   

    


}
