package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member member1 = new Member();

		member1.name = "Miura Manabu";
		member1.age = 24;
		member1.rank = 1;

		Member member = new Member(null, 0, 0);

		member.showMember();

		member1.rankUp();
		member1.showMember();

		//TODO ここから実装する

	}
}
