package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke ", 43, 1);

		Member[] members = { member1, member2 };

		System.out.println("--SHOWALL MEMBERS--");
		MemberManager.showAllMembers(members);
		//TODO ここから実装する

	}
}
