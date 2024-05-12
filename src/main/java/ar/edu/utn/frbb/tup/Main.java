package ar.edu.utn.frbb.tup;

public class Main {
    public static void main(String[] args) {
        Cliente persona = new Cliente("Facundo", "Reiseng", "3049503", "2023-05-11", "Aaron castellanos 641", "2020302", " ", 1);
        Cliente persona2 = new Cliente("Facundo", "Reiseng", "30495043", "2023-05-11", "Aaron castellanos 641", "2020302", " ", 2);

        CuentaBancaria cuentaPersona = new CuentaBancaria(20,persona,"Ahorro", 20000, "2003-04-02");
        persona.setCuentaCliente((cuentaPersona));
        CuentaBancaria cuentaPersona2 = new CuentaBancaria(10, persona,"Corriente", 30000, "2010-01-11");
        persona2.setCuentaCliente((cuentaPersona2));
        System.out.println("Cuenta n1: " + cuentaPersona.consultarSaldo());
        cuentaPersona.transferir(2000,cuentaPersona2);
        cuentaPersona.transferir(2500,cuentaPersona2);
        System.out.println("Cuenta n1: " + cuentaPersona.consultarSaldo());
        System.out.println("Cuenta n2: " + cuentaPersona2.consultarSaldo() + "\n");
        cuentaPersona2.retirar(25000, "Retiro");
        System.out.println(cuentaPersona2.toString()+ "\n");
        System.out.println(cuentaPersona.toString());
    }
}