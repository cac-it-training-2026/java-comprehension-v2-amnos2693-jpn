package q01_basic.question04;

class MemberManager {
	public static void showAllMembers(Member[] members) {

		for (Member mem : members) {
			mem.showMember();
		}
	}

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する

}
