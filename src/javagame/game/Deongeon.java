package javagame.game;

import java.util.Scanner;

public class Deongeon {

	boolean Gomain;
	
	Monster monster;
	
	public Deongeon() {}
	
	public void battle(GameUser user) {
		System.out.println("던전에 입장했습니다.");
		System.out.println("===================");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 토끼 사냥\n2. 호랑이 사냥\n3. 곰사냥\n4. 독수리사냥 \n5. 용 사냥(권장 레벨 : 100이상)\n6. 화염용 사냥(권장 레벨 : 150이상)\n7. 메인메뉴 이동");
			System.out.print("사냥하실 몬스터를 선택하세요 : ");
			int sm = sc.nextInt();
			
			switch(sm) {
			case 1 : System.out.println("토끼를 사냥합니다.");
			monster = new Rabbit();
			break;
			case 2 : System.out.println("호랑이를 사냥합니다." );
			monster = new Tiger();
			break;
			case 3 : System.out.println("곰을 사냥합니다.");
			monster = new Bear();
			break;
			case 4 : System.out.println("독수리를 사냥합니다.");
			monster = new Eagle();
			break;
			case 5 : System.out.println("용을 사냥합니다.");
			monster = new Dragon();
			break;
			case 6 : System.out.println("화염용을 사냥합니다. 힘든 싸움이 될 것 같습니다.");
			monster = new FireDragon();
			break;
			case 7 : System.out.println("메인메뉴로 이동");
			Gomain = true;
			} 
			
			if(Gomain) {
				break;
			}
			
			int monsterhp = monster.getMonsterHp();
			for(int i = monster.getMonsterHp(); i > 0; i -= user.getUserAD()) {
				System.out.println(monster.getMonsterName() + "을 공격했습니다.");
				monsterhp -= user.getUserAD();
				if(monsterhp <= 0)
					break;
				System.out.println("남은체력" + monsterhp);
			}
			
			System.out.println(monster.getMonsterName() + "를 잡았습니다. 경험치를" + monster.getMonsterExp() + " 만큼 획득했습니다.");
			user.setUserExp(user.getUserExp() + monster.getMonsterExp());
			user.LevelUp();
		}
		
		
		
	}
	
}
