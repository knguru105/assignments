package com.abc.assignment6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GREP 
{
	
   public static void main(String[] args) throws IOException 
   {
	   
	   Path path=Paths.get("/assignment1/src/main/java/com/abc/assignment6/abc.txt").toAbsolutePath();
	   List<String>titles= Files.lines(path).collect(Collectors.toList());
	   String abc=getInput();
	   displayResults(abc,titles);
   }
   
	   public static String getInput()
	   {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("enter a word");
		   String titleName= sc.nextLine();
		   sc.close();
		return titleName;
		   
	   }
	   public static int displayResults(String SearchName,List<String> titles)throws IOException
	   {
		   boolean inFile= titles.stream().anyMatch(p->p.equalsIgnoreCase(SearchName));
		   if(inFile)
		   {
			   System.out.println("\nyes,"+SearchName +"is in this file");
			   
		   }
		   else
		   {
			   System.out.println("\nnot,"+SearchName +" in this file");
		   }
		   return 1;
	   }

   
}