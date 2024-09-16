package apple.iphone.service.photos;

public class Photos implements PhotoService {

	@Override
	public void showPhoto() {
		System.out.println("Showing Photo via Photos");
		
	}
	
	@Override
	public void showAlbum() {
		System.out.println("Showing Album via Photos");
	}

	@Override
	public void setPhotoAsWallpaper() {
		System.out.println("Setting Wallpaper via Photos");
	}

	@Override
	public void emailPhoto() {
		System.out.println("Emailing Photo via Photos");
	}
	
}
