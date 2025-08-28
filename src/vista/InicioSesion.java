
package vista;

import config.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.Image;
import javax.swing.ImageIcon;

public class InicioSesion extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs = null; 
    
    String Nombre = "";
    
    public InicioSesion() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    
    public void setDato(String dato, String RFC, Double Saldo){
        this.dato = dato;
        TFNombre.setText(dato);
        
    }
    
   
    
    public String getNombreUsuario(){
        return TFNombre.getText();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegresarInicioSesion = new javax.swing.JButton();
        BotonInicioIniciarSesion = new javax.swing.JButton();
        TFNombre = new javax.swing.JTextField();
        TFContrasena = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 800));

        BotonRegresarInicioSesion.setBackground(new java.awt.Color(200, 212, 210));
        BotonRegresarInicioSesion.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        BotonRegresarInicioSesion.setForeground(new java.awt.Color(0, 102, 102));
        BotonRegresarInicioSesion.setText("Regresar");
        BotonRegresarInicioSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonRegresarInicioSesion.setFocusPainted(false);
        BotonRegresarInicioSesion.setFocusable(false);
        BotonRegresarInicioSesion.setMaximumSize(new java.awt.Dimension(85, 24));
        BotonRegresarInicioSesion.setMinimumSize(new java.awt.Dimension(85, 24));
        BotonRegresarInicioSesion.setPreferredSize(new java.awt.Dimension(85, 24));
        BotonRegresarInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarInicioSesionActionPerformed(evt);
            }
        });

        BotonInicioIniciarSesion.setBackground(new java.awt.Color(146, 205, 226));
        BotonInicioIniciarSesion.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        BotonInicioIniciarSesion.setForeground(new java.awt.Color(0, 102, 102));
        BotonInicioIniciarSesion.setText("Iniciar Sesión");
        BotonInicioIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonInicioIniciarSesion.setFocusPainted(false);
        BotonInicioIniciarSesion.setFocusable(false);
        BotonInicioIniciarSesion.setMaximumSize(new java.awt.Dimension(118, 66));
        BotonInicioIniciarSesion.setMinimumSize(new java.awt.Dimension(118, 66));
        BotonInicioIniciarSesion.setPreferredSize(new java.awt.Dimension(118, 66));
        BotonInicioIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioIniciarSesionActionPerformed(evt);
            }
        });

        TFNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFNombre.setForeground(new java.awt.Color(0, 102, 106));
        TFNombre.setToolTipText("");
        TFNombre.setBorder(null);
        TFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreActionPerformed(evt);
            }
        });

        TFContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFContrasena.setForeground(new java.awt.Color(0, 102, 106));
        TFContrasena.setBorder(null);

        LabelNombre.setFont(new java.awt.Font("Hind Madurai Medium", 0, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(0, 102, 106));
        LabelNombre.setText("Ingresar Primer Nombre");

        LabelContraseña.setFont(new java.awt.Font("Hind Madurai Medium", 0, 18)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(0, 102, 106));
        LabelContraseña.setText("Ingresar Contraseña");

        jLabel1.setForeground(new java.awt.Color(0, 102, 106));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        jLabel2.setForeground(new java.awt.Color(0, 102, 106));
        jLabel2.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        jLabel3.setFont(new java.awt.Font("Hind Madurai Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 106));
        jLabel3.setText("INICIO DE SESIÓN");

        jPanel2.setBackground(new java.awt.Color(146, 205, 226));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(146, 205, 226));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRegresarInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonInicioIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelContraseña)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TFContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(LabelNombre)
                        .addGap(8, 8, 8)
                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LabelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonRegresarInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonInicioIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarInicioSesionActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarInicioSesionActionPerformed

    private void BotonInicioIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioIniciarSesionActionPerformed
    String nombre = TFNombre.getText();
    String contrasena = TFContrasena.getText();

    try {
        cn = con.getConnection();
        
        if (cn != null) {
            st = cn.createStatement();

            if (nombre.isEmpty() || contrasena.isEmpty()) { // Validar si los campos están vacíos
                JOptionPane.showMessageDialog(this, "Por favor ingrese nombre de usuario y contraseña", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            } else {
                // Verificar si el usuario y la contraseña son "Admin" y "0" respectivamente
                if (nombre.equals("Admin") && contrasena.equals("0")) {
                    // Abrir la ventana de Administrador
                    Administrador ventanaAdmin = new Administrador();
                    ventanaAdmin.setVisible(true);
                    this.dispose(); // Cerrar la ventana actual
                } else {
                    // Consulta para verificar si el nombre de usuario y la contraseña coinciden con la base de datos
                    String consulta = "SELECT * FROM Clientes WHERE Nombre = '" + nombre + "' AND Contrasena = '" + contrasena + "'";
                    rs = st.executeQuery(consulta);

                    if (rs.next()) { // Si se encuentra un registro con el nombre de usuario y la contraseña proporcionados
                        String RFC = rs.getString("RFC");
                        Double Saldo = rs.getDouble("Saldo");
                        
                        MenuPrincipal menuPrincipal = new MenuPrincipal();
                        menuPrincipal.setDato(TFNombre.getText(), RFC, Saldo);
                        menuPrincipal.setVisible(true);

                        this.dispose(); // Cerrar la ventana actual
                    } else {
                        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error de SQL: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        TFNombre.setText("");
        TFContrasena.setText("");
        }
    }//GEN-LAST:event_BotonInicioIniciarSesionActionPerformed

    private void TFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioIniciarSesion;
    private javax.swing.JButton BotonRegresarInicioSesion;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTextField TFContrasena;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
