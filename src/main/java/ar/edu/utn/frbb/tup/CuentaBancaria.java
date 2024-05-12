package ar.edu.utn.frbb.tup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CuentaBancaria {
    private Date fecha = new Date();
    private int numeroCuenta;
    private Cliente cliente;
    private String tipoCuenta;
    private double saldo;
    private Date fechaApertura;
    private List<MovimientoCuenta> movimientos;

    public CuentaBancaria(int numeroCuenta, Cliente cliente, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        if (saldo < 0){
            this.saldo = 0;
        }
        else {
            this.saldo = saldo;
        }
        this.fechaApertura = new Date();
        this.movimientos = new ArrayList<>();
    }
    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void depositar(double monto, String tipoOperacion) {
            if (tipoOperacion != "Transferencia Recibida") {
                tipoOperacion = "Deposito";
            }
            this.saldo += monto;
            movimientos.add(new MovimientoCuenta(tipoOperacion, monto, fecha));
    }
    public void retirar(double monto, String tipoOperacion) {
        if (monto <= this.saldo) {
            if(tipoOperacion != "Transferencia Recibida") {
                tipoOperacion = "Retiro";
            }
            this.saldo -= monto;
            movimientos.add(new MovimientoCuenta(tipoOperacion, -monto, fecha));
        }else{
        System.out.println("Saldo insuficiente para realizar la transaccion");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            cuentaDestino.depositar(monto, "Transferencia recibida");
            movimientos.add(new MovimientoCuenta("Transferencia enviada a cuenta " + cuentaDestino.getNumeroCuenta(), -monto, fecha));
        }else{
            System.out.println("Saldo insuficiente para realizar la transaccion");
        }
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