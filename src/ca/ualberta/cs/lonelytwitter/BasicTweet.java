package ca.ualberta.cs.lonelytwitter;

public class BasicTweet implements BasicText{
	
	String text;
	int limit = 140;
	
	public BasicTweet(String s, int i){
		this.text = s;
		this.limit = i;
	}

	public void setText(String s) {
		this.text = s;
	}

	public void setCharLimit(int i) {
		this.limit = i;
	}

	public String getText() {
		return this.text;
	}

	public int getCharLimit() {
		return this.limit;
	}

}
