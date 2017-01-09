/**
 * 
 */
package xyz.shanmugavel.creational.singleton;

/**
 * Sample program to explain singleton pattern without locks.
 * 
 * @author Shanmugavel
 *
 */
public class Main {

	/**
	 * Private constructor to prevent from external initialization.
	 */
	private Main() {
	}

	private static class LazyInit {
		public static final Main main = new Main();
	}
	
	/**
	 * Return lazily initialized main instance.
	 * 
	 * @return Main
	 */
	public static Main getInstance() {
		return LazyInit.main;
	}
}
