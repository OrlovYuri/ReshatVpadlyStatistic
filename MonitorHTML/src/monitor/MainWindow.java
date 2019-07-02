package monitor;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
/*
 * @autor Yuri Orlov
 * Программа дает статистику по скачиваниям вариантов с РешатьВпадлу
 */

public class MainWindow {
	static JLabel[] tems = new JLabel[16];
	static JProgressBar[] pb = new JProgressBar[16];
	static JLabel[] l = new JLabel[16];
	static String[] part1 = new String[16];
	

	public void MyMainWindow() {
		JFrame frame = new JFrame();
		frame.setSize(600,800); 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(32, 1));
		frame.setVisible(true);


		tems[0] = new JLabel("Матрицы");
		tems[1] = new JLabel("Комплексные числа");
		tems[2] = new JLabel("Векторы");
		tems[3] = new JLabel("Пределы");
		tems[4] = new JLabel("Производные");
		tems[5] = new JLabel("Неопр. интегралы");
		tems[6] = new JLabel("Анал. геометрия");
		tems[7] = new JLabel("ФНП");
		tems[8] = new JLabel("Опр. интегралы");
		tems[9] = new JLabel("Диф. уравнения");
		tems[10] = new JLabel("Числовые ряды");
		tems[11] = new JLabel("Функциональные ряды");
		tems[12] = new JLabel("Опер. исчисление");
		tems[13] = new JLabel("Кратные интегралы");
		tems[14] = new JLabel("Криволин. интегралы");
		tems[15] = new JLabel("Случайные события");
		
		part1[0] = "http://reshatvpadly.ru/products/matricy-opredeliteli-sistemy-";
		part1[1] = "http://reshatvpadly.ru/products/kompleksnye-chisla-";
		part1[2] = "http://reshatvpadly.ru/products/vektornaya-algebra-";
		part1[3] = "http://reshatvpadly.ru/products/predely-";
		part1[4] = "http://reshatvpadly.ru/products/proizvodnaya-i-differencial-";
		part1[5] = "http://reshatvpadly.ru/products/neopredelennye-integraly-";
		part1[6] = "http://reshatvpadly.ru/products/analiticheskaya-geometriya-";
		part1[7] = "http://reshatvpadly.ru/products/funkcii-neskolkix-peremennyx-";

		part1[8] = "http://reshatvpadly.ru/products/opredelyonnye-integraly-";
		part1[9] = "http://reshatvpadly.ru/products/differencialnye-uravneniya-";
		part1[10] = "http://reshatvpadly.ru/products/chislovye-ryady-";
		part1[11] = "http://reshatvpadly.ru/products/funkcionalnye-ryady-";
		part1[12] = "http://reshatvpadly.ru/products/operacionnoe-ischislenie-";
		part1[13] = "http://reshatvpadly.ru/products/kratnye-integraly-";
		part1[14] = "http://reshatvpadly.ru/products/krivolinejnye-integraly-";
		part1[15] = "http://reshatvpadly.ru/products/sluchajnye-sobytiya-";

		

		for(int i = 0; i < 16; i++) {
			tems[i].setFont(new Font(Font.DIALOG,Font.BOLD,18));
			tems[i].setHorizontalAlignment(SwingConstants.CENTER);
			frame.add(tems[i]);
			pb[i] = new JProgressBar();
			pb[i].setMinimum(0);
			pb[i].setMaximum(30);
			frame.add(pb[i]);
		}
		
		//for(int i = 0; i < 16; i++) {

			//pb.setString("Смотрю " + tems[i].getText());
			//pb.setStringPainted(true);
			//pb.setFont(new Font(Font.DIALOG,Font.BOLD,24));
			//countDownloads(i);
			//l[i] = new JLabel(i + ")");
			//l[i].setForeground(Color.black);

		//}




	}

	public void countDownloads(int j) {
		InfoHTML html = new InfoHTML();
		
		
		String part2 = "-variant/";
		int a, sum;
		sum = 0;
		for (int i = 1; i < 31; i++) {
			try {
				a = Integer.parseInt(html.getDownloadNumb(part1[j] + i + part2).replaceAll("\\s", ""));
				System.out.println(i + ") " + a);
				sum += a;
			}
			catch (Exception e) {
				System.out.println("Not possible to parse it");
			}
			finally {
				pb[j].setValue(i);
			}
		}
		System.out.println("Total loads: " + sum);
		tems[j].setText(tems[j].getText() + ": " + sum + " вариантов");
	}

}
