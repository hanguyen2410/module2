package CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndCoppyFile {
    List<String> string = new ArrayList<>();
    public List<String> readFile(String filePath) {

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            br.close();
        }catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return string;
    }
    public void coppyFile(String filePathCoppy){
        try {
            FileWriter writer = new FileWriter(filePathCoppy,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(String str : string){
                    bufferedWriter.write(str+"\n");
            }
            bufferedWriter.close();
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readAndCoppy(String filePath, String filePathCoppy){
        readFile(filePath);
        coppyFile(filePathCoppy);
    }

}
