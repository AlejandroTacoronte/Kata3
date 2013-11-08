package persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {

    public String[] readDomains(String filename) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String line;
            try {
                line = reader.readLine();
                if(line == null)break;
                list.add(line.split("@")[1].toLowerCase());
            } catch (IOException ex) {
                break;
            }
        }
        return list.toArray(new String[0]);
    }
}
