package org.jhonatan.main.app;

import org.jhonatan.main.app.formularios.frmRegistroColas;
import org.jhonatan.main.app.formularios.frmRegistrosPilas;

/**
 *
 * @author Jhonatan
 */
public class Sesion09RegistroEmpleados {

    public static void main(String[] args) {
        formularioColas();
    }

    public static void formularioPilas() {
        frmRegistrosPilas d = new frmRegistrosPilas();
        d.setVisible(true);
    }

    public static void formularioColas() {
        frmRegistroColas d = new frmRegistroColas();
        d.setVisible(true);
    }
}
