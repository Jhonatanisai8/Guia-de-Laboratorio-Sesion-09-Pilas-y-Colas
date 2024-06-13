package org.jhonatan.main.app.EjercicioPropuesto;

public class Nodo {
    private Empleado empleado;
    Nodo sig;

    public Nodo(Empleado empleado) {
        this.empleado = empleado;
        this.sig = null;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
