package com.directi.training.dip.exercise_refacto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter implements IWriter {
    private BufferedWriter _writer;

    public CustomFileWriter(String filename) throws IOException {
        _writer = new BufferedWriter(new FileWriter(filename));
    }

    /**
     * Writes buffer to file
     */
    @Override
    public void write(String buff) throws IOException {
        _writer.write(buff);
    }

    /**
     * Closes buffer.
     */
    @Override
    public void close() throws IOException {
        _writer.close();
    }
}
