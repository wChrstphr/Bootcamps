package apple.iphone;

import apple.iphone.service.browser.Safari;
import apple.iphone.service.email.Email;
import apple.iphone.service.map.Maps;
import apple.iphone.service.music.IPod;
import apple.iphone.service.phone.Phone;
import apple.iphone.service.photos.Photos;
import apple.iphone.service.sms.SMS;
import apple.iphone.utils.IPhoneUtil;

public class IPhone implements IPhoneUtil{
		private IPod iPod = new IPod();
		private Phone phone = new Phone();
		private SMS sms = new SMS();
		private Maps maps = new Maps();
		private Photos photos = new Photos();
		private Email email = new Email();
		private Safari safari = new Safari();

	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		
		iPhone.playSong();
		iPhone.playVideo();
		iPhone.sms.sendMessage();
		iPhone.makeACall();
		iPhone.viewMap();
		iPhone.browse();
		iPhone.showPhotos();
		iPhone.replyEmail();
		
	}	

	
	public void playSong() {
		System.out.println("> Playing a song");
		iPod.selectAlbum();
		iPod.selectMusic();
		iPod.play();
	}
	
	public void playVideo() {
		System.out.println("\n> Playing a video");
		iPod.selectVideo();
		iPod.play();
		iPod.pause();
		iPod.closeVideo();
	}
	
	public void makeACall() {
		System.out.println("\n> Making a call");
		phone.call();
		phone.hangUpCall();
	}
	
	public void viewMap() {
		System.out.println("\n> Viewing Map");
		maps.searchLocation();
		maps.showLocation();
		IPhoneUtil.swipe();
		IPhoneUtil.zoomIn();
		IPhoneUtil.zoomOut();
	}
	
	public void browse() {
		System.out.println("\n> Browsing the internet");
		safari.clearCache();
		safari.addNewPage();
		safari.loadPage();
		IPhoneUtil.zoomIn();
		IPhoneUtil.zoomOut();
		IPhoneUtil.swipe();
		safari.refreshPage();
		safari.closePage();
	}
	
	public void showPhotos() {
		System.out.println("\n> Showing photos");
		photos.showAlbum();
		photos.showPhoto();
		IPhoneUtil.zoomIn();
		IPhoneUtil.zoomOut();
		IPhoneUtil.swipe();
	}
	
	public void replyEmail() {
		System.out.println("\n> Replying an email");
		email.showEmail();
		email.createEmail();
		email.sendEmail();
	}
}