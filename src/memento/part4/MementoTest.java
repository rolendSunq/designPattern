package memento.part4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MementoTest {
	Memento memento;
	
	@Test
	public void test() {
		memento = new Memento(100);
		memento.fruits.add("�ڵ�");
		memento.fruits.add("����");
		memento.fruits.add("���");
		memento.fruits.add("����");
		
		memento.delFruit("����");
		int lastIndex = memento.fruits.lastIndexOf("���");
		assertEquals("���", memento.fruits.get(lastIndex));
		
		memento.moneyAdjustment(50, EnumCommand.MINUS);
		assertEquals(50, memento.money);
	}

}
