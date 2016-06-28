package tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		
	// create our window	
	JFrame window = new JFrame();   // window variable that holds JFram objects, and we're 
								    // creating a new JFrame to assign to our variable
	window.setSize(800, 600);       // we're calling methods on our JFram object to configure it
	window.setTitle("My Window");
	window.setVisible(true);
		
	JLabel label = new JLabel();    // label variable holds JLabel objects, and we're
									// creating a new JLabel to assign to our variable
	label.setText("My Label");		// we're calling the setText method on our JLabel to set
									// its text property
	
	window.add(label);				// we're calling the add method of our JFrame object to add 
									// our label to the window
	}

}
