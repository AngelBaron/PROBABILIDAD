/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probalidadyestadistica;

/**
 *
 * @author lucho
 */
public class Calculo {
    public double binomial(double n, double x,double p){
        double res=0, factn=1,factx=1,factnx=1;
        
        for(int i=1;i<=n;i++){
            factn *=i;
            
        }
        for(int i=1; i<=x;i++){
            factx *=i;
            
        }
        for(int i=1; i<=n-x;i++){
            factnx *=i;
            
        }
        
        res=(factn/((factx)*(factnx)))*Math.pow(p, x)*Math.pow(1-p,n-x);
//        System.out.println(Math.pow(p, x));
//        System.out.println(Math.pow(1-p,n-x));
//        System.out.println((factn/((factx)*(factnx))));
        
        return res;
    }
    
    public double pisson(double parametro, double x){
        double res=0,factx=1;
        for(int i=1; i<=x;i++){
            factx *=i;
            
        }
        res = Math.pow((Math.E),-parametro)*(Math.pow(parametro,x)/factx);
        
        
        return res;
        
    }
    
    public double hiper(double R, double x, double N, double n){
        double res=0,factn=1,factR=1,factx=1,factN=1, factNR=1,factnx=1,factRx=1,factNRnx=1,factNn=1, cmb1, cmb2,cmb3;
        
        for(int i=1;i<=R;i++){
            factR*=i;
            
        }
        for(int i=1;i<=x;i++){
            factx*=i;
            
        }
        for(int i=1;i<=N-R;i++){
            factNR*=i;
            
        }
        for(int i=1;i<=n-x;i++){
            factnx*=i;
            
        }
        
        for(int i=1;i<=N;i++){
            factN*=i;
            
        }
        for(int i=1;i<=n;i++){
            factn*=i;
            
        }
        
        for(int i=1;i<=R-x;i++){
            factRx*=i;
            
        }
        for(int i=1;i<=(N-R)-(n-x);i++){
            factNRnx*=i;
            
        }
        for(int i=1;i<=N-n;i++){
            factNn*=i;
            
        }
        
        cmb1 = factR/(factx*factRx);
        
        cmb2 = factNR /(factnx*factNRnx);
        
        cmb3 = factN / (factn*factNn);
        
        res = (cmb1 * cmb2)/cmb3;
        
        
        
        return res;
        
    }
}
