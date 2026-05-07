package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			inputId = cr.inputNumber();
			inputPassword = cr.inputString();

			Member member = new Member(inputId, inputPassword, name, age, rank);

			System.out.println("---SHOW MEMBER--- ");
			member.showMember();

		} catch (NumberFormatException | IOException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}
	//TODO ここから実装する

}
