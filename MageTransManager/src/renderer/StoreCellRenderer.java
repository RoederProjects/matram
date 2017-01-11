package renderer;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import core.entities.bricks.Store;

/**
 * Class StoreCellRenderer
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 10.01.2017
 * @category handle
 */
public class StoreCellRenderer extends JLabel implements ListCellRenderer<Object> {   
	
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