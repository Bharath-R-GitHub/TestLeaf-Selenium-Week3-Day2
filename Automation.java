package week3.day2.assignments;

public class Automation extends MultipleLangauge {

	public void selenium() {
		System.out.println("Selenium method has been Executed");
	}

	public void java() {
		System.out.println("Java method has been Executed");
	}

	public void ruby() {
		System.out.println("Ruby method has been Executed");
	}

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.java();
		automation.selenium();
		automation.python();
		automation.ruby();
	}
}
