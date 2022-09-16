import java.io.*;

public class BinaryConversion {
    public static void main(String[] args) throws  IOException {
        OutputStream os = new FileOutputStream("BinaryTest1.txt");
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();

        InputStream is = new FileInputStream("BinaryTest.txt");
        byte[] bytes2 = new byte[10];
        int i;
        while ((i = is.read(bytes)) != -1) {
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        is.close();
    }
}
