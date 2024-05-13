package ar.edu.utn.frbb.tup;
import java.util.Date;

class MovimientoCuenta {
    private Date hora; //Tomamos la fecha actual para guardar en los movimientos
    private String tipoOperacion;
    private double monto;

    public MovimientoCuenta(String tipoOperacion, double monto, Date hora) {
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.hora = hora;
    }
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "{" +
                "tipoOperacion='" + tipoOperacion + '\'' +
                ", monto=" + monto +
                ", fecha=" + hora +
                '}';
    }
}