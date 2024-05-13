package ar.edu.utn.frbb.tup;

class Cliente extends Persona {
    private int id;
    public Cliente(String nombre, String apellido, String dni, String fechaNac, Direccion direccion, String telefono, String mail, int id) {
        super(nombre, apellido, dni, fechaNac, direccion, telefono, mail);
        this.id = id;
    }
    public Cliente(String nombre, String apellido, String dni, String fechaNac, String telefono, int id) {
        //Constructor para generar un cliente sin Mail y la Direccion
        super(nombre, apellido, dni, fechaNac, telefono);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                "}" + "\n" + super.toString();
    }
}