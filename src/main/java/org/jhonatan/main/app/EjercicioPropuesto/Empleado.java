package org.jhonatan.main.app.EjercicioPropuesto;

public class Empleado {
    // atributos
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private float sueldoBase;
    private int ventasRelizadas;
    private String estadoCivil;
    private int numeroHijos;
    private float sueldoNeto;

    public Empleado(String nombre, String aPaterno, String aMaterno, float sueldoBase, int ventasRelizadas,
            String estadoCivil, int numeroHijos) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.sueldoBase = sueldoBase;
        this.ventasRelizadas = ventasRelizadas;
        this.estadoCivil = estadoCivil;
        this.numeroHijos = numeroHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getVentasRelizadas() {
        return ventasRelizadas;
    }

    public void setVentasRelizadas(int ventasRelizadas) {
        this.ventasRelizadas = ventasRelizadas;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public float getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(float sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    // metodo para calcular la comision
    public float montoComision() {
        return this.ventasRelizadas * 0.05f;
    }

    public float montoDescuentoSeguro() {
        float monto = 0;

        // si esta soltero
        if (this.estadoCivil.equalsIgnoreCase("soltero")) {
            monto = 100;
        }

        // si esta casado
        if (this.estadoCivil.equalsIgnoreCase("casado")) {
            if (this.numeroHijos == 0) {
                monto = 120;
            } else {
                monto = 50 + (70 * this.numeroHijos);
            }
        }
        return monto;
    }

    private float ta() {
        return this.sueldoBase + this.montoComision();
    }

    // metodo para el descuento por impuesto
    public float montoDescuentoImpuesto() {
        float monto = 0;
        if (this.ta() > 0 && this.ta() < 1500) {
            monto = 0;
        } else if (this.ta() >= 1500 && this.ta() <= 2300) {
            monto = this.ta() * 0.03f;
        } else if (this.ta() >= 2301 && this.ta() <= 3000) {
            monto = this.ta() * 0.04f;
        } else if (this.ta() >= 3001) {
            monto = this.ta() * 0.06f;
        }
        return monto;
    }

    // metodo para saber el suedo neto
    public float montoSueldoNeto() {
        return (this.sueldoBase + this.montoComision()) - this.montoDescuentoImpuesto() - this.montoDescuentoSeguro();
    }

}
