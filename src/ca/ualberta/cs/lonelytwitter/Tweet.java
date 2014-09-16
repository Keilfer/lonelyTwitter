package ca.ualberta.cs.lonelytwitter;

public abstract class Tweet implements BasicText {
	
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
	
	public void setCharLimit(int i) {
	}
	
	public int getCharLimit() {
		return this.length;
	}
	
	public abstract void printText();

}
