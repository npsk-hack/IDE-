package cmd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

class C2Java {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Notices to be placed to User
		System.out.println(
				"Welcome to C/C++ to Java programme! Please note: all data from code is from an external database.");
		System.out.println("Code which programme DOES NOT SUPPORT several functions, due to lack of time.");
		System.out.println("Functions not SUPPORTED: std, arrays and few others.");
		System.out.println("Replication of such ARBITARY CODE is difficult and time-consuming.");
		System.out.println("Thank you for understanding. Hope you enjoy our Databased-C/C++ to Java Programme!");
		System.out.println();
		System.out.println("Executing C/C++ to Java Programme...");

		// In-Library
		Random R = new Random();
		// Declaration variables
		String co;
		String name;
		String[] c = new String[48];
		Runtime rt = Runtime.getRuntime();
		String path;
		String x = "static void";
		int count = 0;
		char g='"';
		char h=',';
		String er="";
		er=""+g+h;
		String er2=""+g+" "+h;
        String t="";
        char plus='+';
        t=t+g+plus;
        
		// I-O
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter the path of the C code written on Notepad.");
		System.out.println("Example: C:/Users/XXX/YYY/My Programs");
		String path1=S.nextLine();
		System.out.println("Please mention the name of the C code (without the file extension please).");
		String name1=S.nextLine();
	
		
		List<String> lines = new ArrayList<String>();
        String s;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path1+"/"+ name1+".c"));
			while ((s = bufferedReader.readLine()) != null) {
				lines.add(s);
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] data = lines.toArray(new String[] {});
		co=String.join("   ", data);

		
	

		// the HUGE ARRAY
		c[0] = "int main()";
		c[1] = "\r\n"+"class "+ name1 + "{\r\n" + "	public void main(String[] args)\r\n";
		c[2] = "#include <stdio.h>";
		c[3] = "#include <string.h>";
		c[4] = "#include <stdlib.h>";
		c[5] = "#include <sys/timeb.h>";
		c[6] = "#include <time.h>";
		c[7] = "#include <math.h>";
		c[8] = "#include <iostream>";
		c[9] = "#include <windows.h>";
		c[10] = "import java.io.*;\r\n" + "import java.lang.Math;\r\n" + "import java.util.*;";// for c2-9
		c[11] = "printf";
		c[12] = "System.out.println";
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

		// Reading and Replacing
		
			if (co.contains(c[0])) {
				co = co.replace(c[0], c[1]);
			}
			if (co.contains(c[2])) {
				co = co.replace(c[2], c[10]);

			}
			if (co.contains(c[3])) {
				co = co.replace(c[3], c[10]);
			}
			if (co.contains(c[4])) {
				co = co.replace(c[4], c[10]);
			}
			if (co.contains(c[5])) {
				co = co.replace(c[5], c[10]);
			}
			if (co.contains(c[6])) {
				co = co.replace(c[6], c[10]);
			}
			if (co.contains(c[7])) {
				co = co.replace(c[7], c[10]);
			}
			if (co.contains(c[8])) {
				co = co.replace(c[8], c[10]);
			}
			if (co.contains(c[9])) {
				co = co.replace(c[9], c[10]);

			}
			if (co.contains(c[11])) {
				co = co.replace(c[11], c[12]);
			}
			if (co.contains(c[13])) {
				co = co.replace(c[13], c[15]);
			}
			if (co.contains(c[16])) {
				co = co.replace(c[16], c[15]);
			}
			if (co.contains(c[17])) {
				co = co.replace(c[17], c[18]);
			}
			if (co.contains(c[19])) {
				co = co.replace(c[19], c[20]);
			}
			if (co.contains(c[21])) {
				co = co.replace(c[21], c[22]);
			}
			if (co.contains(c[23])) {
				co = co.replace(c[23], c[24]);
			}
			if (co.contains(c[26])) {
				co = co.replace(c[26], c[27]);
			}
			if (co.contains(c[28])) {
				co = co.replace(c[28], c[29]);
			}
			if (co.contains(c[30])) {
				co = co.replace(c[30], c[31]);
			}
			if (co.contains(c[32])) {
				co = co.replace(c[32], c[33]);
			}
			if (co.contains(c[30])) {
				co = co.replace(c[30], c[31]);
			}
			for (int i = 34; i <= 46; i += 2) {
				if (co.contains(c[i])) {
					co = co.replace(c[i], c[i + 1]);
				}

			}
			if (co.contains("void")) {
				co = co.replace("void", x);
			}
			if (co.contains("cout <<")) {
				co = co.replace("cout <<", "System.out.println");
			}
			// IF Statements
			if (co.contains("gets(" + R + ");")) {
				co = co.replace("gets(" + R + ");", R + "=S.next();");
			}
			if (co.contains("printf(,")) {
				co = co.replace("printf(,", "System.out.println(");
			}
			if(co.contains("return 0;")) {
				co=co.replace("return 0;", "");
			}
			if(co.contains("%d")) {
				co=co.replace("%d", "");
						}
			if(co.contains(er)){
				co=co.replace(er, t);
			}
			if(co.contains(er2)){
				co=co.replace(er2, t);
			}
			
			
		// Creating a txt file and write the variable 'co' in it
		BufferedWriter output = null;
	
		co=co+"}";
		BufferedWriter bufferedWriter = null;
        try {
            File myFile = new File(path1+"/"+name1+".java");
            // check if file exist, otherwise create the file before writing
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
        String cmdcommands="cd "+ path1 +" && start "+ name1+".java";
        try {
        	System.out.println("This opened file is the Converted Version of C code to Java code!");
			rt.exec(new String[] {"cmd.exe", "/C", cmdcommands});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
