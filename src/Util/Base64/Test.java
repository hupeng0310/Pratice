package Util.Base64;

import java.io.File;

public class Test {
    public static void main(String[] args){
        Base64Util.Base64Encode("Resource/Files","png.png","Resource/Files","png_encode.png");
        Base64Util.BaseDecode("Resource/Files","png_encode.png","Resource/Files","png_decode.png");
    }
}
