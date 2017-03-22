package snaps;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesnaps 
{
	public static void takescreeshot(ChromeDriver f, String name)throws Exception
	{
		File f1 = f.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\" +name+ ".png");
		FileUtils.copyDirectory(f1, f2);
	}

}
