package q02_advanced.question02;

import java.util.ArrayList;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private ArrayList<Coupon> coupons;

	public Member(int id, String password, String name, int age, int rank) {
		this();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<Coupon>();
	}

	public Member() {
	}

	public static Member getInstance(int id, String password, String name, int age, int rank) {

		Member mem = new Member(id, password, name, age, rank);

		Coupon coupon1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon coupon2 = Coupon.getInstance(2, 0.25, "今月の特典");

		ArrayList<Coupon> couponLIst = new ArrayList<Coupon>();
		couponLIst.add(coupon1);
		couponLIst.add(coupon2);

		mem.setCoupons(couponLIst);

		return mem;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ "coupons" + coupons + "]";
	}

	public void showMember() {
		System.out.println(this.toString());
		System.out.println("**************************");

	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public ArrayList<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(ArrayList<Coupon> coupons) {
		this.coupons = coupons;
	}

}
