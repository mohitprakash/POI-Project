package logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Logs 
{
	public static void infolog(String log)throws Exception
	{
		File f = new File("D:\\POMlog1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("[Info ]" + log);
		bw.flush();
		bw.close();
	}

}
