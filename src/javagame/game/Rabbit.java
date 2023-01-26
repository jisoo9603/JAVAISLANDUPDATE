package javagame.game;

public class Rabbit extends Monster {
	
	public Rabbit() {
		super("토끼", 2000, 20);
		
	}
	
	
	
	@Override
	public void MonsterDie() {
		this.setMonsterLive(false);
		System.out.println("토끼를 해치웠습니다.");
	}
}