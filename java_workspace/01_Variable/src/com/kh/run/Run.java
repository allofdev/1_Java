package com.kh.run;
// import com.kh.variable.A_Variable;
// import com.kh.variable.B_Constant;
// import com.kh.variable.C_KeyboardInput;
// import com.kh.variable.D_Casting;
import com.kh.variable.*;

public class Run {     // com.kh.run.Run
	
	public static void main(String[] args) {
		
		// 1) 실행할 메소드가 있는 "클래스 생성(new)"하기!
		// [표현법] 클래스명 변수명 = new 클래스명();
		A_Variable a = new A_Variable();
						
		// 2) 메소드 호출
		//a.printValue();
		//a.declareVariable();
		//a.initVariable();
		
		B_Constant b = new B_Constant();
		//b.finalConstant();
		
		C_KeyboardInput c = new C_KeyboardInput();
		//c.inputScanner1();
		//c.inputScanner2();
		//c.inputScanner3();
		//c.inputScanner4();
		
		D_Casting d = new D_Casting();
		//d.casting1();
		//d.casting2();
		
		E_Overflow e = new E_Overflow();
		//e.overflow();
		
		F_Printf f = new F_Printf();
		f.printfMethod();
		
	}

}