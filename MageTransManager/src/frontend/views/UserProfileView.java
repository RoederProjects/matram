package frontend.views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import core.entities.bricks.User;
import frontend.handler.UserProfileHandler;

import java.awt.Color;
import java.awt.Font;

public class UserProfileView extends JFrame {

	private JPanel contentPane;
	public JLabel lbl_userName;
	private JLabel lbl_userGroup;
	private JLabel lbl_userTeam;
	private JLabel lblUserIcon;

	public UserProfileView() {
		setTitle("User Profile");
		
		/**
		 * Create the frame.
		 */
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 412, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
		);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 386, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 317, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lbl_userNameLabel = new JLabel("User");
		
		lbl_userName = new JLabel("admin");
		lbl_userName.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_userGroupLabel = new JLabel("UserGroup");
		
		lbl_userGroup = new JLabel("<<Usergroup>>");
		lbl_userGroup.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_userTeamLabel = new JLabel("Team");
		
		lbl_userTeam = new JLabel("<<Team>>");
		lbl_userTeam.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_userNameLabel)
						.addComponent(lbl_userName)
						.addComponent(lbl_userGroupLabel)
						.addComponent(lbl_userGroup)
						.addComponent(lbl_userTeamLabel)
						.addComponent(lbl_userTeam))
					.addContainerGap(129, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_userNameLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_userName)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbl_userGroupLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_userGroup)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbl_userTeamLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_userTeam))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		lblUserIcon = new JLabel("User Icon");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblUserIcon, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblUserIcon, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
