package kata3;

public class HistogramBuilder {
    private Histogram histogram;
    public Histogram getHistogram(){
        return histogram;
    }
    
    public void calculate (int [] array){
            histogram = new Histogram();
            for (int item : array){
                histogram.put(item,getCurrentCount(item)+1);
            }
     }
     
     private int getCurrentCount(int item){
         Integer count = histogram.get(item);
         if (count == null) count = 0;
         return count;
     }
}
