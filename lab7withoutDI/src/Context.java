public class Context {
    private ISorter sorter;

    public Context(ISorter sorter){
        this.sorter = sorter;
    }

    public void setSorter(ISorter sorter) {
        this.sorter = sorter;
    }

    public void getSortedArray(byte[] array){
        sorter.sort(array);
    }
}
