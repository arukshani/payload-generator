import java.io.File;
import java.io.FileWriter;

public class PayloadGen {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        File file = new File("3MB.xml");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("<test>");
        while (file.length() <= 3.1e+6) {
            writer.write("<cat>");
            writer.write("Kitty");
            writer.write("</cat>");
            writer.write("<dog>");
            writer.write("Doggy");
            writer.write("</dog>");
        }
        writer.write("</test>");
        writer.flush();
        writer.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000f + " seconds");
    }
}