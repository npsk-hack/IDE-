package cmd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Java2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Notices to be placed to User
				System.out.println(
						"Welcome to Java to C programme! Please note: all data from code is from an external database.");
				System.out.println("Code which programme DOES NOT SUPPORT several functions, due to lack of time.");
				System.out.println("Functions not SUPPORTED: std, arrays and few others.");
				System.out.println("Replication of such ARBITARY CODE is difficult and time-consuming.");
				System.out.println("Thank you for understanding. Hope you enjoy our Databased-Java to C Programme!");
				System.out.println();
				System.out.println("Executing Java to C Programme...");

				// In-Library
				Random R = new Random();
				// Declaration variables
				String co;
				String name;
				String[] c = new String[50];
				Runtime rt = Runtime.getRuntime();
				String path;
				String x = "static void";
				char g='"';
				char h=',';
				String er="";
				er=""+g+h;
				String t="";
		        char plus='+';
		        t=t+g+plus;
		        String er2=t+g+" "+plus;
		        String p="printf(";
		        char cu='%';
		        char hh='d';
		        String pr=p+g+cu+hh+g+h;
		        
				// I-O
				Scanner S = new Scanner(System.in);

				System.out.println("Please enter the path of the JAVA code written on Notepad.");
				System.out.println("Example: C:/Users/XXX/YYY/My Programs");
				String path1=S.nextLine();
				System.out.println("Please mention the name of the JAVA code (without the file extension please).");
				String name1=S.nextLine();
				
			    List<String> lines = new ArrayList<String>();
		        String s;

				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(path1+"/"+ name1+".java"));
					while ((s = bufferedReader.readLine()) != null) {
						lines.add(s);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String[] data = lines.toArray(new String[] {});
				co=String.join("   ", data);

				
			

				// the HUGE ARRAY
				c[0] = "int main()";
				c[1] = "public static void main(String[] args)";
				c[2] = "import java.util.*;";
				c[3] = "import java.lang.Math;";
				c[4] = 	"import java.io.*;";
				c[10] = "#include <stdio.h>\r\n" + 
						"#include <string.h>\r\n" + 
						"#include <stdlib.h>\r\n" + 
						"#include <sys/timeb.h>\r\n" + 
						"#include <time.h>\r\n" + 
						"#include <math.h>\r\n" +
						"#include <windows.h>" ;
				c[11] = pr;
				c[12] = "System.out.println(";
				c[13] = "%c";
				c[14] = ",";// scanf
				c[15] = ""; // blank
				c[16] = "%s";
				c[17] = "atoi";
				c[18] = "Integer.parseInt";
				c[19] = "exit";
				c[20] = "System.exit";
				c[21] = "char";
				c[22] = "String";
				c[23] = "time(NULL)";
				c[24] = "System.currentTimeMillis()/1000";
				c[25] = "gets";// if
				c[26] = "puts";
				c[27] = "println";
				c[28] = "fgets(fl)";
				c[29] = "myreader.read();";
				c[30] = "fputs";
				c[31] = "mywriter.write";
				c[32] = "abs";
				c[33] = "Math.abs";
				c[34] = "pow";
				c[35] = "Math.pow";
				c[36] = "sin";
				c[37] = "Math.sin";
				c[38] = "cos";
				c[39] = "Math.cos";
				c[40] = "sqrt";
				c[41] = "Math.sqrt";
				c[42] = "tan";
				c[43] = "Math.tan";
				c[44] = "atan";
				c[45] = "Math.atan";
				c[46] = "log";
				c[47] = "Math.log";
				c[48] = "class";
				c[49] = "struct";
				// Reading and Replacing
				co="#include <stdio.h> \n"+ co;
				
				if(co.contains("// TODO Auto-generated method stub")) {
					co=co.replace("// TODO Auto-generated method stub", "");
				}
				
					if (co.contains(c[1])) {
						co = co.replace(c[1], c[0]);
						System.out.println();
					}
					if (co.contains(c[48])) {
						co = co.replace(c[48], c[49]);
						System.out.println();
					}
					if (co.contains(c[2])) {
						co = co.replace(c[2], c[10]);
						System.out.println();

					}
					if (co.contains(c[3])) {
						co = co.replace(c[3], c[10]);
						System.out.println();
					}
					if (co.contains(c[4])) {
						co = co.replace(c[4], c[10]);
						System.out.println();
					}

					if (co.contains(c[12])) {
						co = co.replace(c[12], c[11]);
						System.out.println();
					}
					if (co.contains(c[18])) {
						co = co.replace(c[18], c[17]);
						System.out.println();
					}
					if (co.contains(c[20])) {
						co = co.replace(c[20], c[19]);
						System.out.println();
					}
					if (co.contains(c[22])) {
						co = co.replace(c[22], c[21]);
						System.out.println();
					}
					if (co.contains(c[24])) {
						co = co.replace(c[24], c[23]);
						System.out.println();
					}
					if (co.contains(c[27])) {
						co = co.replace(c[27], c[26]);
						System.out.println();
					}
					if (co.contains(c[29])) {
						co = co.replace(c[29], c[28]);
					}
					if (co.contains(c[31])) {
						co = co.replace(c[31], c[30]);System.out.println();
					}
					if (co.contains(c[33])) {
						co = co.replace(c[33], c[32]);
						System.out.println();
					}
					for (int i = 34; i <= 46; i += 2) {
						if (co.contains(c[i+1])) {
							co = co.replace(c[i+1], c[i]);
							System.out.println();
						}

					}
					if (co.contains(x)) {
						co = co.replace(x, "void");
						System.out.println();
					}
					if (co.contains("System.out.println")) {
						co = co.replace("System.out.println", "cout <<");
						System.out.println();
					}
					// IF Statements
					if (co.contains(R + "=S.next();")) {
						co = co.replace(R + "=S.next();", "gets(" + R + ");");
						System.out.println();
					}
					if(co.contains(t)){
						co=co.replace(t, er);
						System.out.println();
					}
					if(co.contains(er2)){
						co=co.replace(er2, er);
						System.out.println();
					}
					
					co=co.substring(0, co.length()-2);
					co=co+" return 0; }";
					co=co.replace("struct "+name1 +"{", "");
					co=co.replace("public struct "+name1+"{", "");
					co=co.replace("public struct "+name1+" {", "");
					co=co.replace("struct "+name1+" {", "");
				// Creating a txt file and write the variable 'co' in it
				BufferedWriter output = null;
				BufferedWriter bufferedWriter = null;
		        try {
		            File myFile = new File(path1+"/"+name1+".c");
		            // check if file exist, otherwise cre1ate the file before writing
		            if (!myFile.exists()) {
		                myFile.createNewFile();
		            }
		            Writer writer = new FileWriter(myFile);
		            bufferedWriter = new BufferedWriter(writer);
		            bufferedWriter.write(co);
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally{
		            try{
		                if(bufferedWriter != null) bufferedWriter.close();
		            } catch(Exception ex){
		                 
		            }
		        }
		        
		        String cmdcommands="cd "+ path1 +" && start "+ name1+".c";
		        try {
		        	System.out.println("This opened file is the Converted Version of Java code to C code!");
					rt.exec(new String[] {"cmd.exe", "/C", cmdcommands});
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

}
