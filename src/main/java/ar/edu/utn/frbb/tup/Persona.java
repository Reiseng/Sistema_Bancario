package ar.edu.utn.frbb.tup;

class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNac;
    private String direccion;
    private String telefono;
    private String mail;
    public Persona(String nombre, String apellido, String dni, String fechaNac, String direccion, String telefono, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' + "\n" +
                "apellido='" + apellido + '\'' + "\n" +
                "dni='" + dni + '\'' + "\n" +
                "fechaNac='" + fechaNac + '\'' + "\n" +
                "direccion='" + direccion + '\'' + "\n" +
                "telefono='" + telefono + '\'' + "\n" +
                "mail='" + mail + '\'' +
                '}';
    }
}