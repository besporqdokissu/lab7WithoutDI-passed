class Printer implements IPrinter {

    public void printArray(byte[] arr) {
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }



}