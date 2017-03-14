package org.baade.eel.core.xml;

import org.baade.eel.core.utils.XMLUtils;
import org.junit.Before;
import org.junit.Test;

public class XMLUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testObj2XMLStr() {
		Human human = new Human(1, "xiaoming", "man");
		String humanStr = XMLUtils.obj2XMLStr(human);
		System.out.println(humanStr);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testObj2XMLFile() {
		Human human = new Human(1, "xiaoming", "man");
		XMLUtils.obj2XMLFile(human, "d:/human.xml");
//		fail("Not yet implemented");
	}


}
