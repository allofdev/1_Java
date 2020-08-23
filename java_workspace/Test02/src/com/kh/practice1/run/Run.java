package com.kh.practice1.run;

import com.kh.practice1.model.dao.BookDao;

public class Run {

	public static void main(String[] args) {
		
		BookDao bd = new BookDao();
		
		bd.fileSave();
		bd.fileRead();
	}

}
