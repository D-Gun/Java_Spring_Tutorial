package spring.di.entity;

public class NewlecExam implements Exam { //Exam interface를 implements
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	//Exam interface의 method를 overriding으로 구현
	@Override
	public int total() {
		return kor + eng + math + com;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
}
