package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// GameDummy : �ӽ��׽�Ʈ��
		// GameDummy p1 = new GameDummy();
		PlusGame p1 = new PlusGame();
		
		// ���� Ƚ�� üũ
		// �����ȸ Ƚ�� üũ
		// ����ڷκ��� �� �Է�
		// �޽��� ���
		
		// Ƚ�� Ȯ������ ���� �����
		int gameCnt = 1;
				
		for (int i = 5; i > 0; i--) {
			p1.makeRandom();
			System.out.println("=== " + gameCnt + "��° ���� ===");
			String q = p1.getQuizMsg();
			int answerCnt = 3;
			for (int j = 3; j > 0; j--) {
				System.out.print(q);
				int userAnswer = sc.nextInt();
				if (p1.checkAnswer(userAnswer) == true) {
					System.out.println("�����Դϴ�!!");
					break;
				} else if (p1.checkAnswer(userAnswer) == false) {
					answerCnt--;
					if (answerCnt == 2) {
						System.out.println("** �ѹ� �� �����غ����� ���� ��ȸ " + answerCnt + "�� **");
					} else if (answerCnt == 1) {
						System.out.println("������ ��ȸ�Դϴ�.");
					}
				}

			}
			gameCnt++;

		}
		System.out.println("������ ����ƽ��ϴ�.");
		sc.close();
				
				
				
				

		
		
		
		
		
	}

}
