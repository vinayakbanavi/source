/*
 * Binary Read and Write using try catch
 */

package pack6_binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A2 
{
	public static void main(String[] args) 
	{
		File source = new File("C:\\Users\\user\\Desktop\\Graphs\\java-exceptions-hierarchy-example.png");
		File target = new File("exception.png");
		
		FileInputStream fileInput = null;
		BufferedInputStream bufferedInput = null;
		
		FileOutputStream fileOutput = null;
		BufferedOutputStream bufferedOutput = null;
		
		try
		{
			fileInput = new FileInputStream(source);
			bufferedInput = new BufferedInputStream(fileInput);
			
			fileOutput = new FileOutputStream(target);
			bufferedOutput = new BufferedOutputStream(fileOutput);
			
			byte[] data = new byte[(int) source.length()];
			
			bufferedInput.read(data);
			
			bufferedOutput.write(data);
	
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		finally 
		{
			if (bufferedOutput != null)
			{
				try 
				{
					bufferedOutput.flush();
					
					bufferedOutput.close();
					fileOutput.close();
				}
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
			if (bufferedInput != null)
			{
				try 
				{
					bufferedInput.close();
					fileInput.close();
				}
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
		}
		
		System.out.println("binary read and write successfull");
	}
}
