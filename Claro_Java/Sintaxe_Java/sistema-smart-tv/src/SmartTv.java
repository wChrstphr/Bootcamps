public class SmartTv {
    boolean on;
    int channel;
    int volume;

    public SmartTv (boolean on, int channel, int volume) {
        this.on = on;
        this.channel = channel;
        this.volume = volume;
    }

    public void turnOn () {
        on = true;
    }

    public void turnOff () {
        on = false;
    }

    public void increaseVolume () {
        volume += 1;
    }

    public void decreaseVolume () {
        volume -= 1;
    }

    public void changeChannelUp () {
        channel += 1;
    }

    public void changeChannelDown () {
        channel -= 1;
    }

    public void changeChannel (int newChannel) {
        channel = newChannel;
    }
}
