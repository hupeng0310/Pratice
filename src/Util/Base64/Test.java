package Util.Base64;

import java.io.File;

public class Test {
    public static void main(String[] args){
        Base64Util.Base64Encode("Resource/Files","test.txt","Resource/Files","test_encode.txt");
        Base64Util.BaseDecode("Resource/Files","test_encode.txt","Resource/Files","test_decode.txt");
    }
}
