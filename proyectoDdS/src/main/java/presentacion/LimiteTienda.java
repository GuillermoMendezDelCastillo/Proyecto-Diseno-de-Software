/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import CUGestionPerfil.Perfil;
import dto.ClienteDTO;
import dto.ProductoDTO;
import subsistemaAgregarProducto.IAgregarProducto;
import utilerias.ButtonColumn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import subsistemaAgregarProducto.fachadaAgregarProducto;
import utilerias.ImageRender;
import subsistemaTablaProductosTienda.ITablaProductosTienda;
import subsistemaTablaProductosTienda.fachadaTablaProductosTienda;

/**
 *
 * @author Gui26
 */
public class LimiteTienda extends javax.swing.JFrame {
    
    private ClienteDTO clienteDto;
    
    /**
     * Creates new form LimiteTienda
     */
    public LimiteTienda(ClienteDTO clienteDto){
        this.clienteDto = clienteDto;
        initComponents();
        tabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelMenu = new javax.swing.JPanel();
        btnCarrito = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda");

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos.setForeground(new java.awt.Color(102, 102, 102));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaProductos);

        Agrupador.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 540, 321));

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));

        btnCarrito.setBackground(new java.awt.Color(0, 102, 153));
        btnCarrito.setForeground(new java.awt.Color(51, 51, 51));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito-compras.png"))); // NOI18N
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
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
                .addComponent(btnCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Agrupador.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        LimiteCarrito limite = new LimiteCarrito(clienteDto);
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        LimiteIniciarSesion limite = new LimiteIniciarSesion();
        limite.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Perfil perfil = new Perfil();
        
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void tabla(){

        ITablaProductosTienda lista = new fachadaTablaProductosTienda();
        List<ProductoDTO> productos = lista.tablaProductosTienda();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("");
        modelo.addColumn("Producto");
        modelo.addColumn("");
        modelo.addColumn("Precio");
        modelo.addColumn("");
        modelo.addColumn("");
        for (ProductoDTO producto : productos){
            Object[] fila = {producto.getId(), producto.getNombre(), producto.getUrl(), String.format("%.02f", producto.getCosto()), "Ver Producto", "Añadir a Carrito"};
            modelo.addRow(fila);
        }
        
        tablaProductos.setRowHeight(40);

        tablaProductos.setModel(modelo);
        TableColumnModel columnModel = tablaProductos.getColumnModel();
        
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(0).setWidth(0);
        
        ButtonColumn btnVerProducto = new ButtonColumn("", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = (String) tablaProductos.getModel().getValueAt(tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow()), 2);
                LimiteProducto ventana = new LimiteProducto(clienteDto, url);
                ventana.setVisible(true);
                dispose();
            }//tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow())
        });

        ButtonColumn btnAñadir = new ButtonColumn("", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String producto = (String) tablaProductos.getModel().getValueAt(tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow()), 0);
                Long idproducto = (Long) tablaProductos.getModel().getValueAt(tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow()), 0);
                IAgregarProducto agrega = new fachadaAgregarProducto();
                agrega.agregarProducto(clienteDto, idproducto);
            }
        });

        columnModel.getColumn(2).setCellRenderer(new ImageRender());

        columnModel.getColumn(4).setCellRenderer(btnVerProducto);
        columnModel.getColumn(4).setCellEditor(btnVerProducto);

        columnModel.getColumn(5).setCellRenderer(btnAñadir);
        columnModel.getColumn(5).setCellEditor(btnAñadir);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
