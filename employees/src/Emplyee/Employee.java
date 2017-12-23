package Emplyee;

// 员工类
public class Employee {
	private String name;
	private int age;
	private char sex;
	public Employee() {
	}
  public Employee(String name, int age, char sex) { // 构造方法
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getSex() {
		return sex;
	}
	public String toString() { // 显示数据
		return "员工姓名：" + this.name + ",年龄：" + this.age + ",性别：" + this.sex;
	}
}
//管理员继承 员工
class admin extends Employee {
	private String position; // 职务
	private float salary; // 年薪
	public admin() {
	}
	public admin(String name, int age, char sex, String pos, float sal) {
		super(name, age, sex);
		this.position = pos;
		this.salary = sal;
	}
	public void setPosition(String pos) {
		this.position = pos;
	}
	public String getPosition() {
		return position;
	}
	public void setSalary(float sal) {
		this.salary = sal;
	}
	public float getSalary() {
		return salary;
	}
	public String toString() {
		return super.toString() + ",管理员职务：" + this.position + ",年薪："
				+ this.salary;
	}
}

