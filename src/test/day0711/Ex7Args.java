package test.day0711;

public class Ex7Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  args: 강호동 182.5 98.7
		 *  이름:강호동
		 *  키:182.5cm
		 *  몸무게:98.7kg
		 *  권장몸무게:(키-100)*0.9:74.25kg
		 *  똑같이 println 이랑 printf로 출력
		 */
		
		String name=args[0];
		double height=Double.parseDouble(args[1]);
		double weight=Double.parseDouble(args[2]);
		double rec=(height-100)*0.9;
		
		System.out.println("이름:"+name);
		System.out.println("키:"+height+"cm");
		System.out.println("몸무게:"+weight+"kg");
		System.out.println("권장 몸무게:"+rec+"kg");
		System.out.println("\n");
		System.out.printf("이름:%s\n키:%3.1fcm\n몸무게:%3.1fkg\n권장 몸무게:%3.2fkg\n",name,height,weight,rec);
		
	}

}
