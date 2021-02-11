import java.util.*;

public class EvolutionMonsters {

	public static void main(String[] args) {
		
		int evoCount = 0;

		try (Scanner sc = new java.util.Scanner(System.in)) {
			int atk = sc.nextInt();
			int def = sc.nextInt();
			int agi = sc.nextInt();
			int n = sc.nextInt();
			
			for (int i=0; i<n; i++) {
				String s_i = sc.next();
				int minatk = sc.nextInt();
				int maxatk = sc.nextInt();
				int mindef = sc.nextInt();
				int maxdef = sc.nextInt();
				int minagi = sc.nextInt();
				int maxagi = sc.nextInt();
				if ((atk >= minatk) 
					&& (atk <= maxatk)
					&& (def >= mindef)
					&& (def <= maxdef)
					&& (agi >= minagi)
					&& (agi <= maxagi)) {
					System.out.println(s_i);
					evoCount += 1;
				}
			}
			if (evoCount == 0) {
				System.out.println("no evolution");
			}
		}catch (Exception e) {
			System.out.println("半角数字で現在のステータス atk def agi を入力してください");
			System.out.println("進化したモンスターの名前をを入力してください");
			System.out.println("半角数字で進化条件 minatk maxatk mindef maxdef minagi maxagi を入力してください");
			e.printStackTrace();
		}
	}
}
