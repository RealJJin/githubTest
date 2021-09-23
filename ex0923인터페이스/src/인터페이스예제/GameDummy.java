package 인터페이스예제;

public class GameDummy implements IGame{

	@Override
	public void makeRandom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getQuizMsg() {
		// TODO Auto-generated method stub
		return "4+4=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if(answer==8) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
}
