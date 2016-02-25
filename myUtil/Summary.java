package myUtil;

import java.util.Collection;

public class Summary {

	public static <T extends Comparable<T>> T max(Collection<T> values) {
	    if (values.size() <= 0)
	        throw new IllegalArgumentException();
	
	    T max = values.iterator().next();
	    for (T val : values) {
			if (val.compareTo(max) > 0) {
				max = val;
			}
		}
	    return max;
	}

	public static <T extends Comparable<T>> T min(Collection<T> values) {
		if (values.size() <= 0)
	        throw new IllegalArgumentException();
		
		T min = values.iterator().next();
		for (T val : values) {
			if (val.compareTo(min) < 0) {
				min = val;
			}
		}
		
		return min;
	}
	
	@SafeVarargs
	public static <T extends Comparable<T>> T  min(T... values) {
		
		if (values.length <= 0) {
			throw new IllegalArgumentException();
		}
		
		T m = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(m) < 0) {
				m = values[i];
			}
		}
		return m;
	}

	public static double avg(Collection<Double> values) {
		
		if (values.size() <= 0)
	        throw new IllegalArgumentException();
		
		return Summary.sum(values)/values.size();
	}

	public static double sum(Collection<Double> values) {
		double s = 0.0;
		for (Double v : values) {
			s += v;
		}
		return s;
	}

	

}
