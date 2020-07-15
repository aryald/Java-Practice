package datatypespractice;

public class ConditionalStatements3 {

	public static void main(String[] args) {

		int mark =90;
		if(mark <50) {
			System.out.println("Print Results is Fail");
			
		}
		else if(mark>=50 && mark<60) {
			System.out.println("Print Results is 'JustPass'");
		}
		else if(mark>=60 && mark<70) {
			System.out.println("Prnt  Results is Grade 'C'");
			
		}
		else if(mark >=70 && mark<80) {
			System.out.println("Print reslts is Grade 'B'");
		}
		else if(mark >=80 && mark<90) {
			
			System.out.println("Print reslts is Grade 'A'");
		}
		else if(mark>=90 && mark<=100) {
			
			System.out.println("Print reslts is Grade 'A Plus'");
		}
		else {
			
			System.out.println("Print reslts is Grade 'Invalid Results'");
		}
	}

}
