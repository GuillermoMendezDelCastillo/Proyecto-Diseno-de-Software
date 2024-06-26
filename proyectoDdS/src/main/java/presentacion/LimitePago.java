/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;


///BANCO///
//import CUGestionPerfil.Perfil;
import CUGestionPerfil.LimitePerfil;
import subsistemaBanco.fachadaTarjetaDebito;
///otros //
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.List;
import java.util.Date;
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
//////////


import dto.ClienteDTO;
import dto.PagoDTO;
import subsistemaCostoPago.ICostoPago;
import subsistemaGenerarPago.IGenerarPago;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import subsistemaCalcularDescuento.ICalcularDescuento;
import subsistemaCalcularDescuento.fachadaCalcularDescuento;
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
        btnAplicar.setVisible(false);
        lblCupon.setVisible(false);
        txtNumeroCupon.setVisible(false);
        lblDescuento.setVisible(false);
        lblTotalConDescuento.setVisible(false);
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
        labelErrorTarjeta = new javax.swing.JLabel();
        labelErrorNombre = new javax.swing.JLabel();
        labelErrorFechaCaducidad = new javax.swing.JLabel();
        labelErrorCVV = new javax.swing.JLabel();
        rbCupon = new javax.swing.JRadioButton();
        btnAplicar = new javax.swing.JToggleButton();
        txtNumeroCupon = new javax.swing.JTextField();
        lblCupon = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblTotalConDescuento = new javax.swing.JLabel();

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
        Agrupador.add(btnRealizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Agrupador.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 40));

        lblCvv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCvv.setForeground(new java.awt.Color(0, 0, 0));
        lblCvv.setText("CVV:");
        Agrupador.add(lblCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtCvv.setBackground(new java.awt.Color(255, 255, 255));
        txtCvv.setForeground(new java.awt.Color(0, 0, 0));
        txtCvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCvvKeyTyped(evt);
            }
        });
        Agrupador.add(txtCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 152, -1));

        jDateFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateFecha.setForeground(new java.awt.Color(0, 0, 0));
        jDateFecha.setDateFormatString("yyyy-MM-dd");
        Agrupador.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, -1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha de caducidad:");
        Agrupador.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblCorreoNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreoNombre.setText("Nombre:");
        Agrupador.add(lblCorreoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtCorreoNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoNombreKeyTyped(evt);
            }
        });
        Agrupador.add(txtCorreoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 152, -1));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        Agrupador.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 152, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero:");
        Agrupador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Metodo de pago:");
        Agrupador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 10));

        cbMetodo.setBackground(new java.awt.Color(255, 255, 255));
        cbMetodo.setForeground(new java.awt.Color(0, 0, 0));
        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Bancaria", "Transferencia Bancaria" }));
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });
        Agrupador.add(cbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Agrupador.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 152, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total:");
        Agrupador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos sobre pago");
        Agrupador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

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
        btnCerrarSesion1.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta-de-credito (1).png"))); // NOI18N
        Agrupador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 180, 190));

        labelErrorTarjeta.setToolTipText("");
        Agrupador.add(labelErrorTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));
        Agrupador.add(labelErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        labelErrorFechaCaducidad.setToolTipText("");
        Agrupador.add(labelErrorFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        labelErrorCVV.setToolTipText("");
        Agrupador.add(labelErrorCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        rbCupon.setForeground(new java.awt.Color(0, 0, 0));
        rbCupon.setText("Cupon");
        rbCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCuponActionPerformed(evt);
            }
        });
        Agrupador.add(rbCupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        btnAplicar.setBackground(new java.awt.Color(255, 255, 255));
        btnAplicar.setForeground(new java.awt.Color(0, 0, 0));
        btnAplicar.setText("AplicarCupon");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        Agrupador.add(btnAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 270, 110, -1));

        txtNumeroCupon.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCupon.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuponActionPerformed(evt);
            }
        });
        Agrupador.add(txtNumeroCupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, -1));

        lblCupon.setForeground(new java.awt.Color(0, 0, 0));
        lblCupon.setText("Numero de cupon:");
        Agrupador.add(lblCupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        lblDescuento.setForeground(new java.awt.Color(0, 0, 0));
        lblDescuento.setText("Total con descuento aplicado:");
        Agrupador.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        lblTotalConDescuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalConDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Agrupador.add(lblTotalConDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 100, 20));

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

    // banco
        private void restablecerBorders(){
    
        // Guardar el borde original
        Border originalBorder = txtNumero.getBorder();
        Border originalBorderTitular = txtCorreoNombre.getBorder();
        Border originalBorderFecha = jDateFecha.getBorder();
        Border originalBorderCvv = txtCvv.getBorder();
        // Agregar el DocumentListener a txtNumero
        txtNumero.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                clearError();
            }

            public void removeUpdate(DocumentEvent e) {
                clearError();
            }

            public void insertUpdate(DocumentEvent e) {
                clearError();
            }

            // Método para limpiar el mensaje de error y el borde rojo
            public void clearError() {
                txtNumero.setBorder(originalBorder);
                labelErrorTarjeta.setText("");
            }        
        });
        
             // Agregar el DocumentListener a txtNumero
        txtCorreoNombre.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                clearError();
            }

            public void removeUpdate(DocumentEvent e) {
                clearError();
            }

            public void insertUpdate(DocumentEvent e) {
                clearError();
            }

            // Método para limpiar el mensaje de error y el borde rojo
            public void clearError() {
                txtCorreoNombre.setBorder(originalBorderTitular);
                labelErrorNombre.setText("");
            }        
        });
        // Obtener el editor de texto del JDateChooser
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateFecha.getDateEditor();
               // Agregar el DocumentListener a txtNumero
        editor.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                clearError();
            }

            public void removeUpdate(DocumentEvent e) {
                clearError();
            }

            public void insertUpdate(DocumentEvent e) {
                clearError();
            }

            // Método para limpiar el mensaje de error y el borde rojo
            public void clearError() {
                jDateFecha.setBorder(originalBorderFecha);
                labelErrorFechaCaducidad.setText("");
            }        
        });
        
         
             // Agregar el DocumentListener a txtNumero
        txtCvv.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                clearError();
            }

            public void removeUpdate(DocumentEvent e) {
                clearError();
            }

            public void insertUpdate(DocumentEvent e) {
                clearError();
            }

            // Método para limpiar el mensaje de error y el borde rojo
            public void clearError() {
                txtCvv.setBorder(originalBorderCvv);
                labelErrorCVV.setText("");
            }        
        });
        
        
    }
    
    
    
    
    
    
    
    private void btnRealizaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizaPagoActionPerformed
        restablecerBorders();
        IGenerarPago pago = new fachadaGenerarPago();
        if(validar()){
            
            if (rbCupon.isSelected()){
                if(validar3()){
                    PagoDTO pagoDTO = null;
                    if (cbMetodo.getSelectedItem().toString().equals("Tarjeta Bancaria")){
                        pagoDTO = new PagoDTO(txtNumero.getText(), cbMetodo.getSelectedItem().toString(),
                        Float.parseFloat(lblTotal.getText()), txtCorreoNombre.getText(),
                        LocalDateTime.ofInstant(jDateFecha.getCalendar().toInstant(), jDateFecha.getCalendar().getTimeZone().toZoneId()).toLocalDate(),
                        txtCvv.getText(), txtNumeroCupon.getText(),
                        Float.parseFloat(lblTotalConDescuento.getText()));
                    }
                    if (cbMetodo.getSelectedItem().toString().equals("Transferencia Bancaria")){
                        pagoDTO = new PagoDTO(txtNumero.getText(), cbMetodo.getSelectedItem().toString(),
                        Float.parseFloat(lblTotal.getText()), txtCorreoNombre.getText(),
                        txtNumeroCupon.getText(), Float.parseFloat(lblTotalConDescuento.getText()));
                    }

                    if (pago.generarPagoCupon(clienteDto, pagoDTO)){
                        JOptionPane.showMessageDialog(this, "Pago realizado");

                        LimiteTienda limite = new LimiteTienda(clienteDto);
                        limite.setVisible(true);
                        dispose();
                    } else{
                        JOptionPane.showMessageDialog(this, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Los datos del cupon son invalidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
            
            List<String> validacionTarjeta = validarTarjetaDebito();
            
            if (validacionTarjeta.contains("Valido")) {
            
            
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
            
            ///BANCO///
            } else {
                if (validacionTarjeta.contains("Error_Numero")) {
                    // Cambiar el borde del JTextField a rojo
                    txtNumero.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    // Mostrar el mensaje de error en labelErrorTarjeta
                    labelErrorTarjeta.setText("La tarjeta no existe");
                    labelErrorTarjeta.setForeground(Color.RED);

                } else {
                    // Iterar sobre la lista
                    for (String valor : validacionTarjeta) {
                        // Usar un switch para cada String en la lista
                        switch (valor) {
                            case "Error_Titular":
                                // Cambiar el borde del JTextField a rojo
                                txtCorreoNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                                // Mostrar el mensaje de error en labelErrorTarjeta
                                labelErrorNombre.setText("Nombre del Titular incorrecto");
                                labelErrorNombre.setForeground(Color.RED);
                                break;
                            case "Error_Fecha":
                                // Cambiar el borde del JTextField a rojo
                                jDateFecha.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                                // Mostrar el mensaje de error en labelErrorTarjeta
                                labelErrorFechaCaducidad.setText("Caducidad incorrecta");
                                labelErrorFechaCaducidad.setForeground(Color.RED);
                                break;
                            case "Error_Codigo":
                                // Cambiar el borde del JTextField a rojo
                                txtCvv.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                                // Mostrar el mensaje de error en labelErrorTarjeta
                                labelErrorCVV.setText("CVV incorrecto");
                                labelErrorCVV.setForeground(Color.RED);
                                break;
                            default:
                                System.out.println("Valor desconocido: " + valor);
                                break;
                        }
                    }

                }

            }
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

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
               char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
          }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtCorreoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoNombreKeyTyped
              char c = evt.getKeyChar();
    if (!Character.isLetter(c)) {
        evt.consume();  // Ignora cualquier carácter que sea una letra
    }
    }//GEN-LAST:event_txtCorreoNombreKeyTyped

    private void txtCvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCvvKeyTyped
                   char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
          }
    }//GEN-LAST:event_txtCvvKeyTyped

    private void rbCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCuponActionPerformed
        cupon();
    }//GEN-LAST:event_rbCuponActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        if(btnAplicar.isSelected()){
            txtNumeroCupon.setEditable(false);
            calcularDescuento();
        } else {
            txtNumeroCupon.setEditable(true);
            lblTotalConDescuento.setText(null);
        }
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void txtNumeroCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuponActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LimitePerfil perfil = new LimitePerfil();
        
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void mostrar(){
        ICostoPago costo= new fachadaCostoPago();
        lblTotal.setText(String.format("%.02f", costo.costoPago(clienteDto)));
    }
    /// banco
       public List<String> validarTarjetaDebito() {
        String numeroTarjeta = txtNumero.getText();
        String titular = txtCorreoNombre.getText();
        Date fechaCaducidad = jDateFecha.getDate();
        String cvv = txtCvv.getText();
        fachadaTarjetaDebito FTD = new fachadaTarjetaDebito();
        return FTD.validarTarjeta(numeroTarjeta, titular, fechaCaducidad, cvv);
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

    public void cupon(){
        if (rbCupon.isSelected()){
            btnAplicar.setVisible(true);
            lblCupon.setVisible(true);
            txtNumeroCupon.setEditable(true);
            txtNumeroCupon.setVisible(true);
            lblDescuento.setVisible(true);
            lblTotalConDescuento.setVisible(true);
        } else {
            btnAplicar.setVisible(false);
            btnAplicar.setSelected(false);
            lblCupon.setVisible(false);
            txtNumeroCupon.setVisible(false);
            txtNumeroCupon.setText(null);
            txtNumeroCupon.setEditable(true);
            lblDescuento.setVisible(false);
            lblTotalConDescuento.setVisible(false);
            lblTotalConDescuento.setText(null);
        }
    }
    
    public void calcularDescuento(){
        if (validar2()){
            ICalcularDescuento sesion = new fachadaCalcularDescuento();
            Float totalConDescuento = sesion.calcularDescuento(txtNumeroCupon.getText(), Float.parseFloat(lblTotal.getText()));
            if (totalConDescuento!=null){
                lblTotalConDescuento.setText(String.valueOf(totalConDescuento));
            } else{
                btnAplicar.setSelected(false);
                JOptionPane.showMessageDialog(this, "No se pudo encontrar el cupon");
            }
        } else{
            JOptionPane.showMessageDialog(this, "El campo del codigo del cupon esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
            btnAplicar.setSelected(false);
        }
    }
    
    public boolean validar2(){
        return !(txtNumeroCupon.getText().isBlank()||txtNumeroCupon.getText().isEmpty());
    }
    public boolean validar3(){
        if (lblTotalConDescuento.getText()!=null){
            if (lblTotalConDescuento.getText().isBlank()||lblTotalConDescuento.getText().isEmpty()){
                return false;
            }
        } else {
            return false;
        }
        return validar2();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JToggleButton btnAplicar;
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
    private javax.swing.JLabel labelErrorCVV;
    private javax.swing.JLabel labelErrorFechaCaducidad;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JLabel labelErrorTarjeta;
    private javax.swing.JLabel lblCorreoNombre;
    private javax.swing.JLabel lblCupon;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalConDescuento;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JRadioButton rbCupon;
    private javax.swing.JTextField txtCorreoNombre;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroCupon;
    // End of variables declaration//GEN-END:variables
}
