/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.views;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.border.LineBorder;

import core.entities.bricks.Item;
import core.entities.bricks.GroupItem;
import core.entities.bricks.ItemType;

import java.awt.Component;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.JTable;
import java.awt.ComponentOrientation;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Rectangle;
import java.util.Locale;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

/**
 *
 * @author Timo
 */
@SuppressWarnings({ "unchecked", "serial" })
public class MainView_old extends frontend.handler.MainHandler {

    public MainView_old() {
    	
    	/** Init the JFrame (App-Window)***********************************************************/
    	setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(MainView_old.class.getResource("/res/icon_translations.png")));
    	setLocation(new Point(150, 50));
    	setLocale(Locale.ENGLISH);
    	setMaximizedBounds(new Rectangle(0, 0, 1900, 1200));
    	setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
    	setPreferredSize(new Dimension(850, 685));
    	setTitle("Magento Translations Manager v.0.1");
    	
    	/** Init the frame-internal GUI (Menubar, Control Elements, Tables etc.)*******************/
        initComponents();
        
    }

    /** This method is called from within the constructor to initialize the form. *****************/
	private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        columnEditor = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton12 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        rowEditor = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnl_body = new javax.swing.JPanel();
        pnl_body.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        pnl_body.setAutoscrolls(true);
        pnl_body.setAlignmentY(Component.TOP_ALIGNMENT);
        pnl_body.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnl_toolBar = new javax.swing.JPanel();
        pnl_toolBar.setAlignmentY(Component.TOP_ALIGNMENT);
        pnl_toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToolBar3 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jComboBox2 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menu_exportTo = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_pushToLive = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mItem_settings = new javax.swing.JMenuItem();
        mItem_settings.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_settings.png")));
        mItem_settings.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		openSettings();
        	}
        });
        mItem_search = new javax.swing.JMenuItem();
        mItem_search.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_search.png")));
        mItem_exit = new javax.swing.JMenuItem();
        mItem_exit.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_shut-down.png")));
        mItem_exit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        jMenu8 = new javax.swing.JMenu();
        jMenu2 = new JMenuItem();
        jMenu2.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_translations.png")));
        jMenu7 = new JMenuItem();
        jMenu7.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_database.png")));
        jMenu4 = new javax.swing.JMenu();
        jMenu4.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_view.png")));
        jMenu10 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem14 = new JCheckBoxMenuItem();
        jMenuItem14.setSelected(true);
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mItem_userProfile = new javax.swing.JMenuItem();
        mItem_userProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		requestAuth();
        	}
        });

        jButton6.setText("Search");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Search ");

        jButton8.setText("Close");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jTextField3))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Identifier", "German", "English", "French", "Italian", "Spanish" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton12.setText("Add new column");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Column Name");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel6.setText("Description");

        jLabel7.setText("Status");

        jCheckBox2.setText("Notifications");

        jCheckBox1.setText("Active");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Order");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton10.setText("Save");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });

        jButton9.setText("Reset");

        jButton11.setText("Delete");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout columnEditorLayout = new javax.swing.GroupLayout(columnEditor.getContentPane());
        columnEditor.getContentPane().setLayout(columnEditorLayout);
        columnEditorLayout.setHorizontalGroup(
            columnEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        columnEditorLayout.setVerticalGroup(
            columnEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel8.setText("<<Identifier Value>>");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identifier", "German", "English", "French", "Italian", "Spanish" }));
        jComboBox1.setSelectedIndex(1);

        jEditorPane1.setText("Warenkorb");
        jScrollPane4.setViewportView(jEditorPane1);

        jButton13.setText("Save");

        jButton14.setText("Reset");

        jButton15.setText("Delete");

        jButton16.setText("Cancel");

        jButton17.setText("(De)Activate");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });

        jLabel9.setText("Send Notification to ");

        jTextField4.setText("Peter.Spaten@yahoooo.com");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Control Elements", "Full Texts" }));
        jComboBox3.setSelectedIndex(1);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });

        jLabel10.setText("Value for");

        jLabel11.setText("Category");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setText("last edit <<dd.mm.yyyy>> by <<user>>");

        jButton18.setText("Confirm");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
            }
        });

        jButton19.setText("Attach File");
        jButton19.setEnabled(false);

        jLabel13.setText("File");
        jLabel13.setEnabled(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ControlElements\\basket.pdf");
        jLabel14.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13))
                    .addComponent(jSeparator4)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 140, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton19)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton16)
                    .addComponent(jButton18)
                    .addComponent(jButton17)
                    .addComponent(jButton15))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rowEditorLayout = new javax.swing.GroupLayout(rowEditor.getContentPane());
        rowEditor.getContentPane().setLayout(rowEditorLayout);
        rowEditorLayout.setHorizontalGroup(
            rowEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rowEditorLayout.setVerticalGroup(
            rowEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_body.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        jLabel1.setText("Show/Hide");
        jToolBar1.add(jLabel1);

        jToggleButton2.setSelected(true);
        jToggleButton2.setText("Identifier");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton2);

        jToggleButton6.setSelected(true);
        jToggleButton6.setText("German");
        jToggleButton6.setFocusable(false);
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton6);

        jToggleButton3.setText("English");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton3);

        jToggleButton4.setText("French");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton4);

        jToggleButton5.setSelected(true);
        jToggleButton5.setText("Italian");
        jToggleButton5.setFocusable(false);
        jToggleButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton5);

        jToggleButton7.setText("Spanish");
        jToggleButton7.setFocusable(false);
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton7);

        jToolBar3.setRollover(true);

        jButton7.setText("Push to Live");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton7);

        jToolBar4.setRollover(true);

        jComboBox2.setModel(new DefaultComboBoxModel(new String[] {"All", "Control Elements", "Checkout", "Basket/Cart", "Default"}));
        jToolBar4.add(jComboBox2);
        
        pnl_transTable = new JPanel();
        pnl_transTable.setBorder(new LineBorder(Color.GRAY));
        pnl_transTable.setBackground(SystemColor.control);
        
        panel = new JPanel();
        panel.setBorder(new LineBorder(Color.GRAY));

        javax.swing.GroupLayout gl_pnl_body = new javax.swing.GroupLayout(pnl_body);
        gl_pnl_body.setHorizontalGroup(
        	gl_pnl_body.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnl_body.createSequentialGroup()
        			.addGroup(gl_pnl_body.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnl_body.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(pnl_transTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(gl_pnl_body.createSequentialGroup()
        					.addGap(10)
        					.addComponent(pnl_toolBar, GroupLayout.PREFERRED_SIZE, 814, Short.MAX_VALUE))
        				.addGroup(gl_pnl_body.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        gl_pnl_body.setVerticalGroup(
        	gl_pnl_body.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnl_body.createSequentialGroup()
        			.addGap(2)
        			.addComponent(pnl_toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pnl_transTable, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(41))
        );
        
        JToolBar toolBar = new JToolBar();
        
        JButton btnLogout = new JButton("Logout");
        toolBar.add(btnLogout);
        GroupLayout gl_pnl_toolBar = new GroupLayout(pnl_toolBar);
        gl_pnl_toolBar.setHorizontalGroup(
        	gl_pnl_toolBar.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnl_toolBar.createSequentialGroup()
        			.addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(jToolBar4, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(jToolBar3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        );
        gl_pnl_toolBar.setVerticalGroup(
        	gl_pnl_toolBar.createParallelGroup(Alignment.LEADING)
        		.addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        		.addComponent(jToolBar4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        		.addComponent(jToolBar3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        		.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        );
        pnl_toolBar.setLayout(gl_pnl_toolBar);
        scrPn_transTable = new javax.swing.JScrollPane();
        scrPn_transTable.setBackground(Color.WHITE);
        tbl_trans = new javax.swing.JTable();
        tbl_trans.addInputMethodListener(new InputMethodListener() {
        	public void caretPositionChanged(InputMethodEvent arg0) {
        		tbl_trans.getSelectedRow();
        		tbl_trans.getSelectedColumn();
        	}
        	public void inputMethodTextChanged(InputMethodEvent arg0) {
        	}
        });
        tbl_trans.setAlignmentY(Component.TOP_ALIGNMENT);
        tbl_trans.setAlignmentX(Component.LEFT_ALIGNMENT);
        tbl_trans.setFillsViewportHeight(true);
        tbl_trans.setPreferredScrollableViewportSize(new Dimension(450, 450));
        tbl_trans.setCellSelectionEnabled(true);
        tbl_trans.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        tbl_trans.setShowVerticalLines(false);
        tbl_trans.setIntercellSpacing(new Dimension(6, 4));
        tbl_trans.setRowMargin(4);
        tbl_trans.setRowHeight(24);
        tbl_trans.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
                tbl_trans.setModel(new javax.swing.table.DefaultTableModel(
                    new Item[][]{
                    	{new Item(), new Item(), new Item()},
                    	{new Item(), new Item(), new Item()}
                    },
                    new ItemType [] {
                        new ItemType(), new ItemType(), new ItemType()
                    }
                ) {
                    Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
        
                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }
                });
                scrPn_transTable.setViewportView(tbl_trans);
                pnl_btnBar = new javax.swing.JPanel();
                jButton4 = new javax.swing.JButton();
                jButton4.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		openItemEditor();
                	}
                });
                jButton5 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                
                        pnl_btnBar.setBackground(UIManager.getColor("Panel.background"));
                        
                                jButton4.setText("Edit");
                                
                                        jButton5.setText("(De)Activate");
                                        
                                                jButton3.setText("New");
                                                
                                                textField = new JTextField();
                                                
                                                JButton btnSearch = new JButton();
                                                btnSearch.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_search.png")));
                                                btnSearch.setVerticalTextPosition(SwingConstants.BOTTOM);
                                                btnSearch.setHorizontalTextPosition(SwingConstants.CENTER);
                                                btnSearch.setFocusable(false);
                GroupLayout gl_pnl_transTable = new GroupLayout(pnl_transTable);
                gl_pnl_transTable.setHorizontalGroup(
                	gl_pnl_transTable.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_pnl_transTable.createSequentialGroup()
                			.addContainerGap()
                			.addGroup(gl_pnl_transTable.createParallelGroup(Alignment.TRAILING)
                				.addComponent(scrPn_transTable, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                				.addComponent(pnl_btnBar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 792, GroupLayout.PREFERRED_SIZE))
                			.addContainerGap())
                );
                gl_pnl_transTable.setVerticalGroup(
                	gl_pnl_transTable.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_pnl_transTable.createSequentialGroup()
                			.addGap(10)
                			.addComponent(pnl_btnBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                			.addPreferredGap(ComponentPlacement.RELATED)
                			.addComponent(scrPn_transTable, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                			.addContainerGap())
                );
                GroupLayout gl_pnl_btnBar = new GroupLayout(pnl_btnBar);
                gl_pnl_btnBar.setHorizontalGroup(
                	gl_pnl_btnBar.createParallelGroup(Alignment.LEADING)
                		.addGroup(Alignment.TRAILING, gl_pnl_btnBar.createSequentialGroup()
                			.addGap(6)
                			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                			.addGap(10)
                			.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                			.addPreferredGap(ComponentPlacement.UNRELATED)
                			.addComponent(jButton5)
                			.addPreferredGap(ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                			.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                			.addPreferredGap(ComponentPlacement.RELATED)
                			.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                			.addContainerGap())
                );
                gl_pnl_btnBar.setVerticalGroup(
                	gl_pnl_btnBar.createParallelGroup(Alignment.TRAILING)
                		.addGroup(Alignment.LEADING, gl_pnl_btnBar.createSequentialGroup()
                			.addGap(1)
                			.addGroup(gl_pnl_btnBar.createParallelGroup(Alignment.TRAILING)
                				.addGroup(gl_pnl_btnBar.createParallelGroup(Alignment.BASELINE)
                					.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                					.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                				.addGroup(Alignment.LEADING, gl_pnl_btnBar.createSequentialGroup()
                					.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                					.addPreferredGap(ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE)))
                			.addGap(9))
                );
                pnl_btnBar.setLayout(gl_pnl_btnBar);
                pnl_transTable.setLayout(gl_pnl_transTable);
        pnl_body.setLayout(gl_pnl_body);

        jMenu3.setText("Menu");

        menu_exportTo.setText("Export to");

        jMenuItem3.setText(".csv");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });
        menu_exportTo.add(jMenuItem3);

        jMenu3.add(menu_exportTo);

        menu_pushToLive.setText("Push to Live");

        jMenuItem5.setText("Magento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        menu_pushToLive.add(jMenuItem5);

        jMenu3.add(menu_pushToLive);

        mItem_settings.setText("Settings");
        jMenu3.add(mItem_settings);

        mItem_search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mItem_search.setText("Search");
        jMenu3.add(mItem_search);

        mItem_exit.setText("Exit");
        jMenu3.add(mItem_exit);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Manage...");

        jMenu2.setText("Items");

        jMenu8.add(jMenu2);

        jMenu7.setText("Item Types");
        
        mntmItemCategories = new JMenuItem("Item Categories");
        jMenu8.add(mntmItemCategories);

        jMenu8.add(jMenu7);

        jMenuBar1.add(jMenu8);

        jMenu4.setText("View");

        jMenu10.setText("Toolbar");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Language Chooser");
        jMenu10.add(jCheckBoxMenuItem1);

        jMenuItem14.setText("Category Chooser");
        jMenu10.add(jMenuItem14);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("'Push to Live' Button");
        jMenu10.add(jCheckBoxMenuItem2);

        jMenu4.add(jMenu10);

        jMenu11.setText("Languages");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Identifier");
        jMenu11.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("German");
        jMenu11.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("English");
        jMenu11.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("French");
        jMenu11.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Italian");
        jMenu11.add(jCheckBoxMenuItem7);

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("Spanish");
        jMenu11.add(jCheckBoxMenuItem8);

        jMenu4.add(jMenu11);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("User");

        mItem_userProfile.setText("Profile");
        jMenu6.add(mItem_userProfile);

        jMenuItem6.setText("Logout");
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);
        
        mnAdmin = new JMenu("Admin");
        jMenuBar1.add(mnAdmin);
        jMenu9 = new javax.swing.JMenu();
        mnAdmin.add(jMenu9);
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		openUserConfig(0);
        	}
        });
        jMenuItem13.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_user-edit.png")));
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem12.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_user-groups.png")));
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		openUserConfig(2);
        	}
        });
        jMenuItem4.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_user-teams.png")));
        
                jMenu9.setText("Authorisation");
                
                        jMenuItem13.setText("Users");
                        jMenu9.add(jMenuItem13);
                        
                                jMenuItem12.setText("Usergroups");
                                jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        openUserConfig(1);
                                    }
                                });
                                jMenu9.add(jMenuItem12);
                                
                                        jMenuItem4.setText("Teams");
                                        jMenu9.add(jMenuItem4);
                                        
                                        JMenu mnHelp = new JMenu("About");
                                        mnHelp.setIcon(new ImageIcon(MainView_old.class.getResource("/res/icon_info.png")));
                                        jMenuBar1.add(mnHelp);
                                        
                                        JMenu mnHelp_1 = new JMenu("Help");
                                        mnHelp.add(mnHelp_1);
                                        
                                        JMenuItem mntmNewMenuItem = new JMenuItem("Manual");
                                        mnHelp_1.add(mntmNewMenuItem);
                                        
                                        JMenuItem mntmDeveloperDocs = new JMenuItem("Developer Docs");
                                        mnHelp_1.add(mntmDeveloperDocs);
                                        
                                        JMenuItem mntmInfo = new JMenuItem("Info");
                                        mnHelp.add(mntmInfo);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(pnl_body, GroupLayout.PREFERRED_SIZE, 834, Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(pnl_body, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private javax.swing.JFrame columnEditor;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu menu_pushToLive;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private JMenuItem jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu menu_exportTo;
    private javax.swing.JMenu jMenu6;
    private JMenuItem jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mItem_userProfile;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private JCheckBoxMenuItem jMenuItem14;
    private javax.swing.JMenuItem mItem_exit;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem mItem_search;
    private javax.swing.JMenuItem mItem_settings;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel pnl_toolBar;
    private javax.swing.JPanel pnl_btnBar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane scrPn_transTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tbl_trans;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JFrame rowEditor;
    private JTextField textField;
    private JPanel pnl_transTable;
    private JPanel panel;
    private JMenu mnAdmin;
    private JMenuItem mntmItemCategories;
}
