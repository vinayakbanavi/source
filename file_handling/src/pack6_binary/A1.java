/*
 	Binary Read and Write Operation
 	
 	Binary content 
 	: The information which is stored in the format of binary
 	: images and videos are stored in the format of binary
    : binary content cannot be composed by human beings
    : For Example Digital Cameras Will be Having a processor which will convert the real world picture in to binary
 	: And Image Reader will be having decoder which will convert that back to individual pixel colors and present the picture
	: Here We just Read and write the existing binary file				
*/

package pack6_binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args) throws IOException
	{
//		source : having the source file info
//		specified path must be available 
		File source = new File("gettyimages-1459229416-170667a.jpg");
		
//		for Binary Read
		FileInputStream fileInput = new FileInputStream(source);
		BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
		
//		target : will store the target file 
//		source and target extension must be same
		File target = new File("image_created1.jpg");
		
//		for Binary write
		FileOutputStream fileOutput = new FileOutputStream(target);
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
		
//		byte[] to store the binary data from the source (each pixel data will be stored in each byte)
		byte[] data = new byte[(int) source.length()];
		
//		extracting the data from source to byte array
		bufferedInput.read(data);
		
//		now the data contains image as a bytes array
		
//		Writing this data into the target
		bufferedOutput.write(data);
		
//		flush() will forcefully write the trapped content into the target
		bufferedOutput.flush();
		
//		now close all the resource connection established
		bufferedOutput.close();
		fileOutput.close();
		
		bufferedInput.close();
		fileInput.close();
		
		System.out.println("binary file read and write completed");
	}
}
