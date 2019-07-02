package monitor;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class InfoHTML {
	URLConnection connection = null;
	String content = null;
	int indexOf;

	public String getDownloadNumb(String HTML) {
		try {
			connection =  new URL(HTML).openConnection();
			Scanner scanner = new Scanner(connection.getInputStream());
			scanner.useDelimiter("\\Z");
			content = scanner.next();
			scanner.close();
		}catch ( Exception ex ) {
			return "�� ������� ����� ���-��������";
		}
		try {
			indexOf = content.indexOf("раз");
			return (content.substring(indexOf - 3, indexOf));
		}
		catch (Exception e) {
			return "���-�� ����� �� ���";
		}
	}

}
