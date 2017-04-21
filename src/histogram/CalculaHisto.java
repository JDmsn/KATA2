package histogram;

public class CalculaHisto {
    public static <T> Histogram <T> computeHistogram (T[] vector) {
        Histogram<T> hm = new Histogram<>();
        for(T element : vector) 
            hm.increment(element);
        
        return hm;
    }
}
