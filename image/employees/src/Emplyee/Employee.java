package Emplyee;

// Ա����
public class Employee {
	private String name;
	private int age;
	private char sex;
	public Employee() {
	}
  public Employee(String name, int age, char sex) { // ���췽��
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
	public String toString() { // ��ʾ����
		return "Ա��������" + this.name + ",���䣺" + this.age + ",�Ա�" + this.sex;
	}
}
//����Ա�̳� Ա��
class admin extends Employee {
	private String position; // ְ��
	private float salary; // ��н
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
		return super.toString() + ",����Աְ��" + this.position + ",��н��"
				+ this.salary;
	}
}

