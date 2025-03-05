package com.fls;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exp4 {
	public static void main(String[] args){
		try(Stream<String> strm= Files.lines(Paths.get("src/chartest.txt")))
				{
		strm.forEach(System.out::println);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
