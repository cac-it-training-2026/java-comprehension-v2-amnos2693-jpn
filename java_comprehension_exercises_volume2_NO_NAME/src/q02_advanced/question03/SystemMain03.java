package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		MemberStorage ms = new MemberStorage();

		LoginService loginService = new LoginService(ms);
		Member loginUser = null;

		System.out.println("ログイン情報を入力してください");

		while (loginUser == null) {
			int input = 0;
			String inputpassword = null;

			try {
				input = cr.inputNum("input id>>");
				inputpassword = cr.inputString("input password>>");
			} catch (Exception e) {
				System.out.println("不正な入力です。再度入力してください");
				e.printStackTrace();
				continue;
			}
			if (loginUser == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
			}
		}

		System.out.println("ログインに成功しました");
		System.out.println("ログインユーザー情報を表示します");
		System.out.println(loginUser);
		//TODO ここから実装する

	}

}
