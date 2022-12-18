package mirea.pr7.w4;

public interface MathCalculable {
    static double pow(double x , double i){
        if (i==0) {return 1;}
        double buf = x;
        for (int j = 1; j!=i;j++){
            x*=buf;
        }
        return x;
    }
    static double module(double x,double y){
        return Math.sqrt(((x*x)+(y*y)));
    }
    static double PI(){
        return 3.1415926535;
    }
}
