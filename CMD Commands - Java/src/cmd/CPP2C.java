package cmd;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public class CPP2C {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner (System.in);
		System.out.println(
				"Welcome to C++ to C programme! Please note: all data from code is through Assembly Language (Native Code).");
		System.out.println("Hope you enjoy our Assembly-Based C++ to C Programme!");
		System.out.println();
		System.out.println("Executing C++ to C Programme...");
		Runtime rt=Runtime.getRuntime();
		
		System.out.println("Please enter the path of the C++ code written on Notepad.");
		System.out.println("Example: C:/Users/XXX/YYY/My Programs");
		String path=S.nextLine();
		System.out.println("Please mention the name of the C++ code (without the file extension .cpp please).");
		String name=S.nextLine();
	
		
		try {
			rt.exec(new String[] {"cmd.exe", "/C", "cd "+ path+" && g++ -S -O -o "+name+".asm "+ name +".cpp"});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		List<String> lines = new ArrayList<String>();
		String s;
		int count = 0;
		int temp = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		char c= 'C';
		char q='"';
		String qc="";
		qc=qc+q+c+q;
		char r='R';
		String qr="";
		qr=qr+r+q;
		char se=';';
		int temp5=0;
		int temp6=0;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path +"/"+name+".asm"));
			while ((s = bufferedReader.readLine()) != null) {
				lines.add(s);
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] data = lines.toArray(new String[] {});

		for (int i = 0; i <= (count - 1); i++) {
			if (data[i].contains("___tcf_0:")) {
				temp = i;// LC0
			}
			if (data[i].contains("_main:") && data[i + 1].contains("LFB1547:")) {
				temp2 = i +1;// LFB15
				temp4 = i + 2;
			}
			if (data[i].contains("leave")) {
				temp3 = i;
			}
			if(data[i].contains("__GLOBAL__sub_I_main:")) {
				temp5=i-2;
			}
			if(data[i].contains(".def	_atexit;	.scl	2;	.type	32;	.endef")) {
				temp6=i;
			}
			
		}
		
		int difglobal = temp2 - temp - 2;
		int maindif=temp3-temp2-1;
		int global2dif = temp6-temp5-1;
		String[] GLOBAL = Arrays.copyOfRange(data, temp, temp2-1);
		String[] MAIN = Arrays.copyOfRange(data, temp2, temp3);
		String[] GLOBAL2=Arrays.copyOfRange(data, temp5, temp6);
		
		


		for (int j = 2; j <= maindif; j++) {
			MAIN[j]=q+MAIN[j]+se+q;
		}

		String cppcode;
		String whoosh="\r\n";
		String whoosh2="\r\n";

		cppcode = "#include <stdio.h>\r\n"
				+ "\r\n"
				+ "int func();\r\n"
						+ "asm("+qr+"(\r\n";
		//GLOBAL
							String mainy=("\r\n"
								+ "\r\n"
								+ ")"+q+");"
										+ "\r\n"
										+ "\r\n"
										+ "int main()"
										+ "{\r\n"
										+ "asm("
										+ "\r\n");
							//MAIN
			
							String exity=("\r\n"
									+ "\r\n"
									+ ");"
									+ "}\r\n"
									+ "int rand();\r\n"
									+ "asm("+qr+"(\r\n");
							//global2
							
							String finalexit=")"+q+");\r\n"
									+ "\r\n";
						
							 BufferedWriter bufferedWriter = null;
							 try {								
						            File myFile = new File(path+"/"+ name +".c");
						            // check if file exist, otherwise create the file before writing
						            if (!myFile.exists()) {
						                myFile.createNewFile();
						            }
						            Writer writer = new FileWriter(myFile);
						            bufferedWriter = new BufferedWriter(writer);
						            bufferedWriter.write(cppcode);
						            for(int c1=0;c1<=difglobal;c1++) {
						            	bufferedWriter.write(GLOBAL[c1]);
						            	bufferedWriter.write(whoosh);
						            };
						            bufferedWriter.write(mainy);
						            for(int c3=2; c3<=maindif; c3++) {
						            	 bufferedWriter.write(MAIN[c3]);
						            	 bufferedWriter.write(whoosh);
						            }
						            bufferedWriter.write(exity);
						            for(int c4=2; c4<=global2dif; c4++) {
						            	 bufferedWriter.write(GLOBAL2[c4]);
						            	 bufferedWriter.write(whoosh);
						            }
						            bufferedWriter.write(finalexit);
						            
						        } catch (IOException e) {
						            e.printStackTrace();
						        } finally{
						            try{
						                if(bufferedWriter != null) bufferedWriter.close();
						            } catch(Exception ex){
						                 
						            }
						        }
						        String cmdcommands="cd "+ path +" && start " +name+".c";
						        try {
						        	System.out.println("This opened file is the Converted Version of C++ code to C code!");
									rt.exec(new String[] {"cmd.exe", "/C", cmdcommands});
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	}

}
