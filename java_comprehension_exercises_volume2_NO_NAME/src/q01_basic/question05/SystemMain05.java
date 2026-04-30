package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		NonMember nonmember = new NonMember("Sato Kensuke");

		nonmember.showMember();
		member.showMember();
		nonmember.buyItem();
		member.buyItem();

	}

}