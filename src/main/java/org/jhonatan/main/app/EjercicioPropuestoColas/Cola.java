package org.jhonatan.main.app.EjercicioPropuestoColas;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

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

    public void mensaje(String data) {
        StringTokenizer st = new StringTokenizer(data, ",");
        // partiendo el texto
        String nombre = st.nextToken();
        String aPaterno = st.nextToken();
        String aMaterno = st.nextToken();
        String sueldoBase = st.nextToken();
        String ventasRealizadas = st.nextToken();
        String estadoCivil = st.nextToken();
        String numHijos = st.nextToken();
        String sueldoNeto = st.nextToken();

        String datos = "Descripcion del dato Eliminado: \n" +
                "Nombres:       " + nombre + "\n" +
                "Ap. Paterno:   " + aPaterno + "\n" +
                "Ap. Materno:   " + aMaterno + "\n" +
                "Sueldo Base:   " + sueldoBase + "\n" +
                "Ven.Realizadas:" + ventasRealizadas + "\n" +
                "Estado Civil:  " + estadoCivil + "\n" +
                "Nº de hijos:   " + numHijos + "\n" +
                "Sueldo Neto:   " + sueldoNeto + "\n";

        JOptionPane.showMessageDialog(null, datos, "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

    }

    public void encolar(Empleado empleado) {
        Nodo nuevo = new Nodo(empleado);
        // realizando los enlaces correspondientes
        if (frente == null) {
            frente = nuevo;
        } else {
            finCola.sig = nuevo;
        }
        finCola = nuevo;
        finCola.sig = null;
    }

    public String pop() {
        String eliminado = "";
        Nodo aux = frente;
        // extraemos los datos
        // atributos
        String nombre = aux.getEmpleado().getNombre();
        String aPaterno = aux.getEmpleado().getaPaterno();
        String aMaterno = aux.getEmpleado().getaMaterno();
        float sueldoBase = aux.getEmpleado().getSueldoBase();
        int ventasRelizadas = aux.getEmpleado().getVentasRelizadas();
        String estadoCivil = aux.getEmpleado().getEstadoCivil();
        int numeroHijos = aux.getEmpleado().getNumeroHijos();
        float sueldoNeto = aux.getEmpleado().getSueldoNeto();

        eliminado = nombre + "," + aPaterno + "," + aMaterno + "," + String.valueOf(sueldoBase) + ","
                + String.valueOf(ventasRelizadas) +
                "," + estadoCivil + "," + String.valueOf(numeroHijos) + "," + String.valueOf(sueldoNeto);
        frente = frente.sig;
        return eliminado;
    }
}
