/**
 * <h1>SmartTv</h1>
 * SmarTv operates your TV, changing its state, channel or volume.
 * <p>
 * <b>Note:</b> Read carefully the documentation to take full advantage of the resources made by the author.
 * 
 * @author Wanjo Christopher   
 * @version 1.0
 * @since 29/08/2024
 */

public class SmartTv {
    boolean on;
    int channel;
    int volume;

    public SmartTv (boolean on, int channel, int volume) {
        this.on = on;
        this.channel = channel;
        this.volume = volume;
    }
    /**
     * This method turns on the SmartTV.
     */
    public void turnOn () {
        on = true;
    }
    /**
     * This methods turns off the SmartTv.
     */
    public void turnOff () {
        on = false;
    }
    /**
     * This method increases the SmartTv volume.
     */
    public void increaseVolume () {
        volume += 1;
    }
    /**
     * This method decreases the SmartTv volume.
     */
    public void decreaseVolume () {
        volume -= 1;
    }
    /**
     * This method increases the SmartTv channel by 1.
     */
    public void changeChannelUp () {
        channel += 1;
    }
    /**
     * This method decreases the SmartTv channel by 1.
     */
    public void changeChannelDown () {
        channel -= 1;
    }
    /**
     * This method changes the SmartTv channel accordingly to the users input.
     * @param newChannel is the users input channel.
     */
    public void changeChannel (int newChannel) {
        channel = newChannel;
    }
}
