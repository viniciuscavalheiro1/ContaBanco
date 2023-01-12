package entities;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private Integer numeroConta;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public Conta(Integer numeroConta, String agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = BigDecimal.valueOf(0);
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(agencia, conta.agencia) && Objects.equals(nomeCliente, conta.nomeCliente) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, agencia, nomeCliente, saldo);
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " +
                agencia +
                " conta " +
                numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque";
    }
}
