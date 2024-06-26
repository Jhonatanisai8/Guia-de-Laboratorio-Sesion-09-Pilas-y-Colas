package org.jhonatan.main.app.EjercicioPropuestoColas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

/**
 *
 * @author Jhonatan
 */
public class frmRegistroEmpleadoColas extends javax.swing.JFrame {

    // declaracion de variables locales
    DefaultTableModel miModelo;
    String cabezera[] = { "Nombres", "Ape. Paterno", "Ape. Materno", "Suel. Base", "Vent. Relia", "Est. Civil",
            "Nº de hijos", "Suel. Neto", "Mon.Comsiones", "Mon.Desc Imps", "Mon.Desc Seg" };
    String data[][] = {};
    Cola cola = new Cola();
    Empleado miEmpleado;

    public frmRegistroEmpleadoColas() {
        initComponents();
        FlatMaterialLighterIJTheme.setup();
        this.setTitle("Bienvenido al Sistema");
        miModelo = new DefaultTableModel(data, cabezera);
        tblDatos.setModel(miModelo);
        desabilitar();
    }

    private void habilitar() {
        btnActualizar.setEnabled(true);
        btnGuardae.setEnabled(false);
        txtSueldoNeto.setEnabled(false);
    }

    private void desabilitar() {
        btnActualizar.setEnabled(false);
        btnGuardae.setEnabled(true);
        txtSueldoNeto.setEnabled(false);
    }

    private void limpiarEntradas() {
        String m = "";
        txtApeMaterno.setText(m);
        txtApePaterno.setText(m);
        txtNombres.setText(m);
        txtNumHijos.setText(m);
        txtSueldoBase.setText(m);
        txtVentasRelizadas.setText(m);
        cbxEstadoCivil.setSelectedIndex(0);
        txtNombres.requestFocus();
        txtSueldoNeto.setText(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApePaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApeMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSueldoBase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVentasRelizadas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNumHijos = new javax.swing.JTextField();
        txtSueldoNeto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGuardae = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMontoSueldos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMontoComisiones = new javax.swing.JTextField();
        txtMontoDescImpuestos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMontoDescSeguro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Datos:"));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Nombres:");

        txtNombres.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Apellido Paterno;");

        txtApePaterno.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        txtApeMaterno.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("Sueldo Base:");

        txtSueldoBase.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setText("Ventas Realizadas:");

        txtVentasRelizadas.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel6.setText("Estado Civil:");

        cbxEstadoCivil.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        cbxEstadoCivil.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "=Seleccionar=", "Casado", "Soltero" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setText("Nº De Hijos:");

        txtNumHijos.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        txtSueldoNeto.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setText("Sueldo Neto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtApePaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtApeMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, 0,
                                                296, Short.MAX_VALUE)
                                        .addComponent(txtNombres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNumHijos)
                                                        .addComponent(txtSueldoNeto))
                                                .addGap(16, 16, 16))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel5,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 160,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtVentasRelizadas,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtSueldoBase,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 126,
                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                45, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(txtApePaterno)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(txtSueldoBase)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(txtVentasRelizadas)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtApeMaterno)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtNumHijos)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtSueldoNeto)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        btnGuardae.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardae.setFont(new java.awt.Font("Vensim Sans KR", 1, 12)); // NOI18N
        btnGuardae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrar.png"))); // NOI18N
        btnGuardae.setText("Guardar");
        btnGuardae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaeActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizar.setFont(new java.awt.Font("Vensim Sans KR", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Vensim Sans KR", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Vensim Sans KR", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Vensim Sans KR", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/quitar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnGuardae, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 142,
                                                Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGuardae, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados Registrados:"));

        tblDatos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Nº", "Nombres", "Ap. Paterno", "Ap. Materno", "Sueldo Base", "Vent. Realizadas", "Estd. Civil",
                        "Nº Hijos", "Sueldo Neto", "Cms. Ventas", "Desc Impuestos", "Desc Seguro"
                }));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel9.setText("Monto total Sueldos:");

        txtMontoSueldos.setFont(new java.awt.Font("SimHei", 1, 18)); // NOI18N

        jLabel10.setText("Monto por Comisiones:");

        txtMontoComisiones.setFont(new java.awt.Font("SimHei", 1, 18)); // NOI18N

        txtMontoDescImpuestos.setFont(new java.awt.Font("SimHei", 1, 18)); // NOI18N

        jLabel11.setText("Monto por Desc. Impuestos:");

        jLabel12.setText("Monto por Desc. Seguro:");

        txtMontoDescSeguro.setFont(new java.awt.Font("SimHei", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMontoComisiones))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMontoSueldos)))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMontoDescSeguro))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMontoDescImpuestos)))
                                .addGap(261, 261, 261)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtMontoDescImpuestos)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtMontoDescSeguro)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtMontoSueldos,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 50,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtMontoComisiones)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(45, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(16, 16, 16)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardaeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGuardaeActionPerformed
        String nombre = txtNombres.getText();
        String aPaterno = txtApePaterno.getText();
        String aMaterno = txtApeMaterno.getText();
        float sueldoBase = Float.parseFloat(txtSueldoBase.getText());
        int ventasRelizadas = Integer.parseInt(txtVentasRelizadas.getText());
        String estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        int numeroHijos = Integer.parseInt(txtNumHijos.getText());
        float sueldoNeto;

        // objeto de la clase empleado
        miEmpleado = new Empleado(nombre, aPaterno, aMaterno, sueldoBase, ventasRelizadas, estadoCivil,
                numeroHijos);
        miEmpleado.setSueldoNeto(miEmpleado.montoSueldoNeto());

        // llamando a los metodos de la clase pila
        cola.encolar(miEmpleado);
        limpiarEntradas();
        cola.verDatos(tblDatos, miModelo);
        cola.resumen(txtMontoComisiones, txtMontoDescImpuestos, txtMontoDescSeguro, txtMontoSueldos);
        System.out.println("Empleado registrado");
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnActualizarActionPerformed
        if (cola.estaVacia()) {
            JOptionPane.showMessageDialog(rootPane, "!La cola esta vacia", "ATENCIÓN",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            Nodo aux = cola.buscar(txtNombres.getText());
            String nombre = txtNombres.getText();
            String aPaterno = txtApePaterno.getText();
            String aMaterno = txtApeMaterno.getText();
            float sueldoBase = Float.parseFloat(txtSueldoBase.getText());
            int ventasRelizadas = Integer.parseInt(txtVentasRelizadas.getText());
            String estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
            int numeroHijos = Integer.parseInt(txtNumHijos.getText());
            float sueldoNeto;
            aux.getEmpleado().setNombre(nombre);
            aux.getEmpleado().setaPaterno(aPaterno);
            aux.getEmpleado().setaMaterno(aMaterno);
            aux.getEmpleado().setSueldoBase(sueldoBase);
            aux.getEmpleado().setVentasRelizadas(ventasRelizadas);
            aux.getEmpleado().setEstadoCivil(estadoCivil);
            aux.getEmpleado().setNumeroHijos(numeroHijos);
            aux.getEmpleado().setSueldoNeto(aux.getEmpleado().montoSueldoNeto());

            limpiarEntradas();
            desabilitar();
            cola.verDatos(tblDatos, miModelo);
            cola.resumen(txtMontoComisiones, txtMontoDescImpuestos, txtMontoDescSeguro, txtMontoSueldos);
            System.out.println("Empleado modificado");
        }

    }

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConsultarActionPerformed
        if (cola.estaVacia()) {
            JOptionPane.showMessageDialog(rootPane, "!La cola esta vacia", "ATENCIÓN",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String nombre = txtNombres.getText();
            if (nombre.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "!Por favor ingresar el nombre a buscar",
                        "ATENCIÓN",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                // lamando al metodo que retorna la pisicion del dato buscado
                // variable auxiliar
                Nodo aux = cola.buscar(nombre);
                // verificando el puntero
                if (aux != null) {
                    txtNombres.setText(aux.getEmpleado().getNombre());
                    txtApePaterno.setText(aux.getEmpleado().getaPaterno());
                    txtApeMaterno.setText(aux.getEmpleado().getaMaterno());
                    txtNumHijos.setText(aux.getEmpleado().getNumeroHijos() + "");
                    txtSueldoBase.setText(aux.getEmpleado().getSueldoBase() + "");
                    txtVentasRelizadas.setText(aux.getEmpleado().getVentasRelizadas() + "");
                    txtSueldoNeto.setText(aux.getEmpleado().getSueldoNeto() + "");
                    if (aux.getEmpleado().getEstadoCivil().equalsIgnoreCase("casado")) {
                        cbxEstadoCivil.setSelectedIndex(1);
                    } else {
                        cbxEstadoCivil.setSelectedIndex(2);
                    }
                    System.out.println("encontrado");
                    habilitar();
                } else {
                    JOptionPane.showMessageDialog(rootPane,
                            "Empleado con nombre " + nombre + ", no encontrado.",
                            "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
        int opcion;
        opcion = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de salir?", "ATENCIÓN",
                JOptionPane.INFORMATION_MESSAGE);
        if (opcion == 0) {
            System.exit(0);
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEliminarActionPerformed
        if (cola.estaVacia()) {
            JOptionPane.showMessageDialog(rootPane, "!La pila esta vacia", "ATENCIÓN",
                    JOptionPane.WARNING_MESSAGE);
            txtNombres.requestFocus();
        } else {
            String dato = cola.pop();
            cola.mensaje(dato);
            limpiarEntradas();
            cola.verDatos(tblDatos, miModelo);
            if (cola.estaVacia()) {
                JOptionPane.showMessageDialog(rootPane, "!La pila esta vacia", "ATENCIÓN",
                        JOptionPane.WARNING_MESSAGE);
                txtNombres.requestFocus();
            }
            desabilitar();
            cola.resumen(txtMontoComisiones, txtMontoDescImpuestos, txtMontoDescSeguro, txtMontoSueldos);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistroEmpleadoColas.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroEmpleadoColas.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroEmpleadoColas.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroEmpleadoColas.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroEmpleadoColas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardae;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtMontoComisiones;
    private javax.swing.JTextField txtMontoDescImpuestos;
    private javax.swing.JTextField txtMontoDescSeguro;
    private javax.swing.JTextField txtMontoSueldos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumHijos;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtSueldoNeto;
    private javax.swing.JTextField txtVentasRelizadas;
    // End of variables declaration//GEN-END:variables
}
