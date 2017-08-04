class Resource implements AutoCloseable{

	@Override
	public void close() throws Exception {		
		System.out.println(" This is from the close method");
	}
	
}

/**
 * Testing "Try with resources"
 *  
 * The resource's close method will be invoked even if the contents of {}
 * throw an exception.
 *  
 * @author Ramanan
 *
 */
public class TryWithResourcesTester {
	
	public static void main(String[] args) throws Exception{
		
		try(Resource resource = new Resource();){
			System.out.println(" This is from the main method");
			throw new Exception();
		}
		
	}

}
