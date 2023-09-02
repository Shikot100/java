package calculation;

public class grade extends if_else_calculation{
	
   static double bangla =99;
   static double english =85;
   static double math =101;

	public static void main(String[] args) {
		grade obj = new grade();
		obj.calculation(bangla, "English");
		obj.calculation(english, "English");
		obj.calculation(math, "Math");
		System.out.println("Total avarage mark: "+CGPA());
		obj.calculation(CGPA(),"CGPA");
		grade.CGPA();
	}
	public static double CGPA() {
		double F = 0.00;
		if (bangla <40 || english <40 || math <40) {
			System.out.println("You have one or more subject");
			return F;
		}
		else if (bangla >100 || english >100 || math>100) {
			System.out.println("Faijlami paico? you fail");
			return F;
		}
		else {
			double totalAvgMark =(bangla + english + math)/3;
			return totalAvgMark;
		}
	}

}
