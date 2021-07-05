package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
//ui부분 형성
import spring.di.ui.ExamConsole; // ExamConsole 인터페이스 사용
import spring.di.ui.GridExamConsole; // ExamConsole 인터페이스를 implements하는 GridExamConsole class를 생성하고 interface의 method overriding 하여 method실체 구현

public class Program {

	public static void main(String[] args) {

//		Exam exam = new NewlecExam(); // Exam 인터페이스를 이용해 객체를 생성한다.
		
		//xml로 클래스를 호출하기 위한 작업. IoC컨테이너 사용
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); //id를 사용하면 Object형식으로 가져오기 때문에 casting이 필요하다.
		ExamConsole console = context.getBean(ExamConsole.class); //InliceExamConsole 클래스 호출, 자료형명으로 가지고 오기
		System.out.println(console.toString()); // ExamConsole 의 console 값 출력
		Exam exam = context.getBean(Exam.class); // NewlecExam클래스 호출
		System.out.println(exam.toString());
		console.print(); // 생성된 객체인 console의 print method에 접근
		
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
		for(Exam e : exams)
			System.out.println(e);
	}
}
