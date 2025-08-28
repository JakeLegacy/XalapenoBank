/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.Random;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import config.Conexion;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class Carrusel extends javax.swing.JFrame {
    
    private String dato;
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Random random = new Random();
    int codigo = 100000 + random.nextInt(900000);
    
    
    private int currentIndex = 0; // Índice de la imagen actual
    private String[] imagePaths = {
        "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\Termo.png",
        "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\CamisaBlanco.png",
        "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\GorraGris.png",
        "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\GorraAzul.png",
        "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\CamisaAzul.png"
    }; // Rutas de las imágenes
    
     private int[] precios = {200, 350, 150, 150, 350}; // Precios de los productos
    
    
     
    public void scaleImage3(){
    ImageIcon icon = new ImageIcon("C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\4105931-add-to-cart-buy-cart-sell-shop-shopping-cart_113919 (1).png");
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(Icon2.getWidth(), Icon2.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    Icon2.setIcon(scaledIcon);
    }
    
    public void scaleImage(){
    ImageIcon icon = new ImageIcon("C:\\Users\\cesar\\Downloads\\role_user_icon_217169 (1).png");
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(Icon.getWidth(), Icon.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    Icon.setIcon(scaledIcon);
    }
    
    public void generarPDF(int cantidadRetirada, int nuevoSaldo, String RFCSeleccionado) {
    Document document = new Document();
    try {
        String filePath = "C:\\\\Users\\\\cesar\\\\Documents\\\\NetBeansProjects\\\\BancoAgain2\\\\ChequesCompras\\\\Retiro.pdf";
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));

        document.open();

        // Contenido del PDF
        Paragraph title = new Paragraph("CHEQUE COMPRA");
        document.add(title);

        // Agregar espacio entre párrafos
        document.add(new Paragraph("")); // Párrafo vacío

        document.add(new Paragraph("BANCO XALAPEÑO 2024"));
        document.add(new Paragraph("Comprobante de Compra"));
        document.add(new Paragraph(""));
        document.add(new Paragraph(""));
        
        // Mostrar el gasto hecho al comprar un artículo
        int costoProducto = precios[currentIndex];
        document.add(new Paragraph("Se ha comprado un artículo por un costo de: $" + costoProducto));
        document.add(new Paragraph("Código de Compra: "+codigo));
        document.add(new Paragraph("Gracias por su preferencia :D"));

        // Agregar imagen
        String imagePath = "C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\Logo.png";
        try {
            com.lowagie.text.Image image = com.lowagie.text.Image.getInstance(imagePath);
            image.scaleAbsolute(5f * 28.33f, 5f * 28.33f); // Escalar la imagen a 10x10 cm
            document.add(image);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Cheque generado exitosamente.");
        document.close();
    } catch (DocumentException | FileNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (document != null && document.isOpen()) {
            document.close();
            }
        }
    }
         
    public Carrusel() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        showImage(currentIndex); // Mostrar la primera imagen al iniciar
        scaleImage3();
        scaleImage();
    }
    
    
    public void scaleImage2(){
    ImageIcon icon = new ImageIcon("C:\\Users\\cesar\\Downloads\\return_icon_154912.png");
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    Imagen.setIcon(scaledIcon);
    
    }

    public void setDato(String dato) {
        this.dato = dato;
        NombreTrans.setText(dato);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CostoLabel = new javax.swing.JLabel();
        NombreTrans = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Icon2 = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(146, 205, 226));

        jLabel5.setFont(new java.awt.Font("Hind Madurai Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 106));
        jLabel5.setText("MERCH");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 106), 3));

        prev.setBackground(new java.awt.Color(146, 205, 226));
        prev.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 102, 106));
        prev.setText("<<");
        prev.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prev.setFocusPainted(false);
        prev.setFocusable(false);
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(146, 205, 226));
        next.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 102, 106));
        next.setText(">>");
        next.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        next.setFocusPainted(false);
        next.setFocusable(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hind Madurai Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 106));
        jLabel1.setText("Nombre del Usuario:");

        jLabel2.setFont(new java.awt.Font("Hind Madurai Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 106));
        jLabel2.setText("Costo del producto: $");

        CostoLabel.setFont(new java.awt.Font("Hind Madurai Light", 1, 18)); // NOI18N
        CostoLabel.setForeground(new java.awt.Color(0, 102, 106));

        NombreTrans.setFont(new java.awt.Font("Hind Madurai Light", 1, 18)); // NOI18N
        NombreTrans.setForeground(new java.awt.Color(0, 102, 106));

        jButton1.setBackground(new java.awt.Color(200, 212, 210));
        jButton1.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 106));
        jButton1.setText("Cerrar Sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(146, 205, 226));
        jButton2.setFont(new java.awt.Font("Hind Madurai Light", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 106));
        jButton2.setText("Comprar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CostoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CostoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Icon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        currentIndex = (currentIndex + 1) % imagePaths.length; // Avanzar al siguiente índice circularmente
        showImage(currentIndex);
    }//GEN-LAST:event_prevActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        currentIndex = (currentIndex - 1 + imagePaths.length) % imagePaths.length; // Retroceder al índice anterior circularmente
        showImage(currentIndex);
    }//GEN-LAST:event_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String nombreCliente = NombreTrans.getText(); // Obtener el nombre del cliente
    int costoProducto = Integer.parseInt(CostoLabel.getText()); // Obtener el costo del producto

    // Realizar la actualización en la base de datos solo si el saldo es suficiente
    if (verificarSaldoSuficiente(nombreCliente, costoProducto)) {

        // Realizar la actualización en la base de datos
        try {
            cn = con.getConnection(); // Obtener la conexión
            st = cn.createStatement(); // Crear el objeto Statement

            // Query para actualizar el saldo del cliente
            String query = "UPDATE Clientes SET Saldo = Saldo - " + costoProducto + " WHERE Nombre = '" + nombreCliente + "'";
            st.executeUpdate(query); // Ejecutar la actualización
            generarPDF(costoProducto, 0, "");
            // Si necesitas actualizar algún otro dato en la base de datos, puedes hacerlo aquí
            JOptionPane.showMessageDialog(null, "Objeto Comprado Satisfactoriamente, Su código de obtención: "+codigo);
            // Asegúrate de cerrar el Statement después de su uso

            st.close();
        } catch (Exception ex) {
            ex.printStackTrace(); // Manejo de errores
            JOptionPane.showMessageDialog(null, "Objeto NO Comprado");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No tienes el saldo suficiente");
    }
}  

private boolean verificarSaldoSuficiente(String nombreCliente, int costoProducto) {
    boolean saldoSuficiente = false;
    // Obtener el saldo del cliente
    try {
        cn = con.getConnection(); // Obtener la conexión
        st = cn.createStatement(); // Crear el objeto Statement

        // Query para obtener el saldo del cliente
        String query = "SELECT Saldo FROM Clientes WHERE Nombre = '" + nombreCliente + "'";
        rs = st.executeQuery(query); // Ejecutar la consulta
        if (rs.next()) {
            int saldo = rs.getInt("Saldo");
            if (saldo >= costoProducto) {
                saldoSuficiente = true;
            }
        }

        // Asegúrate de cerrar el ResultSet después de su uso
        rs.close();
        st.close();
    } catch (Exception ex) {
        ex.printStackTrace(); // Manejo de errores
         }
        return saldoSuficiente;
    }//GEN-LAST:event_jButton2ActionPerformed


    private void showImage(int index) {
    ImageIcon icon;
    Image img;
    Image imgScale;
    ImageIcon scaledIcon;
    
    // Verificar si la imagen es "Termo.png" para cambiar sus dimensiones
    if (imagePaths[index].equals("C:\\Users\\cesar\\Desktop\\Carpeta del Banco\\Termo.png")) {
        icon = new ImageIcon(imagePaths[index]);
        img = icon.getImage();
        imgScale = img.getScaledInstance(80, 141, Image.SCALE_SMOOTH); // Establecer las nuevas dimensiones
        scaledIcon = new ImageIcon(imgScale);
    } else {
        icon = new ImageIcon(imagePaths[index]);
        img = icon.getImage();
        imgScale = img.getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
    }
    
    // Centrar la imagen en el JLabel
    Imagen.setHorizontalAlignment(JLabel.CENTER);
    Imagen.setVerticalAlignment(JLabel.CENTER);
    Imagen.setIcon(scaledIcon);
    CostoLabel.setText(String.valueOf(precios[index])); // Actualizar el valor de CostoLabel
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrusel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CostoLabel;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Icon2;
    public static javax.swing.JLabel Imagen;
    private javax.swing.JLabel NombreTrans;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    // End of variables declaration//GEN-END:variables

}
