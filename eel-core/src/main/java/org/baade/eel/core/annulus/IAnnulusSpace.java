package org.baade.eel.core.annulus;

import java.util.Collection;

/**
 * 环形空间
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public interface IAnnulusSpace<T> {

	public void put(IRealNode<T> realNode);
	
	public void putAll(Collection<IRealNode<T>> realNodes);
	
	public void remove(IRealNode<T> realNode);
	
	public void removeAll(Collection<IRealNode<T>> realNodes);
	
}
