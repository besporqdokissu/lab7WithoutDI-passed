public class Client {


    public static void main(String[] args) {
        try {
            IRandomizer randomizer = new Randomizer();
            byte[] byteArray = randomizer.createRandomArray();

            IPrinter printer = new Printer();
            printer.printArray(byteArray);

            Context context = new Context(new BubbleSort());
            context.getSortedArray(byteArray);

            printer.printArray(byteArray);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
