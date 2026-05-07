package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader br;

	/**
	 * @param br
	 */
	public ConsoleReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String inputString(String message) throws IOException {
		System.out.println(message);
		return br.readLine();
	}

	public int inputNum(String message) throws IOException, NumberFormatException {
		System.out.println(message);
		return Integer.parseInt(br.readLine());
	}

}