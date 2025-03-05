package com.fls;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ByteRead {
	public static void main(String[] args) {
		FileInputStream fis= null;
		BufferedInputStream bis= null;
		
		try {
		fis= new FileInputStream("src/bytetest.txt");
		//storing and reading the data
		bis= new BufferedInputStream(fis);
		//byte array-----> String format
		byte[] br= new byte[1024]; //1KB
		int x= 0;
		while((x=bis.read(br)) != -1) {
			System.out.println(new String(br,0,x)); //string(byte array, 0th index, upto index)
		}
			
		
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				bis.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
}
