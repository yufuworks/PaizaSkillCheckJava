import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class EvolutionMonstersTest {
	private StandardInputStream in = new StandardInputStream();
	private StandardOutputStream out = new StandardOutputStream();
	
	@Before
	public void before() {
		System.setIn(in);
		System.setOut(out);
	}
	
	@After
	public void after() {
		System.setIn(null);
		System.setOut(null);
	}
	
	@Test
	void 進化候補が１つで現在のステータスが条件を満たしている場合そのモンスター名が返される() {
		in.inputln("2 3 4");
		in.inputln("1");
		in.inputln("testMonster");
		in.inputln("1 4 2 5 3 6");
		EvolutionMonsters.main(null);
		assertThat(out.readLine(), is("testMonster"));
	}

}
