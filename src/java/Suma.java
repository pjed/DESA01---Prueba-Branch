/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw201
 */
public class Suma {
    private int num1;
    private int num2;
    
    private int resultado;

    public Suma() {
    }

    public Suma(int num1, int num2, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "SumaRama{" + "num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + '}';
    }
}
