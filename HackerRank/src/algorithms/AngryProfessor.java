package algorithms;
/**
 * 
 * @author Siddiq Ahmed Syed
 *
 */
public class AngryProfessor { 
public static void main(String[] args) {
	int [] students={-1 ,-3, 4, 2};
	isClassCancelled(students,3);
}

private static void isClassCancelled(int[] students, int threshold) {
	int countOfStudents=0;
	for(int i=0;i<students.length;i++){
		if(students[i]<=0){
			countOfStudents++;
		}
	}
	if(countOfStudents>=threshold){
		System.out.println("No");
	}
	else{
		System.out.println("Yes");
	}
	
}
}
