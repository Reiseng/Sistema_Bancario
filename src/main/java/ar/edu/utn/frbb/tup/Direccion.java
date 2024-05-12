package ar.edu.utn.frbb.tup;

public class Direccion{
    private String calle;
    private int numero;
    private String ciudad;
    private int piso;

    public Direccion(String calle, int numero, String ciudad, int piso) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.piso = piso;
    }

    public Direccion(String calle, int numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.piso = 0;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ", piso=" + piso +
                '}';
    }
}
