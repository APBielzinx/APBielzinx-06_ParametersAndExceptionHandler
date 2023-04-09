package br.com.erudio.functions;

public class Calcs {

    private double number1;
    private double numeber2;




    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumeber2() {
        return numeber2;
    }

    public void setNumeber2(double numeber2) {
        this.numeber2 = numeber2;
    }

    public double soma(double a, double b){

         a = getNumber1();
         b = getNumeber2();

        return a + b;


    }

    public Double subtracao(double a, double b) {

        a = getNumber1();
        b = getNumeber2();

        return a - b;

    }

    public Double divisao(double a, double b) {

        a = getNumber1();
        b = getNumeber2();

        return a / b;

    }

    public Double mult(double a, double b) {

        a = getNumber1();
        b = getNumeber2();

        return a * b;

    }


    public Double media(double a, double b) {

        a = getNumber1();
        b = getNumeber2();

        return (a + b)/2;

    }

    public Double raizQuadrada(double a) {

        return Math.sqrt(a);


    }


}
