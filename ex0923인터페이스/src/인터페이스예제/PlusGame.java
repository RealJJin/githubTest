package �������̽�����;

import java.util.Random;

public class PlusGame implements IGame {
	
	private Random ran;
	private int num1;
	private int num2;
	
	@Override
	public void makeRandom() {
		// ���� ���� ���
		ran = new Random();
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
		
	}

	@Override
	public String getQuizMsg() {
		// ������ ������ ���ڿ� ���·� �ǵ��� �ֱ�
		// ����1 + ����2 = 
		return num1 +" + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		// �Ű������� �޾ƿ� ���ڿ� ���� ����1 + ����2 ��ġ
		// ����üũ�ϴ� ���

		return num1+num2 == answer;
		// �񱳿����ڴ� ��������� boolean ������
		// if�� �� �ʿ� ����
	}

	
	
	
	
	
	
	
	
	
	
}
