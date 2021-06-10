package principal;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreePanelThree {
	private JPanel jpanel = new JPanel();
	private JTree treeOne;
	final String[][] toppings3 = { {"Thick Crust"}, {"Cheese", "Pepperoni", "Black Olives"}, {"Thin Crust"}, {"Ham and Pinapple","Chicken" } } ;
	
	public JTreePanelThree() {
		super();
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root"); 

		DefaultMutableTreeNode sub1 = new DefaultMutableTreeNode(new DefaultMutableTreeNode(toppings3[0][0])); 
		DefaultMutableTreeNode sub2 = new DefaultMutableTreeNode(new DefaultMutableTreeNode(toppings3[2][0])); 
		
		sub1.add( new DefaultMutableTreeNode(toppings3[1][0]) );
		sub1.add( new DefaultMutableTreeNode(toppings3[1][1]) );
		sub1.add( new DefaultMutableTreeNode(toppings3[1][2]) );

		sub2.add( new DefaultMutableTreeNode(toppings3[3][0]) );
		sub2.add( new DefaultMutableTreeNode(toppings3[3][1]) );
		
		root.add(sub1);
		root.add(sub2);
		
		treeOne = new JTree( root );
		treeOne.setRootVisible(false);
		treeOne.setShowsRootHandles(true);
		jpanel.add(treeOne);
	}

	public JPanel getJpanel() {
		return jpanel;
	}

	public JTree getTreeOne() {
		return treeOne;
	}

}
