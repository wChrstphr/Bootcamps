package apple.iphone.service.browser;

public interface InternetBrowser {
	abstract void addNewPage();
	abstract void refreshPage();
	abstract void closePage();
	abstract void loadPage();
	abstract void clearCache();
}
