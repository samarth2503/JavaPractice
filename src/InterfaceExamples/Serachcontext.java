/* Why interface doesnt require constructor ??? 
 * 
 * 	By default every variable present in interface is public static final.
 *  static  doesnt require object creation
 * 	Hence there is not need for Constructor
 */



package InterfaceExamples;

interface Serachcontext {
	
	public void findElement();
	
	public void findElements();

}

interface WebDriver extends Serachcontext
{
	public default void findElement()
	{
		System.out.println("FindElement Method");
	}
	
	default void findElements()
	{
		System.out.println("FindElements Method");
	}
	
	public String get();
	
	public void Quit();
	
	public void close();
	
}


