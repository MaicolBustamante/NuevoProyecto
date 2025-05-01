package view;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.ContratoAlquiler;
import model.Habitacion;
import model.Inquilino;
import model.SistemaAlquilerHabitaciones;

public class JFSistemaAH extends javax.swing.JFrame {

    private SistemaAlquilerHabitaciones sistema;  

    public JFSistemaAH() {
        sistema = new SistemaAlquilerHabitaciones();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bandeja = new javax.swing.JTextArea();
        btnAlquilar = new javax.swing.JButton();
        btnVerHabitacionesDisponibles = new javax.swing.JButton();
        btnVerContratosActivos = new javax.swing.JButton();
        btnLiberarHabitacion = new javax.swing.JButton();
        btnAgregarHabitacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        bandeja.setColumns(20);
        bandeja.setRows(5);
        jScrollPane1.setViewportView(bandeja);

        btnAlquilar.setText("ALQUILAR");
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        btnVerHabitacionesDisponibles.setText("VER HABITACIONES DISPONIBLES");
        btnVerHabitacionesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHabitacionesDisponiblesActionPerformed(evt);
            }
        });

        btnVerContratosActivos.setText("VER CONTRATOS ACTIVOS");
        btnVerContratosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerContratosActivosActionPerformed(evt);
            }
        });

        btnLiberarHabitacion.setText("LIBERAR HABITACION");
        btnLiberarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarHabitacionActionPerformed(evt);
            }
        });

        btnAgregarHabitacion.setText("AGREGAR HABITACION");
        btnAgregarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabitacionActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE INQUILINO:");

        jLabel2.setText("DNI:");

        jLabel3.setText("TELEFONO:");

        jLabel4.setText("HABITACION N°:");

        jLabel5.setText("FECHA INICIO:");

        jLabel6.setText("FECHA FIN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLiberarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerContratosActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerHabitacionesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtFechaInicio)
                            .addComponent(txtNombre)
                            .addComponent(txtDni)
                            .addComponent(txtTelefono)
                            .addComponent(txtHabitacion)))
                    .addComponent(btnAlquilar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlquilar)
                        .addGap(26, 26, 26)
                        .addComponent(btnVerHabitacionesDisponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerContratosActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLiberarHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarHabitacion)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        String nombre = txtNombre.getText();
        String dni = txtDni.getText();
        String telefono = txtTelefono.getText();
        int numeroHabitacion = Integer.parseInt(txtHabitacion.getText());
        LocalDate inicio = LocalDate.parse(txtFechaInicio.getText());
        LocalDate fin = LocalDate.parse(txtFechaFin.getText());

        Habitacion habitacion = sistema.buscarHabitacionPorNumero(numeroHabitacion);
        if (habitacion == null) {
            JOptionPane.showMessageDialog(this, "La habitación no existe\nAgrege una habitacion.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!habitacion.isDisponible()) {
            JOptionPane.showMessageDialog(this, "La habitación no está disponible.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Inquilino inq = new Inquilino(nombre, dni, telefono);
        sistema.alquilarHabitacion(numeroHabitacion, inq, inicio, fin);

        txtNombre.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtHabitacion.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void btnVerHabitacionesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHabitacionesDisponiblesActionPerformed
        StringBuilder sb = new StringBuilder();
        boolean hayDisponibles = false;
        for (Habitacion h : sistema.getHabitaciones()) {
            if (h.isDisponible()) {
                sb.append("Hab N°").append(h.getNumero())
                        .append(" - $").append(h.getPrecioMensual()).append("\n");
                hayDisponibles = true;
            }
        }

        if (hayDisponibles) {
            bandeja.setText(sb.toString());
        } else {
            bandeja.setText("No hay habitaciones disponibles.");
        }
    }//GEN-LAST:event_btnVerHabitacionesDisponiblesActionPerformed

    private void btnVerContratosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerContratosActivosActionPerformed
        StringBuilder sb = new StringBuilder();
        boolean hayContratos = false;

        for (ContratoAlquiler c : sistema.getContratos()) {
            sb.append("Hab N°").append(c.getHabitacion().getNumero())
                    .append(" - Inquilino: ").append(c.getInquilino().getNombre())
                    .append(" - Desde ").append(c.getFechaInicio())
                    .append(" hasta ").append(c.getFechaFin()).append("\n");
            hayContratos = true;
        }

        if (hayContratos) {
            bandeja.setText(sb.toString());
        } else {
            bandeja.setText("No hay contratos activos.");
        }
    }//GEN-LAST:event_btnVerContratosActivosActionPerformed

    private void btnLiberarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarHabitacionActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación a liberar:"));
        Habitacion habitacionLiberada = null;
        for (Habitacion h : sistema.getHabitaciones()) {
            if (h.getNumero() == numero) {
                h.setDisponible(true);  
                habitacionLiberada = h;
                break;
            }
        }

        if (habitacionLiberada != null) {
            sistema.getContratos().removeIf(c -> c.getHabitacion().getNumero() == numero);
            JOptionPane.showMessageDialog(this, "Habitación liberada y contrato eliminado.");
        } else {
            JOptionPane.showMessageDialog(this, "Habitación no encontrada.");
        }
    }//GEN-LAST:event_btnLiberarHabitacionActionPerformed

    private void btnAgregarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabitacionActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número de habitación:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio mensual:"));

        Habitacion nueva = new Habitacion(numero, precio);
        sistema.agregarHabitacion(nueva);
        JOptionPane.showMessageDialog(this, "Habitación agregada.");
    }//GEN-LAST:event_btnAgregarHabitacionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSistemaAH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bandeja;
    private javax.swing.JButton btnAgregarHabitacion;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnLiberarHabitacion;
    private javax.swing.JButton btnVerContratosActivos;
    private javax.swing.JButton btnVerHabitacionesDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
