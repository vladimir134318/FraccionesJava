package com.companybitmix;

public class Fraccion {
    int num;
    int den;

    public Fraccion(int a, int b) {
        num = a;
        den = b;
    }

    public Fraccion sumar(Fraccion a) {
        int nuevonum = (a.num * this.den) + (a.den * this.num);
        int nuevoden = a.den * this.den;
        Fraccion c = new Fraccion(nuevonum, nuevoden);
        return c;

    }
    public Fraccion restar(Fraccion a){
        int nuevonum = (a.num * this.den) - (a.den * this.num);
        int nuevoden = a.den * this.den;
        Fraccion c = new Fraccion(nuevonum,nuevoden);
        return c;
    }
    public Fraccion multiplicar(Fraccion a){
        int nuevonum = a.num*this.num;
        int nuevoden = a.den*this.den;
        Fraccion c = new Fraccion(nuevonum,nuevoden);
        return c;
    }
    public Fraccion dividir(Fraccion a){
        int nuevonum = a.num*this.den;
        int nuevoden = a.den* this.num;
        Fraccion c = new Fraccion(nuevonum,nuevoden);
        return c ;
    }


    public void mostrar() {
        System.out.print(num + "/" + den);
    }
}
