package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
//ui�κ� ����
import spring.di.ui.ExamConsole; // ExamConsole �������̽� ���
import spring.di.ui.GridExamConsole; // ExamConsole �������̽��� implements�ϴ� GridExamConsole class�� �����ϰ� interface�� method overriding �Ͽ� method��ü ����

public class Program {

	public static void main(String[] args) {

//		Exam exam = new NewlecExam(); // Exam �������̽��� �̿��� ��ü�� �����Ѵ�.
		
		//xml�� Ŭ������ ȣ���ϱ� ���� �۾�. IoC�����̳� ���
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); //id�� ����ϸ� Object�������� �������� ������ casting�� �ʿ��ϴ�.
		ExamConsole console = context.getBean(ExamConsole.class); //InliceExamConsole Ŭ���� ȣ��, �ڷ��������� ������ ����
		System.out.println(console.toString()); // ExamConsole �� console �� ���
		Exam exam = context.getBean(Exam.class); // NewlecExamŬ���� ȣ��
		System.out.println(exam.toString());
		console.print(); // ������ ��ü�� console�� print method�� ����
		
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
		for(Exam e : exams)
			System.out.println(e);
	}
}
