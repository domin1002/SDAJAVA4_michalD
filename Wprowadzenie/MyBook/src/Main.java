import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//dopisz odpowiedni� klas� dziedzicz�c� po klasie Book

class MyBook extends Book{

	@Override
	void setTitle(String s) {
		this.title = s;
	}
}

public class Main{
	
	public static void main(String []args){
		String title = "Steve Jobs: The Man Who Thought Different";
		MyBook newNovel=new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: "+newNovel.getTitle());	
	}
}
