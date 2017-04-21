package histogram;

public class HistogramProgram {
    public static void main(String[] args) {
        //int vector[] = {3,1,0,4,5,6,7,4,5,5,2,8};
        String array[] = {"Pepe", "Maria", "Luis", "Octavio",
            "Antonio", "Samuel", "Kendrick","Marisa"};
        Histogram<String> hm = CalculaHisto.computeHistogram(array);
        /*HashMap hmstat = hm.calculate();
        for (Iterator it = hmstat.entrySet().iterator(); it.hasNext();) {
            Map.Entry output = (Map.Entry) it.next();     
            System.out.println(output.getKey() + " " +output.getValue());
        }*/
        for(String output : histogram.keySet()) {
            System.out.println(output + " " + hm.getValueOf(output));
        }
    }
}
