/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author José Wilson Grilo
 */
public class Calculos {
    private double opera1;
    private double opera2;
    private char operacao = ' ';

    /**
     * @return the opera1
     */
    public double getOpera1() {
        return opera1;
    }

    /**
     * @param opera1 the opera1 to set
     */
    public void setOpera1(double opera1) {
        this.opera1 = opera1;
    }

    /**
     * @return the opera2
     */
    public double getOpera2() {
        return opera2;
    }

    /**
     * @param opera2 the opera2 to set
     */
    public void setOpera2(double opera2) {
        this.opera2 = opera2;
    }
    
    /**
     * @return the operacao
     */
    public char getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }
    
    public double calcular(double ope1, double ope2, char oper){
        
        double result = 0;
        // SOMA
        if(oper=='+'){
            result = ope1 + ope2;
        }
        // SUBTRAÇÃO
        if(oper=='-'){
            result = ope1 - ope2;
        }
        // DIVISÃO
        if(oper=='/'){
            result = ope1 / ope2;
        }
        // MULTIPLICAÇÃO
        if(oper=='*'){
            result = ope1 * ope2;
        }
        return result;
    }
}
