package org.jhonatan.main.app;

import org.jhonatan.main.app.EjercicioPropuestoColas.frmRegistroEmpleadoColas;
import org.jhonatan.main.app.EjercicioPropuestoPilas.frmRegistroEmpleadoPila;
import org.jhonatan.main.app.formularios.frmRegistroColas;
import org.jhonatan.main.app.formularios.frmRegistrosPilas;

/**
 *
 * @author Jhonatan
 */
public class Sesion09RegistroEmpleados {

    public static void main(String[] args) {
        ejercicioPropuestoCola();
    }

    public static void formularioPilas() {
        frmRegistrosPilas d = new frmRegistrosPilas();
        d.setVisible(true);
    }

    public static void formularioColas() {
        frmRegistroColas d = new frmRegistroColas();
        d.setVisible(true);
    }

    public static void ejercicioPropuestoPila() {
        frmRegistroEmpleadoPila f = new frmRegistroEmpleadoPila();
        f.setVisible(true);
    }

    public static void ejercicioPropuestoCola() {
        frmRegistroEmpleadoColas colas = new frmRegistroEmpleadoColas();
        colas.setVisible(true);
    }
}
