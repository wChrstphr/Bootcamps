package apple.iphone.service.phone;

public class Phone implements TelephoneDevide {

	@Override
	public void addContact() {
		System.out.println("Adding contacts via Phone");
	}

	@Override
	public void favoriteContact() {
		System.out.println("Adding to favorite contacts via Phone");
	}

	@Override
	public void deleteContact() {
		System.out.println("Deleting contacts via Phone");
	}

	@Override
	public void answerCall() {
		System.out.println("Answering call via Phone");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Hanging up via Phone");
	}

	@Override
	public void mergeCalls() {
		System.out.println("Merging call via Phone");
	}

	@Override
	public void call() {
		System.out.println("Calling via Phone");
	}

	@Override
	public void startVoideMail() {
		System.out.println("Starting a new voice mail via Phone");
	}

}
