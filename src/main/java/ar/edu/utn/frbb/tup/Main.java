package ar.edu.utn.frbb.tup;

public class Main {

    public static void main(String[] args) {
        //Referenciamos una direccion
        Direccion direccion = new Direccion("Aaron Castellanos", 645, "Carhué");

        //Referenciamos los clientes
        Cliente persona = new Cliente("Facundo", "Reiseng", "3049503", "2023-05-11", direccion, "202030265", " ", 1);
        Cliente persona2 = new Cliente("Facundo", "Reiseng", "30495043", "2023-05-11", direccion, "257679712", " ", 2);

        //Referenciamos las cuentas bancarias
        CuentaBancaria cuentaPersona = new CuentaBancaria(persona,"Ahorro", 20000);
        CuentaBancaria cuentaPersona2 = new CuentaBancaria(persona2,"Corriente", 30000);

        //Realizamos los movimientos
        cuentaPersona.transferir(2000,cuentaPersona2);
        cuentaPersona.transferir(2500,cuentaPersona2);

        cuentaPersona2.retirar(25000);

        cuentaPersona2.depositar(2000);

        //Imprimimos en pantalla los datos de ambas cuentas
        System.out.println(cuentaPersona2.toString()+ "\n");
        System.out.println(cuentaPersona.toString());
    }
}