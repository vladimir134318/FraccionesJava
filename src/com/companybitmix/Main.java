package com.companybitmix;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fraccion A = new Fraccion(1,2);
        Fraccion B = new Fraccion(3,4);
        Fraccion resul = A.sumar(B);
        Fraccion resul2 = A.restar(B);
        Fraccion resul3 = A.multiplicar(B);
        Fraccion resul4 = A.dividir(B);

        resul.mostrar();
    }

}
