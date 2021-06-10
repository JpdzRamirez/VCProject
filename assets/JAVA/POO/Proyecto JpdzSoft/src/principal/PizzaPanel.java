package principal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class PizzaPanel implements TreeSelectionListener {
	
	private JPanel jpanel = new JPanel();
	private JLabel info;

	public PizzaPanel() {
		super();
		initialise();
	}

	private void initialise() {
		info = new JLabel("Selction shows here...");
		jpanel.add(info);
	}
	
	public JPanel getPizzapanel() {
		return jpanel;
	}

	@Override
	public void valueChanged(TreeSelectionEvent tsl) {
		if (tsl.getNewLeadSelectionPath() != null ) {
			info.setText(tsl.getNewLeadSelectionPath().getLastPathComponent().toString()); 
		}
	}

}
