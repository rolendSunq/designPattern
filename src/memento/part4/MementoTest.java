package memento.part4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MementoTest {
	Memento memento;
	
	@Test
	public void test() {
		memento = new Memento(100);
		memento.fruits.add("자두");
		memento.fruits.add("딸기");
		memento.fruits.add("사과");
		memento.fruits.add("수박");
		
		memento.delFruit("수박");
		int lastIndex = memento.fruits.lastIndexOf("사과");
		assertEquals("사과", memento.fruits.get(lastIndex));
		
		memento.moneyAdjustment(50, EnumCommand.MINUS);
		assertEquals(50, memento.money);
	}

}
