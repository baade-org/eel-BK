package org.baade.eel.core.server;

import org.baade.eel.core.ILifecycle;

public interface IServer extends ILifecycle {

	public void setPort(int port);
}
