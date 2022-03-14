package techprClass.lambdacourse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FunctionalProgramming06 {

	public static void main(String[] args) throws IOException {
		// How to read text from the files
		// for just Accessing --> FileNotFoundException
		// Accessing and reading together --> so it throws IOException
		// lines() --> put the text on the stream work with Paths class
		// forEach() --> will get and print it line by line 
//		Files.lines(Paths.get("src/techpro.lambdacourse/LambdaTextFile.txt")).forEach(System.out::println);
//		System.out.println("==============");
		
		//How to convert all characters in the file to upper case 
		// map() -->for updating data
//		Files.lines(Paths.get("src/techpro.lambdacourse/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);
		
		
		//How to check if a specific word(Lambda) exists in the text
//		boolean result = Files.lines(Paths.get("src/techpro.lambdacourse/LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
//		System.out.println(result);
//		
		//**********Print distinct words on the console in the file
		// map(t->t.split(" ")) --> for each line java will create array [___, ___, ___, __]
		// i do not need array --> use flatMap() to convert Array --> to word in stream
//		Files.lines(Paths.get("src/techpro.lambdacourse/LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
		// no reputation
		
		//Get the words which end with “e” and print them on the console
		Files.
			lines(Paths.get("src/techpro.lambdacourse/LambdaTextFile.txt")).
			map(t->t.split(" ")).
			flatMap(Arrays::stream).
			filter(t->t.endsWith("e")).
			forEach(System.out::println);		
	}

}