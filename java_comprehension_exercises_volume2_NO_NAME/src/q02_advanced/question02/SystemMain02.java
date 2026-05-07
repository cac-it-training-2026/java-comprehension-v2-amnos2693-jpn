package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;

public class SystemMain02 {

	public static void main(String[] args) {
		ConsoleReader cr = new ConsoleReader();
		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);

		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		// ArrayList生成
		ArrayList<Member> members = new ArrayList<Member>();

		members.add(member1);
		members.add(member2);

		// 会員情報表示
		System.out.println("===会員情報を表示します===");

		MemberManager.showAllMembers(members);

		// パスワード変更
		System.out.println("===パスワードを変更します===");

		int targetId = 0;
		String newPassword = null;

		try {

			// ID入力
			targetId = cr.inputNum("input target id>>");

			// パスワード入力
			newPassword = cr.inputString(
					"input new password>>");

		} catch (IOException e) {

			e.printStackTrace();
			return;

		} catch (NumberFormatException e) {

			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		// パスワード更新
		MemberManager.updatePassword(
				members,
				targetId,
				newPassword);

		// 再表示
		System.out.println("---SHOW DATA---");

		MemberManager.showAllMembers(members);
	}

	//TODO ここから実装する

}
