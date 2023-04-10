package data_clumps.before;

import java.util.*;

public class Rental {
	Movies data;
	// variable data sama persis seperti di Movies
	public Rental(String name, Date start, Date end) {
		this.data.name = name;
		this.data.start = start;
		this.data.end = end;
	}
	
	public String getLabel() {
		return data.name;
	}
	
	public Date getStart() {
		return data.start;
	}
	
	public Date getEnd() {
		return data.end;
	}
}
