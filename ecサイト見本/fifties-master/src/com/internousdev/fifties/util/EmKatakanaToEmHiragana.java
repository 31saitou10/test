package com.internousdev.fifties.util;

public class EmKatakanaToEmHiragana {
	private String searchWord;

	public String EmHiraganaToEmKatakana(String searchWord){
		StringBuffer sb = new StringBuffer(searchWord);
		for (int i = 0; i < sb.length(); i++){
			char c = sb.charAt(i);
			if(c >= 'ア' && c <='ン'){
				sb.setCharAt(i, (char)(c - 'ア' + 'あ'));
			}else if(c == 'カ'){
				sb.setCharAt(i, 'カ');
			}else if(c == 'ヶ'){
				sb.setCharAt(i, 'ケ');
			}else if(c == 'ヴ'){
				sb.setCharAt(i, 'ウ');
				sb.insert(i + 1, '゛');
				i++;
			}
		}
		return sb.toString();
	}
	public String getSearchWord(){
		return searchWord;
	}

	public void setSearchWord(String searchWord){
		this.searchWord = searchWord;
	}
}
