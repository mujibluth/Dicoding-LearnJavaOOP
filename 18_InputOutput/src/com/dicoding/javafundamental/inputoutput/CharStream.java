package com.dicoding.javafundamental.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("/Users/abdulmujiburrohmanluthfi/Downloads/ReadStream.rtf");
            out = new FileWriter("/Users/abdulmujiburrohmanluthfi/Downloads/WriteStream.rtf");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("Read file berhasil"); // tambahan aku sendiri, haha

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage()); // tambahan aku sendiri, haha
            
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
