package com.directi.training.dip.exercise_refacto.custom_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader implements IReader {
    private BufferedReader _reader;

    public CustomFileReader(String filename) throws FileNotFoundException {
        _reader = new BufferedReader(new FileReader(filename));
    }

    /**
     * Return the file's content
     */
    @Override
    public String read() throws IOException {
        StringBuilder buffer = new StringBuilder();
        String aLine;
        while ((aLine = _reader.readLine()) != null) {
            buffer.append(aLine);
        }
        return buffer.toString();
    }

    /**
     * Closes buffer.
     */
    @Override
    public void close() throws IOException {
        _reader.close();
    }
}
