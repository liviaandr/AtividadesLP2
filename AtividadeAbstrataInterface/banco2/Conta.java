package banco2;

import java.util.Scanner;

abstract class Conta {
    protected Scanner sc = new Scanner(System.in);
    protected int numero;
    protected String titular;
    protected float saldo;

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar();
    public abstract void depositar();
    public abstract void consultarSaldo();
}
