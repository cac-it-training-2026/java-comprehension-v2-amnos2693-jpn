package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member1 = new Member();

		member1.name = "Miura Manabu";
		member1.age = 24;
		member1.rank = 1;

		Member member2 = new Member();

		member2.name = "Sato Kensuke";
		member2.age = 36;
		member2.rank = 2;

		member1.showMember();

		member1.rankUp();
		member1.showRank();

		//TODO ここから実装する

	}
}
