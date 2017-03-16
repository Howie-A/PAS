package pas3.views;

import javax.swing.JApplet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import pas3.common.Question;

import javax.swing.JProgressBar;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PAS3Gui extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblInitialQuestions;
	private JButton btnNext;
	private JButton btnPrevious;
	private JProgressBar progressBar;
	private JButton btnBegin;

	/**
	 * Create the applet.
	 */
	public PAS3Gui() {
		//fjfjfjajf
		initComponents();
		createEvents();
		

	}

	private void initComponents() {
		// TODO Auto-generated method stub
		lblInitialQuestions = new JLabel("Initial Questions");
		btnNext = new JButton("Next");
		
		btnPrevious = new JButton("Previous");
		
		progressBar = new JProgressBar();
		
		btnBegin = new JButton("Begin");
	
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInitialQuestions)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnBegin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPrevious)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNext)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblInitialQuestions)
					.addPreferredGap(ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNext)
							.addComponent(btnPrevious)
							.addComponent(btnBegin))))
		);
		getContentPane().setLayout(groupLayout);
	}

	private void createEvents() {
		QuestionLayout();
		btnBegin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 
				
			}
		});
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent evt) {
        this.rootPane.add(new JButton("Button"));
        this.rootPane.revalidate();
        validate();
    }
	private void QuestionLayout(){
		Question q = new Question();
		q.setQuestion("ldfkjjlkajf");;
		int numQuestions = q.getAnswers().size();
		for(int i = 0; i < numQuestions; i++){
			CreateButton();
		}
		
		
		
	}
	private void CreateButton(){
		this.rootPane.add(new JButton("Button"));
		revalidate();
		repaint();
	}
	
}
