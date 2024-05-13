/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import CUGestionPerfil.Perfil;
import dto.ClienteDTO;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Gui26
 */
public class LimiteProducto extends javax.swing.JFrame {
    
    private ClienteDTO clienteDto;
    private String url;
    
    /**
     * Creates new form LimiteProducto
     */
    public LimiteProducto(ClienteDTO clienteDto, String url){
        this.clienteDto = clienteDto;
        this.url = url;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupador = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnCarrito1 = new javax.swing.JButton();
        btnCerrarSesion1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        etiquetaDescripcion = new javax.swing.JLabel();
        try{
            etiquetaImagen = new javax.swing.JLabel(new ImageIcon(URI.create(url).toURL()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(LimiteProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnAñadir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalles del producto");

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));

        btnCarrito1.setBackground(new java.awt.Color(0, 102, 153));
        btnCarrito1.setForeground(new java.awt.Color(51, 51, 51));
        btnCarrito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito-compras.png"))); // NOI18N
        btnCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrito1ActionPerformed(evt);
            }
        });

        btnCerrarSesion1.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion1.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion1.setText("Cerrar sesion");
        btnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesion1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userBOTON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCerrarSesion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(btnCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Agrupador.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        btnVolver.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a la tienda");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Agrupador.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 240, 30));

        etiquetaDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion.setText("(Descripcion del producto)");
        Agrupador.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 257, -1));
        Agrupador.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 257, 154));

        btnAñadir.setBackground(new java.awt.Color(0, 102, 153));
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Añadir a carrito");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        Agrupador.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 240, 30));
        Agrupador.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 144, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        System.out.println("Este boton todavia no es funcinal");
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LimiteTienda limite = new LimiteTienda(clienteDto);
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrito1ActionPerformed
        LimiteCarrito limite = new LimiteCarrito(clienteDto);
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarrito1ActionPerformed

    private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
        LimiteIniciarSesion limite = new LimiteIniciarSesion();
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Perfil perfil = new Perfil();
        
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCarrito1;
    private javax.swing.JButton btnCerrarSesion1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
