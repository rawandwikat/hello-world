package calculatorhm;

public class CALC {

	public static void main(String[] args) {
		CalculatorhmModal m=new CalculatorhmModal();
		CalculatorhmViwe v=new CalculatorhmViwe();
		CalculatorhmController c=new CalculatorhmController(m,v);
	}

	}


