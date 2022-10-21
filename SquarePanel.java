import java.awt.Color;
import javax.swing.JPanel;

import java.awt.Toolkit;

public class SquarePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public SquarePanel(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
Toolkit.getDefaultToolkit().sync();
		this.repaint();
	}
	
}

