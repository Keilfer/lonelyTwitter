package ca.ualberta.cs.lonelytwitter;

public class BasicPrintTweet extends Tweet{
	
	public BasicPrintTweet(String t){
		super(t);
	}

	public void printText() {
		System.out.println(this.text);
	}

}
