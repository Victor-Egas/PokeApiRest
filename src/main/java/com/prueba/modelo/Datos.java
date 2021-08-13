package com.prueba.modelo;

import java.util.ArrayList;
import java.util.List;

public class Datos {


	
	  private List<Pokemon> results=new ArrayList<>();    
	  private int count;
	  private boolean previous;
	        
	   

		public List<Pokemon> getResults() {
			return results;
		}

		public void setResults(List<Pokemon> results) {
			this.results = results;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public boolean isPrevious() {
			return previous;
		}

		public void setPrevious(boolean previous) {
			this.previous = previous;
		}
	
	    
	
}
