package com.kh.practice1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice1.model.vo.Book;

public class BookDao {

	public void fileSave() {
		
		Book b = new Book("자바를 정복하자", 35000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
			
			oos.writeObject(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))){
			
			Book b = (Book)ois.readObject();
			
			System.out.println(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
