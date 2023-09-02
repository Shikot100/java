package calculation;

public class if_else_calculation {
	
public void calculation(double number, String subject) {
	if(number>=40 && number<60) {
		System.out.println(subject+" = D");
	}
	else if(number>=60 && number<70) {
		System.out.println(subject+" = C");
	}
	else if(number>=70 && number<80) {
		System.out.println(subject+" = B");
	}
	else if(number>=80 && number<90) {
		System.out.println(subject+" = A-");
	}
	else if(number>=90 && number<100) {
		System.out.println(subject+" = A");
	}
	else if(number>=0 && number<40) {
		System.out.println(subject+" = F");
	}
	else {
		System.out.println(subject+" Error");
	}
  }
}
