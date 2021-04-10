package justDoIt;

public class Tutorial15_Teacher extends Tutorial15_Person {
	private String teacherID;
	private int monthSalaray;
	private int workedYear;
	
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalaray() {
		return monthSalaray;
	}
	public void setMonthSalaray(int monthSalary) {
		this.monthSalaray = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	public Tutorial15_Teacher(String name, int age, int height, int weight, String teacherID, int monthSalaray,
			int workedYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalaray = monthSalaray;
		this.workedYear = workedYear;
	}
	public void show() {
		System.out.println("-------------------------------");
		System.out.println("교사이름 : " + getName());
		System.out.println("교사나이 : " + getAge());
		System.out.println("교사키 : " + getHeight());
		System.out.println("교사몸무게 : " + getWeight());
		System.out.println("교사등록번호 : " + getTeacherID());
		System.out.println("교사월급 : " + getMonthSalaray());
		System.out.println("교사연차 : " + getWorkedYear());
	}
}
