package org.example.Homeworks.Glab303_13_2NIO;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        //Input files
        String[] inputFiles = {"C:\\Users\\oscar\\Development\\Java rtt62 Ely\\JavaClaswork\\file1.txt",
                "C:\\Users\\oscar\\Development\\Java rtt62 Ely\\JavaClaswork\\file2.txt"};

        //Files contents will be written in these files
        String outputFile = "C:/Downloads/OutputExampleTwo.txt";
        //Get channel for output file

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();
        for (int i = 0; i < inputFiles.length; i++) {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finally close the target channel
    }
}
