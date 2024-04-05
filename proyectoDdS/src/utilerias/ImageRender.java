/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilerias;

import java.awt.Component;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gui26
 */
public class ImageRender extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        String url = value.toString();

        ImageIcon imageIcon = null;
        try {
            Image imagen = new ImageIcon(URI.create(url).toURL()).getImage();
            ImageIcon imagenT = new ImageIcon(imagen);
            float altura = imagenT.getIconHeight();
            float ancho = imagenT.getIconWidth();
            int definido = 40;
            imageIcon = new ImageIcon(imagen.getScaledInstance(
                    (int)((definido*ancho)/altura), definido, Image.SCALE_DEFAULT));
//            imageIcon = new ImageIcon(new ImageIcon(URI.create(url).toURL()).getImage().getScaledInstance(
//                    60, 40, Image.SCALE_DEFAULT));
        } catch (MalformedURLException ex) {
            Logger.getLogger(ImageRender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new JLabel(imageIcon);
    }
}
