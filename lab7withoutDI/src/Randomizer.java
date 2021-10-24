public class Randomizer implements IRandomizer{
    public byte[] createRandomArray() {
        byte[] array = new byte[(byte) (Math.random() * 15)];
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) (Math.random() * 255 - 128);
        }
        return array;
    }
}
