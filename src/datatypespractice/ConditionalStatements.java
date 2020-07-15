package datatypespractice;

public class ConditionalStatements {

	public static void main(String[] args) {
 
 int marks = 10;
 
 if (marks<50 ) {
	 
	 System.out.println("Print Results is Fail");
 }
 else if (marks>=50 && marks<60) {
	 
	 System.out.println("print Results is  Grade = D");
 }
 else if (marks >=60 && marks<70) {
	 
	 System.out.println("Print Reults is Grade = C");
 }
 else if (marks>=70 && marks<80) {
	 System.out.println("Print results is Grade = B");
 }
 else if (marks>=80 && marks <90) {
	 System.out.println("Print results is A");
 }
 else if (marks >=90 && marks<=99) {
	 
	 System.out.println("Print results is = excelent");
 }
 else 
 {
	 System.out.println("Results is invalid");
 }
	 
 }
	}
	



