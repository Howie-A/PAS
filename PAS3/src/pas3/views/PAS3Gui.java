package pas3.views;

import javax.swing.JApplet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class PAS3Gui extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the applet.
	 */
	public PAS3Gui() {
		
		JLabel lblInitialQuestions = new JLabel("Initial Questions");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblInitialQuestions)
					.addContainerGap(389, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblInitialQuestions)
					.addContainerGap(284, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
