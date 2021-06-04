package org.all;

import org.tamil.Tamil;

public class LanguageClass extends Tamil
{
	private void allLanguage() {
System.out.println("All languages");
	}
	public static void main(String[] args) {
		LanguageClass lang = new LanguageClass();
				lang.allLanguage();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.telguLanguage();
	}

}
