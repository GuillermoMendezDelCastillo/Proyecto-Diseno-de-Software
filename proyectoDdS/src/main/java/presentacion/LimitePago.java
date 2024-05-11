/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dto.ClienteDTO;
import dto.PagoDTO;
import subsistemaCostoPago.ICostoPago;
import subsistemaGenerarPago.IGenerarPago;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import subsistemaCostoPago.fachadaCostoPago;
import subsistemaGenerarPago.fachadaGenerarPago;

/**
 *
 * @author Gui26
 */
public class LimitePago extends javax.swing.JFrame {
    
    private ClienteDTO clienteDto;
    
    /**
     * Creates new form LimitePago
     */
    public LimitePago(ClienteDTO clienteDto) {
        this.clienteDto = clienteDto;
        initComponents();
        mostrar();
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
        btnRealizaPago = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCvv = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();
        lblCorreoNombre = new javax.swing.JLabel();
        txtCorreoNombre = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMetodo = new javax.swing.JComboBox<>();
        lblTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnCarrito1 = new javax.swing.JButton();
        btnCerrarSesion1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla de pago");

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRealizaPago.setBackground(new java.awt.Color(0, 102, 153));
        btnRealizaPago.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizaPago.setText("Pagar");
        btnRealizaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizaPagoActionPerformed(evt);
            }
        });
        Agrupador.add(btnRealizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 100, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Agrupador.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, 40));

        lblCvv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCvv.setForeground(new java.awt.Color(0, 0, 0));
        lblCvv.setText("CVV:");
        Agrupador.add(lblCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtCvv.setBackground(null);
        txtCvv.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 152, -1));

        jDateFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateFecha.setForeground(new java.awt.Color(0, 0, 0));
        jDateFecha.setDateFormatString("yyyy-MM-dd");
        Agrupador.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, -1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha de caducidad:");
        Agrupador.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        lblCorreoNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreoNombre.setText("Nombre:");
        Agrupador.add(lblCorreoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtCorreoNombre.setBackground(null);
        txtCorreoNombre.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtCorreoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 152, -1));

        txtNumero.setBackground(null);
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 152, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero:");
        Agrupador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Metodo de pago:");
        Agrupador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        cbMetodo.setBackground(new java.awt.Color(0, 0, 0));
        cbMetodo.setForeground(new java.awt.Color(0, 0, 0));
        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Bancaria", "Transferencia Bancaria" }));
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });
        Agrupador.add(cbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        lblTotal.setBackground(null);
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Agrupador.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 152, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total:");
        Agrupador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos sobre pago");
        Agrupador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta-de-credito (1).png"))); // NOI18N
        Agrupador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 180, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodoActionPerformed
        if (cbMetodo.getSelectedItem().toString().equals("Tarjeta Bancaria")){
            lblCorreoNombre.setText("Nombre:");
            lblFecha.setVisible(true);
            jDateFecha.setVisible(true);
            lblCvv.setVisible(true);
            txtCvv.setVisible(true);
        }
        if (cbMetodo.getSelectedItem().toString().equals("Transferencia Bancaria")){
            lblCorreoNombre.setText("Correo:");
            lblFecha.setVisible(false);
            jDateFecha.setVisible(false);
            lblCvv.setVisible(false);
            txtCvv.setVisible(false);
        }
    }//GEN-LAST:event_cbMetodoActionPerformed

    private void btnRealizaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizaPagoActionPerformed
        
        IGenerarPago pago = new fachadaGenerarPago();
        if(validar()){
            PagoDTO pagoDTO = null;
            if (cbMetodo.getSelectedItem().toString().equals("Tarjeta Bancaria")){
                pagoDTO = new PagoDTO(txtNumero.getText(), cbMetodo.getSelectedItem().toString(),
                Float.parseFloat(lblTotal.getText()), txtCorreoNombre.getText(),
                LocalDateTime.ofInstant(jDateFecha.getCalendar().toInstant(), jDateFecha.getCalendar().getTimeZone().toZoneId()).toLocalDate(),
                txtCvv.getText());
            }
            if (cbMetodo.getSelectedItem().toString().equals("Transferencia Bancaria")){
                pagoDTO = new PagoDTO(txtNumero.getText(), cbMetodo.getSelectedItem().toString(),
                Float.parseFloat(lblTotal.getText()), txtCorreoNombre.getText());
            }
            
            if (pago.generarPago(clienteDto, pagoDTO)){
                JOptionPane.showMessageDialog(this, "Pago realizado");

                LimiteTienda limite = new LimiteTienda(clienteDto);
                limite.setVisible(true);
                dispose();
            } else{
                JOptionPane.showMessageDialog(this, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnRealizaPagoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimiteCarrito limite = new LimiteCarrito(clienteDto);
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    public void mostrar(){
        ICostoPago costo= new fachadaCostoPago();
        lblTotal.setText(String.format("%.02f", costo.costoPago(clienteDto)));
    }
    
    public boolean validar(){
        if (cbMetodo.getSelectedItem().toString().equals("Tarjeta Bancaria")){
            return !(txtNumero.getText().isBlank()||txtNumero.getText().isEmpty()
                ||txtCorreoNombre.getText().isBlank()||txtCorreoNombre.getText().isEmpty()
                ||!(jDateFecha.getCalendar()!=null)
                ||txtCvv.getText().isBlank()||txtCvv.getText().isEmpty());
        }
        if (cbMetodo.getSelectedItem().toString().equals("Transferencia Bancaria")){
            return !(txtNumero.getText().isBlank()||txtNumero.getText().isEmpty()
                ||txtCorreoNombre.getText().isBlank()||txtCorreoNombre.getText().isEmpty());
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCarrito1;
    private javax.swing.JButton btnCerrarSesion1;
    private javax.swing.JButton btnRealizaPago;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCorreoNombre;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextField txtCorreoNombre;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
