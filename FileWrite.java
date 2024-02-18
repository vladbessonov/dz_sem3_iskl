import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void createFile(String[] bufferArray) throws IOException {
        String fileName = bufferArray[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = String.join(" ", bufferArray);

            bw.write(writeString);
            bw.newLine();
            bw.close();


        } catch (IOException e){
            throw new IOException("Произошла ошибка во время создания или записи файла");
        }

    }
}