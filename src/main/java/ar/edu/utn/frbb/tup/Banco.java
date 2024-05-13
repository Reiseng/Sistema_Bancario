package ar.edu.utn.frbb.tup;

import java.util.ArrayList;

public class Banco {
    ArrayList<Integer> idCuentas; //Guardamos los IDs generados en un ArrayList
    public Banco() {
        this.idCuentas = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getIdCuentas() {
        return idCuentas;
    }
    public Boolean esUnico(int id) {
        //Se verifica si el Id generado es unico
        for (int i = 0; i < idCuentas.size(); i++) {
            if (idCuentas.get(i) == id) {
                return false;
            }

        }
        return true;
    }
    public void setidCuentas(int id) {
        idCuentas.add(id);
    }
}