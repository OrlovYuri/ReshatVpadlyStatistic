package monitor;


import javax.swing.UIManager;



public class MonitorHTML {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ThreadControl tc = new ThreadControl();
		
	}

}
