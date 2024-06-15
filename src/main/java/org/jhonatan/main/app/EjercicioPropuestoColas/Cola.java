package org.jhonatan.main.app.EjercicioPropuestoColas;

public class Cola {
    // variables
    Nodo frente, finCola;
    Nodo pFound;

    int num = 0;

    public Cola() {
        this.finCola = null;
    }

    public Nodo buscar(String nombre) {
        Nodo pos = frente;
        while (pos != null && !nombre.equalsIgnoreCase(pos.getEmpleado().getNombre())) {
            pos = pos.sig;
        }
        // retornamos la posicion
        return pos;
    }
}
