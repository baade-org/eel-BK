package org.baade.eel.core.annulus;

import java.util.Collection;

public interface IRealNode<T> {

	
	public Collection<IVirtualNode<T>> getVirtualNodes();
}
