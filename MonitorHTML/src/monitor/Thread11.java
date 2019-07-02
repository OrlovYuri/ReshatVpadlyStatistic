package monitor;

public class Thread11 extends Thread {
	InfoHTML html = new InfoHTML();
	int a, sum;
	String part2 = "-variant/";
	MainWindow mw  = new MainWindow();
	int n = 10;
	
	public void run() {
		
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
