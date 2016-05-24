import java.util.Scanner;

class DayThirteen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
class Student extends Person{
	private int [] testScores;
	
	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores=testScores;
	}

	public String calculate() {
	   int sum=0;
	   for(int score:testScores){
         sum+=score;		   
	   }
	   int result=sum/testScores.length;
	   String grade=getGrade(result);
		return grade;
	}

	private String getGrade(int result) {
		String grade="T";
		if(result>=90&&result<=100){
			grade="O";
		}
		else if(result>=80&&result<90){
			grade="E";
		}
		else if(result>=70&&result<80){
			grade="A";
		}
		
		else if(result>=55&&result<70){
			grade="P";
		}
		else if(result>=40&&result<55){
			grade="D";
		}
		return grade;
	}

	
}
	




