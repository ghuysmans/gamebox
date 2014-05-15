package be.ac.umons.informatique.ba1.gamebox.core;

/**
 * Like the native Observer class...
 */
public interface SavedObserver {

	/**
	 * This method will be called by {@link SavedObservable#notifyObservers(Object)}
	 * @param g     The notifying {@link SavedObservable}
	 * @param param Transmitted object
	 */
	public void update(SavedObservable g, Object param);
	
}
