package javagame.game;

public class Tiger extends Monster{

	public Tiger() {
		super("호랑이", 500, 50);
	}
	
	
	
	@Override
	public void MonsterDie() {
		this.setMonsterLive(false);
		System.out.println("호랑이를 해치웠습니다.");
	}
}
