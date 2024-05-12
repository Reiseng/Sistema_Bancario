package ar.edu.utn.frbb.tup;

import java.util.ArrayList;
import java.util.List;

class CuentaBancaria {
    private int numeroCuenta;
    private Cliente cliente;
    private String tipoCuenta;
    private double saldo;
    private String fechaApertura;
    private List<MovimientoCuenta> movimientos;

    public CuentaBancaria(int numeroCuenta, Cliente cliente, String tipoCuenta, double saldo, String fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.movimientos = new ArrayList<>();
    }

    // Getters y Setters
    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void depositar(double monto, String tipoOperacion) {
        this.saldo += monto;
        movimientos.add(new MovimientoCuenta(tipoOperacion, monto));
    }

    public void retirar(double monto, String tipoOperacion) {
        this.saldo -= monto;
        movimientos.add(new MovimientoCuenta(tipoOperacion, -monto));
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        this.saldo -= monto;
        cuentaDestino.depositar(monto, "Transferencia recibida");
        movimientos.add(new MovimientoCuenta("Transferencia enviada a cuenta " + cuentaDestino.getNumeroCuenta(), -monto));
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "\n" +
                "numeroCuenta=" + numeroCuenta + "\n" +
                cliente + "\n" +
                "tipoCuenta='" + tipoCuenta + '\'' + "\n" +
                "saldo=" + saldo + "\n" +
                "fechaApertura='" + fechaApertura + '\'' + "\n" +
                "movimientos=" + movimientos + "\n" +
                '}';
    }
}