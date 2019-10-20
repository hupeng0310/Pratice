package Util.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.*;

public class Base64Util {
    public static void Base64Encode(String sourceParent,String sourceFileName,String targetParent,String targetFileName){
        File sourceFile = new File(sourceParent,sourceFileName);
        File targetFile =new File(targetParent,targetFileName);
        if(!targetFile.exists()){
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buff = new byte[(int)sourceFile.length()];
            fileInputStream.read(buff);
            fileOutputStream.write(new BASE64Encoder().encode(buff).getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("未找到源文件"+sourceFile);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void BaseDecode(String sourceParent,String sourceFileName,String targetParent,String targetFileName){
        File sourceFile = new File(sourceParent,sourceFileName);
        File targetFile = new File(targetParent,targetFileName);
        if(!targetFile.exists()){
            try{
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buff = new byte[(int)sourceFile.length()];
            bufferedInputStream.read(buff);
            bufferedOutputStream.write(new BASE64Decoder().decodeBuffer(new String(buff)));
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("未找到源文件"+sourceFile);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
