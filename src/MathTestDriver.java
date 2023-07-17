
public class MathTestDriver {

	public static void main(String[] args) {
		MathSingleton m1 = MathSingleton.getInstance();
		m1.setVariable1(15);
		m1.setVariable2(3);
		System.out.println(m1.add());
		//m1 = MathSingleton.getInstance();
		MathSingleton m2 = MathSingleton.getInstance();
		System.out.println(m1.equals(m2));
		m2.setVariable2(5);
		System.out.println(m1.add());		
	}

}
