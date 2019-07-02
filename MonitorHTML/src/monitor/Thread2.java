package monitor;

public class Thread2 extends Thread{
	InfoHTML html = new InfoHTML();
	int a, sum;
	String part2 = "-variant/";
	int n = 1;
	
	public void run() {
		MainWindow mw  = new MainWindow();
		sum = 0;
		for (int i = 1; i < 31; i++) {
			try {
				a = Integer.parseInt(html.getDownloadNumb(mw.part1[n] + i + part2).replaceAll("\\s", ""));
				//System.out.println(i + ") " + a);
				sum += a;
			}
			catch (Exception e) {
				System.out.println("Not possible to parse it");
			}
			finally {
				mw.pb[n].setValue(i);
			}
		}
		//System.out.println("Total loads: " + sum);
		mw.tems[n].setText(mw.tems[n].getText() + ": " + sum + " вариантов");
	}

}
