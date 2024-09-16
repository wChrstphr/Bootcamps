package apple.iphone.service.map;

public class Maps implements MapService {

	@Override
	public void searchLocation() {
		System.out.println("Searching location via Maps");
	}

	@Override
	public void showLocation() {
		System.out.println("Showing location via Maps");
	}

	
}
