package renderer;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import core.entities.bricks.Store;

public class StoreCellRenderer extends JLabel implements ListCellRenderer<Object> {    
    // ListCellRenderer-Implementierung ----------------------------------------
    public Component getListCellRendererComponent(JList<?> list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
       
        if(value instanceof Store) {
            Store store = (Store)value;
            setText(store.getUrl() + " [" + store.getShopSys() + "]");
        } else {
            setText(value.toString());
        }
       
        return this;
    }  
}