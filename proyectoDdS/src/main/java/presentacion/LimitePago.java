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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMetodo = new javax.swing.JComboBox<>();
        btnRealizaPago = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCorreoNombre = new javax.swing.JLabel();
        txtCorreoNombre = new javax.swing.JTextField();
        lblCvv = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla de pago");

        jLabel1.setText("Datos sobre pago");

        jLabel2.setText("Metodo de pago:");

        jLabel3.setText("Total:");

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Bancaria", "Transferencia Bancaria" }));
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });

        btnRealizaPago.setText("Pagar");
        btnRealizaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizaPagoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Numero:");

        lblCorreoNombre.setText("Nombre:");

        lblCvv.setText("CVV:");

        jDateFecha.setDateFormatString("yyyy-MM-dd");

        lblFecha.setText("Fecha de caducidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btnRealizaPago))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCvv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMetodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCorreoNombre)
                                    .addComponent(lblFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoNombre)
                    .addComponent(txtCorreoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCvv)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizaPago)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
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
                Integer.valueOf(lblTotal.getText()), txtCorreoNombre.getText(),
                LocalDateTime.ofInstant(jDateFecha.getCalendar().toInstant(), jDateFecha.getCalendar().getTimeZone().toZoneId()).toLocalDate(),
                txtCvv.getText());
            }
            if (cbMetodo.getSelectedItem().toString().equals("Transferencia Bancaria")){
                pagoDTO = new PagoDTO(txtNumero.getText(), cbMetodo.getSelectedItem().toString(),
                Integer.valueOf(lblTotal.getText()), txtCorreoNombre.getText());
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

    public void mostrar(){
        ICostoPago costo= new fachadaCostoPago();
        lblTotal.setText(Integer.toString(costo.costoPago(clienteDto)));
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizaPago;
    private javax.swing.JComboBox<String> cbMetodo;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCorreoNombre;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCorreoNombre;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
