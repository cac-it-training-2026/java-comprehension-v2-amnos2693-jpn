package q02_advanced.question03;

import java.util.List;

import q02_advanced.question02.Member;

public class MemberManager {
	private MemberManager() {
	}

	public void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public void updatePassword(List<Member> members, int targetId, String newPassword) {
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
