package demo.Stream.FileOperation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		File sourceFile = new File("Resource/Files/test.txt");
		File targetFile = new File("Resource/Files/test_copy.txt");
		if(!sourceFile.exists()) {
			try {
				sourceFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(!targetFile.exists()) {
			try {
				targetFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedInputStream bufferedInputStream =new BufferedInputStream(new FileInputStream(sourceFile));
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile));
			byte[] buff = new byte[10];
			int length =0;
			while((length= bufferedInputStream.read(buff)) != -1) {
				bufferedOutputStream.write(buff,0,length);
			}
			bufferedInputStream.close();
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("拷贝文件结束");
	}
}
