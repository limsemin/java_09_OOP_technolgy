package step9_02.OOP_Theory;

/*

# 메서드 오버라이딩 ( Method Overriding )

- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
- 메서드 오버로딩과 혼용되기 쉽다.

*/


class Warrior2 extends Character{
	
	
	void levelUp() {//메서드 오버라이딩(메서드 재정의)
		this.level	++;
		this.power 	+= 1000;
		this.dex	+= 100;
		this.life	+= 100;
		this.mana	+= 5;
	}
	void dash() {	//Warrior2 클래스만의 메서드 추가
		System.out.println("# dash!");
	}
}

class Wizard2 extends Character{//메서드 오버라이딩(메서드 재정의)
	
	void levelUp() {
		this.level++;
		this.power	+= 10;
		this.dex	+= 10;
		this.life	+= 10; 
		this.mana	+= 2000;
	
	}
	void fireball() {	//Wizard2 클래스만의 메서드 추가
		System.out.println("#fireBall!");
	}
}


public class OOPEx03 {

	public static void main(String[] args) {

		Warrior2 war2 = new Warrior2();
		war2.showStatus();
		war2.levelUp();
		war2.levelUp();
		war2.showStatus();
		war2.dash();
		
		System.out.println("=====================");
			
		Wizard2 Wiz2 = new Wizard2();
		Wiz2.showStatus();
		Wiz2.levelUp();
		Wiz2.levelUp();
		Wiz2.showStatus();
		Wiz2.fireball();
	}

}
