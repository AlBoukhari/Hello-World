
package Exemple;

import java.util.Scanner;


public class taxe {
    public static void main(String[] args) { 
System.out.println("entrer un prix");
Scanner clavier= new Scanner (System.in);
double A= clavier.nextDouble();
double p;
double v;
double t;
p=A*0.05;
v=A*0.09;
t=A+p+v;
System.out.println("montant : "+A);
System.out.println("TVA : "+p);
System.out.println("TVQ : "+v);
System.out.println("le total est : "+t);   
        
  }
}
