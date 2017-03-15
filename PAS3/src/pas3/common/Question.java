package pas3.common;

import java.util.ArrayList;

public class Question {
	private ArrayList<String> answers;
	private String question;
	
	public Question(){
		answers = null;
		question = " ";
		
	}
	public void setQuestion(String q){
		question = q;
	}
	public String getQuestion(){
		return question;
	}
	public ArrayList<String> getAnswers(){
		return answers;	
	}
	public void setAnswers(ArrayList<String> a){
		answers = a;
	}
	public String getAnswerByIndex(int index){
		return answers.get(index);
		
	}
}
