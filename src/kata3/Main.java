package kata3;

public class Main {
    
    public static void main(String[] args) {
        int[] array = {1,2,1,5,1,2,3};
        HistogramBuilder builder = new HistogramBuilder();
        builder.calculate(array);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
