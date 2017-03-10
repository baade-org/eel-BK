package org.baade.eel.core.annulus;

import java.util.Collection;

/**
 * 环形空间
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public interface IAnnulusSpace {

	public void put(IRealNode realNode);
	
	public void putAll(Collection<IRealNode> realNodes);
	
	public void remove(IRealNode realNode);
	
	public void removeAll(Collection<IRealNode> realNodes);
	
}
