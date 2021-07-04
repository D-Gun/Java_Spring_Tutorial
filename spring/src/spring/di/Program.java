package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//ui�κ� ����
import spring.di.ui.ExamConsole; // ExamConsole �������̽� ���
import spring.di.ui.GridExamConsole; // ExamConsole �������̽��� implements�ϴ� GridExamConsole class�� �����ϰ� interface�� method overriding �Ͽ� method��ü ����

public class Program {

	public static void main(String[] args) {

//		Exam exam = new NewlecExam(); // Exam �������̽��� �̿��� ��ü�� �����Ѵ�.
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); //id�� ����ϸ� Object�������� �������� ������ casting�� �ʿ��ϴ�.
		ExamConsole console = context.getBean(ExamConsole.class); 
		
		console.print(); // ������ ��ü�� console�� print method�� ����
	}
}
