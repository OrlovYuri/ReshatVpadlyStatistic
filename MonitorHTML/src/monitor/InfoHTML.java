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
			return "Не удалось найти веб-страницу";
		}
		try {
			indexOf = content.indexOf("СЂР°Р·");
			return (content.substring(indexOf - 3, indexOf));
		}
		catch (Exception e) {
			return "Что-то пошло не так";
		}
	}

}
