package InterfaceExamples;

class RemoteWeb implements WebDriver
{

//	@Override
//	public void findElement() {
//		
//		System.out.println("Find Element method in RemoteWeb");
//	}
//
//	@Override
//	public void findElements() {
//		
//		System.out.println("Find Element method in RemoteWeb");
//		
//	}

	@Override
	public String get() {
		
		String a ="getText Method";
		return a;
	}

	@Override
	public void close() {
		
		System.out.println("Close method");
		
	}

	@Override
	public void Quit() {
		// TODO Auto-generated method stub
		System.out.println("Quit method");
	}
	
}