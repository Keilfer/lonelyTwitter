package ca.ualberta.cs.lonelytwitter;

public abstract class Tweet {
	
	public Tweet(String s){
		this.setText(s);
	}
	
	String text;
	final int length = 140;
	
	public void setText(String s){
		if(s.length() <= this.length){
			this.text = s;
			}
	}
	
	public String getText(){
		return this.text;
	}
	
	public abstract void printText();

}
