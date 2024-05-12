package ar.edu.utn.frbb.tup;

class Cliente extends Persona {
    private int id;
    private CuentaBancaria cuentaCliente;
    public Cliente(String nombre, String apellido, String dni, String fechaNac, String direccion, String telefono, String mail, int id) {
        super(nombre, apellido, dni, fechaNac, direccion, telefono, mail);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CuentaBancaria getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(CuentaBancaria cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
               //", cuentaCliente=" + cuentaCliente +
                "}" + "\n" + super.toString();
    }
}