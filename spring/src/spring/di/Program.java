package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//ui부분 형성
import spring.di.ui.ExamConsole; // ExamConsole 인터페이스 사용
import spring.di.ui.GridExamConsole; // ExamConsole 인터페이스를 implements하는 GridExamConsole class를 생성하고 interface의 method overriding 하여 method실체 구현

public class Program {

	public static void main(String[] args) {

//		Exam exam = new NewlecExam(); // Exam 인터페이스를 이용해 객체를 생성한다.
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); //id를 사용하면 Object형식으로 가져오기 때문에 casting이 필요하다.
		ExamConsole console = context.getBean(ExamConsole.class); 
		
		console.print(); // 생성된 객체인 console의 print method에 접근
	}
}
