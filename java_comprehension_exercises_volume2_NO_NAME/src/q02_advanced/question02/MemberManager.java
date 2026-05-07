package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member mem : members) {
			mem.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean found = false;
		for (Member mem : members) {
			if (mem.getId() == targetId) {
				mem.setPassword(newPassword);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
