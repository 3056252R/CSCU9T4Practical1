package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

	private int Repetitions ;
	private int Recovery ;
	

	
	public SprintEntry(String n, int d , int m , int y , int min , int h , int s , float dist, int Repet , int Recov )
	 {
		super (n,d,m,y,h,min,s,dist);
		this.Repetitions= Repet;
		this.Recovery= Recov;
		
	}
	
	public int getRepetitions()
	{
		return Repetitions;
	}
	
	public void setRepetitions(int Repet) {
		this.Repetitions= Repet;
	}
	
	public int getRecovery()
	{
		return Recovery;
	}
	
	public void setRecovery(int Recov) {
		this.Recovery= Recov;
	}
	
	public String getEntry()
	{
		String result = getName()+" ran " + getDistance() + "km in" +
	            getHour()+":"+ getMin()+":"+getSec()+"on"
				+getDay()+"/"+getMonth()+"/"+getYear()+""+getRepetitions()+""+getRecovery()+"";
		return result;
				
	}
}
