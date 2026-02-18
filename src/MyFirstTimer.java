import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import javax.swing.Timer;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes;
	private Timer t;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		
		numTimes = 0;
		t = new Timer(1000, this);
		t.setInitialDelay(3000);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // [cite: 63]
		numTimes++;
		myLabel.setLabel("times called? " + numTimes);
		myLabel.move(5, 0);
		
		if (numTimes == 10) { 
			t.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}