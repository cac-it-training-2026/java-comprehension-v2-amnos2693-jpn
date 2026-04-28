package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	public String name;
	public int age;
	public int rank;

	public Member() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}
