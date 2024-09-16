package apple.iphone.service.browser;

public class Safari implements InternetBrowser{

	@Override
	public void addNewPage() {
		System.out.println("Adding a new page via Safari");
	}

	@Override
	public void refreshPage() {
		System.out.println("Refreshing page via Safari");
	}

	@Override
	public void closePage() {
		System.out.println("Closing page via Safari");
	}

	@Override
	public void loadPage() {
		System.out.println("Loading page via Safari");
	}

	@Override
	public void clearCache() {
		System.out.println("Clearing page's cache via Safari");
	}

}
