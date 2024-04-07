/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dto.ClienteDTO;
import dto.ProductoDTO;
import interfaces.IAgregarProducto;
import utilerias.ButtonColumn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import objetos_negocio.AgregarProducto;
import objetos_negocio.TablaProductosTienda;
import utilerias.ImageRender;
import interfaces.ITablaProductosTienda;

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

        btnCarrito = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda");

        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarrito)
                        .addGap(29, 29, 29)
                        .addComponent(btnCerrarSesion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion)
                    .addComponent(btnCarrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

    public void tabla(){

        ITablaProductosTienda lista = new TablaProductosTienda();
        List<ProductoDTO> productos = lista.consulta();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("");
        modelo.addColumn("Precio");
        modelo.addColumn("");
        modelo.addColumn("");
        for (ProductoDTO producto : productos){
            Object[] fila = {producto.getNombre(), producto.getUrl(), producto.getCosto(), "Ver Producto", "Añadir a Carrito"};
            modelo.addRow(fila);
        }

        tablaProductos.setRowHeight(40);

        tablaProductos.setModel(modelo);
        TableColumnModel columnModel = tablaProductos.getColumnModel();

        ButtonColumn btnVerProducto = new ButtonColumn("", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = (String) tablaProductos.getModel().getValueAt(tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow()), 1);
                LimiteProducto ventana = new LimiteProducto(clienteDto, url);
                ventana.setVisible(true);
                dispose();
            }//tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow())
        });

        ButtonColumn btnAñadir = new ButtonColumn("", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = (String) tablaProductos.getModel().getValueAt(tablaProductos.convertRowIndexToModel(tablaProductos.getEditingRow()), 0);
                
                IAgregarProducto agrega = new AgregarProducto();
                agrega.agregar(clienteDto, producto);
            }
        });

        columnModel.getColumn(1).setCellRenderer(new ImageRender());

        columnModel.getColumn(3).setCellRenderer(btnVerProducto);
        columnModel.getColumn(3).setCellEditor(btnVerProducto);

        columnModel.getColumn(4).setCellRenderer(btnAñadir);
        columnModel.getColumn(4).setCellEditor(btnAñadir);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
