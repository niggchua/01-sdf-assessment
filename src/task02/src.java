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
    public static void main( String[] args ) throws Exception {

        public boolean isDirectory()
        

        File firstFile = new File(arg[0]);


        File[] listOfFiles = new File[]


        if(firstFile.isDirectory()){
            for (File secondFile : firstFile.listFiles()){

                if((secondFile.isDirectory)){

                    int i = 0

                    for (File textFiles : secondFile.listFiles()){

                        listOfFiles[i] = textFiles;
                        //System.out.println(listOfFiles);
                        i++
                    }


                } else {
                    break;
                        } 



            } 
        } else 
            break;


            for (File textFile : listOfFiles){

                 Reader r = new FileReader(textFile);
            BufferedReader br = new BufferedReader(r);
    
            Map<String, Integer> wordCount = new HashMap<>();

            
    
            br.lines()
                .map(line -> line.trim().toLowerCase().replaceAll("\\p{Punct}", ""))
                // String -> String[]
                .map(line -> line.split("\\s+"))
                .flatMap(words -> Arrays.asList(words).stream())
                .filter(word1 -> (word.trim().length() > 0))
                .filter(word1 -> !Constants.STOPWORDS_SET.contains(word))
                .forEach(word1 -> {
                    int c = wordCount.computeIfAbsent(word, w -> 0);
                    wordCount.put(word1, c + 1);
                }}

                br.close();

            for (word1 : wordCount){

                Reader r = new FileReader(textFile);
            BufferedReader br = new BufferedReader(r);

            Map<String, Integer> nextWord = new HashMap<>();

    
            br.lines()
                .map(line -> line.trim().toLowerCase().replaceAll("\\p{Punct}", ""))
                // String -> String[]
                .map(line -> line.split("\\s+"))
                .flatMap(words -> Arrays.asList(words).stream())
                .filter(word -> (word.trim().length() > 0))
                .forEach(word -> {
                    if word1 = word;
                    int d = wordCount.next(word, w -> 0);
                    nextWord.put(word, d + 1);


            

            

                
            }
                    
                    



            }

        /* 

            Reader r = new FileReader(textFile);
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

            }



        }




            /* 



            }









        }

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






    }
    {


        /* 
        Path p = Paths.get(args[0]);
        File f = p.toFile();

        String fileName = f.getName();
        long fileSize = f.length();

        OutputStream os = sock.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);

            // Send the file metadata
            dos.writeUTF(fileName);
            dos.writeLong(fileSize);
            dos.flush();
        
    }
}

    File folder = new File();
    File dir = new File("");
    File file = new File("");

    int count = 0;
    allDocs = folder.listFiles();
    int fileCount = 0;
    int dirCount = 0;
    System.out.println("Displaying contents of directory...");
    while (count < allDocs.length){
        System.out.println("Found: " + allDocs[count]);
        count++;
    }

    }
    }


        

        File f = null;
        File[] paths;

        paths[0] = 


        paths = f.listFiles();

        for(File path:paths) {
            System.out.println(path);

        }
    }
}





        File textFiles = new File;

        List<textFiles> listOfTextFiles = new List<textFiles>

        File[] listFiles()

        public static DirectoryStream<src\task02\texts> newDirectoryStream(src\task02\texts dir) throws IOException







       




     o	Socket s = ss.accept()
o	Input Stream is = s.getInputStream
o	BufferedInputStream bis = new BufferedInputStream
o	ZipInputStream zis = new Zis(bis)
o	// then the server starts reading the zip file
	Find out what the client does to format what they’ve sent to you, then you reverse it for the server to read



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
*/
