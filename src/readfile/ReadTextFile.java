package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader("C:\\Users\\User1\\IdeaProjects\\java-coding-exam\\src\\readfile\\file-data");
        br = new BufferedReader(fr);
        String line = "";
        do {
             line = br.readLine();
            System.out.println(line);
        } while (line != null);
        List<String> array = new LinkedList<>();
        array.add(line);



    }

}
