package apple.iphone.service.music;

import apple.iphone.utils.MediaControlUtil;

public class IPod implements MusicReproducer, MediaControlUtil {

	@Override
	public void selectMusic() {
		System.out.println("Selecting music via IPod");
	}

	@Override
	public void selectAlbum() {
		System.out.println("Selecting album via IPod");
	}

	@Override
	public void selectVideo() {
		System.out.println("Selecting video via IPod");
	}

	@Override
	public void closeVideo() {
		System.out.println("Closing video via IPod");
	}

	@Override
	public void pause() {
		System.out.println("Pausing via IPod");
	}

	@Override
	public void play() {
		System.out.println("Playing via IPod");
	}
}
