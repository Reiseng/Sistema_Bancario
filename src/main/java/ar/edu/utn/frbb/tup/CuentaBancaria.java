package ar.edu.utn.frbb.tup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class CuentaBancaria extends Banco {
    private int numeroCuenta;
    private final Cliente cliente;
    private final String tipoCuenta;
    private double saldo;
    private final Date fechaApertura;
    private List<MovimientoCuenta> movimientos;

    //Constructor, si el saldo ingresado es menor a 0 lo deja en 0
    public CuentaBancaria(Cliente cliente, String tipoCuenta, double saldo) {
        generarNumeroCuenta(); //Genera el un numero aleatorio como numero de cuenta
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
        this.fechaApertura = new Date(); //Usa la fecha actual
        this.movimientos = new ArrayList<>(); //Se guardan los movimientos en un ArrayList
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a 0");
        } else {
            this.saldo += monto;
            movimientos.add(new MovimientoCuenta("Deposito", monto, setFechaActual()));
        }
    }

    public void retirar(double monto) {
        if (monto <= this.saldo && monto > 0) {
            this.saldo -= monto;
            movimientos.add(new MovimientoCuenta("Retiro", -monto, setFechaActual()));
        } else {
            System.out.println("Saldo insuficiente para realizar la transacción");
        }
    }

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        if (monto <= this.saldo && monto > 0) {
            this.saldo -= monto;
            cuentaDestino.movimientos.add(new MovimientoCuenta("Transferencia Recibida de cuenta " + cuentaDestino.getNumeroCuenta(), +monto, setFechaActual()));
            movimientos.add(new MovimientoCuenta("Transferencia enviada a cuenta " + cuentaDestino.getNumeroCuenta(), -monto, setFechaActual()));
        } else {
            System.out.println("Saldo insuficiente para realizar la transacción");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    private void generarNumeroCuenta() {
        Random random = new Random();
        int randomNumber = random.nextInt(100000000);
        if (this.esUnico(randomNumber)) {
            this.setNumeroCuenta(randomNumber);
            this.idCuentas.add(randomNumber);
        } else {
            this.generarNumeroCuenta();
        }
    }
    public Date setFechaActual() {
        return new Date();
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