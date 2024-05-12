package ar.edu.utn.frbb.tup;

class MovimientoCuenta {
    private String tipoOperacion;
    private double monto;

    public MovimientoCuenta(String tipoOperacion, double monto) {
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
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
                '}';
    }
}