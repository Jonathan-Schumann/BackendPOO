package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {
    
    //#region Atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;

    private Double DEPOSITO_MIN = 10.0;
    //#endregion

    //#region Construtores
    
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    //#endregion

    //#region Getters e Setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    //#endregion
    
    //#region Métodos

    public void depositar(Double valor){

        if(valor < DEPOSITO_MIN){
            throw new InputMismatchException("O valor mínimo de depósito é de R$" + DEPOSITO_MIN);
        }

        this.saldo += valor;
    }

    public Double sacar(Double valor){
        if(valor > this.saldo){
            throw new InputMismatchException("Saldo insuficiente.");
        }

        this.saldo -= valor;

        return valor;
    }

    //#endregion

}
