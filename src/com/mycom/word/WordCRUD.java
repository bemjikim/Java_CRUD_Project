package com.mycom.word;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
	ArrayList<Word> list;
	Scanner s = new Scanner(System.in);
	WordCRUD(Scanner s)
	{
		list = new ArrayList<>();
		this.s = s;
	}
	@Override
	public Object add() {
		System.out.print("\n=> 난이도(1, 2, 3) & 새 단어 입력 : ");
		int level = s.nextInt();
		String word = s.nextLine();
		
		System.out.print("뜻 입력 : ");
		String meaning = s.nextLine();
		
		return new Word(0, level, word, meaning);
	}
	
	public void addWord(){
		Word one = (Word)add();
		list.add(one);
		System.out.println("\n새 단어가 단어장에 추가되었습니다 !!! \n");
	}
	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectOne(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public void listAll() {
		System.out.println("\n-----------------------------");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print((i+1) + " ");
			System.out.println(list.get(i).toString()); // arraylist 안에 해당하는 순서를 꺼내옴 0 번째 ~ 3번째
		}
		System.out.println("-----------------------------\n");
	}

}
