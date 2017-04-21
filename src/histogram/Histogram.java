package hm;

import java.util.HashMap;
import java.util.Map;

public class hm <T> {
    
    private final Map<T, Integer> hm = new HashMap<>();
    
    public Integer increment(T key) {
        return hm.put(key, hm.containsKey(key)? hm.get(key) : 1);
    }
    
    public Map<T, Integer> calculate(T[] array){
        for (T key : array) {
            Integer value = hm.get(key);
            if(value == null) {
            	hm.put(key, 1);
            } else {
            	hm.put(key, ++value);
            }
        }
        return hm;
    }
    
    Iterable<T> keySet() {
        return hm.keySet();
    }
    
    public int getValueOf(T key) {
        return hm.get(key);
    }   
    
}
