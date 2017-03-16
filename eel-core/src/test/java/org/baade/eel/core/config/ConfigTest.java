package org.baade.eel.core.config;

import org.baade.eel.core.conf.Config;
import org.junit.Test;

public class ConfigTest {

	@Test
	public void testLoad() {
		Config config = Config.loadDefault();
		System.out.println(config);
	}

}
