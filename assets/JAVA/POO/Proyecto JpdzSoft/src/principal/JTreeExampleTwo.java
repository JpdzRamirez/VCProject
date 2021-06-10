package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import principal.JTreePanelThree;
import principal.PizzaPanel;

public class JTreeExampleTwo extends JFrame {

	public JTreeExampleTwo() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTree Basic Examples 2");
		setLayout(new BorderLayout());
		add(getSplitPane(), "Center");
	}

	private JSplitPane getSplitPane() {
		JTreePanelThree leftPane = getJTreeContainer();
		PizzaPanel rightPane = getRightPanelContainer();
		
		leftPane.getTreeOne().addTreeSelectionListener(rightPane);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPane.getJpanel(), rightPane.getPizzapanel() );
		return splitPane;
	}
	
	private JTreePanelThree getJTreeContainer() {
		JTreePanelThree mytree3 = new JTreePanelThree();
		return mytree3;
	}
	
	private PizzaPanel getRightPanelContainer() {
		return new PizzaPanel();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				JTreeExampleTwo app = new JTreeExampleTwo();
				app.setVisible(true);
				app.pack();
				
			}
		});

	}

	
	
}
