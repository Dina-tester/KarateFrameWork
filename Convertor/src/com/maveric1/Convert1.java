package com.maveric1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert1 {

	public static void main(String[] args) {

	
		String fileName = "E:\\Ellipse - Gtech\\program\\MobAuto\\SriKarateFrame\\Convertor\\src\\com\\maveric1\\soal1.txt";
	    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	        String result = stream.map(s -> s.split("\\s+"))
	                              .map(s -> Arrays.stream(s).collect(Collectors.joining(","))+"\n")
	                              .collect(Collectors.joining());
	        System.out.println(result);

	    } catch (IOException e) {
	        e.printStackTrace();

	
	
	
	
	
	}

}
}