package com.abc.assignment6;
import java.io.*;
import java.util.*;
import java.io.FileWriter;

/**
 * Copy one file to another using low level byte streams,
 * read and write a whole.at once.
 * @author www.codejava.net
 */
public class CopyFilesOne {

	
	private static Scanner x;
	
    public static void main(String[] args)throws IOException {


        System.out.println("please input your choice\n");
        System.out.println("1................Add Records.................\n");
        System.out.println("2................List Records................\n");
        System.out.println("3................Modify Records..............\n");
        System.out.println("4................Delete a Record..............\n");
        System.out.println("5................exit.........................\n");
        System.out.println("Enter your choice\n");
        Scanner sc= new Scanner(System.in);
        int ch=sc.nextInt();
        switch (ch) {
            case 1:

                System.out.print("Enter Details\n");

                System.out.print("Enter id\n");
                String id3=sc.next();
                System.out.print("Enter name\n");
                String name=sc.next();
                System.out.print("Enter mobile no\n");
                String phone=sc.next();
                System.out.print("Enter email\n");
                String Email=sc.next();
                System.out.print("Enter Address\n");
                String Address=sc.next();
                System.out.print("Enter Designation\n");
                String designation=sc.next();


                String file = "EmployeeDetails.txt";


                try{
                    FileWriter fw=new FileWriter("testout.txt");
                    fw.write(id3);
                    fw.write("     ");
                    
                    fw.write(name);
                    fw.write("     ");
                    fw.write(phone);
                    fw.write("     ");
                    fw.write(Email);
                    fw.write("     ");
                    fw.write(Address);
                    fw.write("     ");
                    fw.write(designation);
                    fw.write("     ");
                    fw.close();
                   }catch(Exception e){System.out.println(e);}
                   System.out.println("Success...");


                break;

                case 2:
                BufferedReader in = new BufferedReader(new FileReader("testout.txt"));
                String line;
                while((line = in.readLine()) != null)
                    {
                        System.out.println(line);
                    }
                in.close();
                break;


                case 3:
                String filePath="testout.txt";
                //String editTerm="testout.txt";

                System.out.println("Enter id\n");
                String id1=sc.next();
                System.out.println("Enter name\n");
                String name1=sc.next();
                System.out.println("Enter mobile no\n");
                String phone1=sc.next();
                System.out.println("Enter email\n");
                String Email1=sc.next();
                System.out.println("Enter Address\n");
                String Address1=sc.next();
                System.out.println("Enter Designation\n");
                String designation1=sc.next();

                String tempFile="temp.txt";
                File oldFile=new File(filePath);
                File newFile=new File(tempFile);
                
                String id2="";String name2="";String phone2="";String Email2="";String Address2="";String designation2="";
                    try {
                        FileWriter fw = new FileWriter(tempFile,true);
                        BufferedWriter bw= new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
                         x= new Scanner(new File(filePath));
                        x.useDelimiter("[,\n]");
                        
                        while(x.hasNext())
                        {
                        	id2=x.next();
                        	name2=x.next();
                        	phone2=x.next();
                        	Email2=x.next();
                        	Address2=x.next();
                        	designation2=x.next();
                        	/*id2=x.next();
                        	id2=x.next();
                        	*/
                        	if(id1.equals(id2))
                        	{
                        		pw.println(id1+"," +name1 + "," +phone1 + ","+Email1 + ","+Address1 + ","+designation1);
                        	}
                        	else
                        	{
                        		pw.println(id2+","+name2 + "," +phone2 + ","+Email2 + ","+Address2 + ","+designation2);
                        	}
                        }
                        x.close();
                        pw.flush();
                        pw.close();
                        oldFile.delete();
                        File dump = new File(filePath);
                        newFile.renameTo(dump);




                    } catch (Exception e) {
                        //TODO: handle exception
                    	System.out.println("error");
                    }


                break;
            default:
                break;
        }

    }
}