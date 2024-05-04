
public class SendEmailNotification implements NotificationSender{

	@Override
	public void sendEmailNotification(String email) {
		System.out.println("Email sent to " + email);
	}

}
