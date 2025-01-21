package es3.entities;

import es3.exceptions.BancaException;

public class ContoCorrente {
    public final int maxMovimenti = 50;
    public String titolare;
    public int nMovimenti;
    public double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        if (saldo < 0) throw new BancaException("Il conto è in rosso");
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}

