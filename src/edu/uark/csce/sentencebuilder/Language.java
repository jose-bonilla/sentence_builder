package edu.uark.csce.sentencebuilder;

import java.util.ArrayList;


public class Language {

	public ArrayList<Word> translateSentence(Sentence sentence){
		
		return sentence.wordchain;
	}
	
	public Word translateWord(Word word){
		
		return word;
	}	
}
