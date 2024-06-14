package org.jhonatan.main.app.EjercicioPropuestoPilas;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Pila {
    // variables
    Nodo tope;
    Nodo pfound;

    int num = 0;

    public Pila() {
        this.tope = null;
    }

    public Nodo buscar(String nombres) {
        Nodo pos = tope;
        while (pos != null && !nombres.equalsIgnoreCase(pos.getEmpleado().getNombre())) {
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

    public void push(Empleado empleado) {
        Nodo nuevo = new Nodo(empleado);
        // realizando los enlaces correspondientes
        if (tope == null) {
            nuevo.sig = null;
        } else {
            nuevo.sig = tope;
        }
        tope = nuevo;
    }

    public String pop() {
        String eliminado = "";
        Nodo aux = tope;
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
        tope = tope.sig;
        aux.sig = null;
        return eliminado;
    }

    public void vaciarTabla(JTable tblDatos, DefaultTableModel miModelo) {
        int filas = tblDatos.getRowCount();
        for (int i = 0; i < filas; i++) {
            miModelo.removeRow(0);
        }
    }

    private int numElemen() {
        int num = 0;
        Nodo aux = tope;
        while (aux != null) {
            num++;
            aux = aux.sig;
        }
        return num;
    }

    public void verDatos(JTable tblDatos, DefaultTableModel miModelo) {
        // atributos
        String nombre;
        String aPaterno;
        String aMaterno;
        float sueldoBase;
        int ventasRelizadas;
        String estadoCivil;
        int numeroHijos;
        String sueldoNeto;
        String montoComision;
        String montoDescuentoImpuesto;
        String montoDescuentoSeguro;

        Nodo aux = tope;
        vaciarTabla(tblDatos, miModelo);
        Nodo p;
        num = numElemen();

        while (aux != null) {
            nombre = aux.getEmpleado().getNombre();
            nombre = aux.getEmpleado().getNombre();
            aPaterno = aux.getEmpleado().getaPaterno();
            aMaterno = aux.getEmpleado().getaMaterno();
            sueldoBase = aux.getEmpleado().getSueldoBase();

            // dando formato al variable de tipo float
            DecimalFormat df2 = new DecimalFormat("####.00");

            ventasRelizadas = aux.getEmpleado().getVentasRelizadas();
            estadoCivil = aux.getEmpleado().getEstadoCivil();
            numeroHijos = aux.getEmpleado().getNumeroHijos();
            sueldoNeto = df2.format(aux.getEmpleado().getSueldoNeto());
            montoComision = df2.format(aux.getEmpleado().montoComision());
            montoDescuentoImpuesto = df2.format(aux.getEmpleado().montoDescuentoImpuesto());
            montoDescuentoSeguro = df2.format(aux.getEmpleado().montoDescuentoSeguro());

            Object fila[] = { nombre, aPaterno, aMaterno, sueldoBase, ventasRelizadas, estadoCivil, numeroHijos,
                    sueldoNeto, montoComision, montoDescuentoImpuesto, montoDescuentoSeguro };

            miModelo.addRow(fila);
            aux = aux.sig;

        }
    }

    public void resumen(JTextField txtMontoComisiones, JTextField txtmontoDescuentoImpuesto,
            JTextField txtmontoDescuentoSeguro, JTextField txtMontoSueldos) {
        float sumaSueldos = 0, sumaComisiones = 0, sumaDescImpuestos = 0, sumDescSeguro = 0;

        Nodo p = tope;

        while (p != null) {
            sumaSueldos += p.getEmpleado().montoSueldoNeto();
            sumaComisiones += p.getEmpleado().montoComision();
            sumaDescImpuestos += p.getEmpleado().montoDescuentoImpuesto();
            sumDescSeguro += p.getEmpleado().montoDescuentoSeguro();

            p = p.sig;
        }

        DecimalFormat df2 = new DecimalFormat("####.00");
        txtMontoComisiones.setText("S/." + df2.format(sumaComisiones));
        txtmontoDescuentoImpuesto.setText("S/." + df2.format(sumaDescImpuestos));
        txtMontoSueldos.setText("S/." + df2.format(sumaSueldos));
        txtmontoDescuentoSeguro.setText("S/." + df2.format(sumDescSeguro));
    }

    public boolean estVacia() {
        return tope == null;
    }
}
