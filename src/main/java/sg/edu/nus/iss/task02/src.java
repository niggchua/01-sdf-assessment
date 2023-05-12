package sg.edu.nus.iss.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class src {


    /**
     * @param args
     */
    public static void main( String[] args )
    {


        Reader r = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(r);

        Map<String, Integer> wordCount = new HashMap<>();

        br.lines()
            .map(line -> line.trim().toLowerCase().replaceAll("\\p{Punct}", ""))
            // String -> String[]
            .map(line -> line.split("\\s+"))
            .flatMap(words -> Arrays.asList(words).stream())
            .filter(word -> (word.trim().length() > 0))
            .filter(word -> !Constants.STOPWORDS_SET.contains(word))
            .forEach(word -> {
                int c = wordCount.computeIfAbsent(word, w -> 0);
                wordCount.put(word, c + 1);
            });

        br.close();





/*         o	Socket s = ss.accept()
o	Input Stream is = s.getInputStream
o	BufferedInputStream bis = new BufferedInputStream
o	ZipInputStream zis = new Zis(bis)
o	// then the server starts reading the zip file
	Find out what the client does to format what they’ve sent to you, then you reverse it for the server to read

*/

// try-catch block to handle exceptions
try {
  
    // Create a file object

    File f = new File();

    // Get all the names of the files present
    // in the given directory
    File[] files = f.listFiles();

    System.out.println("Files are:");

    // Display the names of the files
    for (int i = 0; i < files.length; i++) {
        System.out.println(files[i].getName());
    }
}
catch (Exception e) {
    System.err.println(e.getMessage());
}
}

    
    }

