package apple.iphone.service.email;

public class Email implements EmailService {

	@Override
	public void showEmail() {
		System.out.println("Showing Email via Email");
	}

	@Override
	public void createEmail() {
		System.out.println("Creating Email via Email");
	}

	@Override
	public void sendEmail() {
		System.out.println("Sending Email via Email");
	}

}
