package com.directi.training.dip.exercise_refacto.custom_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements IReader {
    private URL _url;
    private InputStreamReader _reader;

    public NetworkReader(String proto, String host, String path) throws MalformedURLException, IOException {
        _url = new URL(proto, host, path);
        _reader = new InputStreamReader(_url.openStream());
    }

    @Override
    public String read() throws IOException {
        StringBuilder inputString = new StringBuilder();
        int c;
        while ((c = _reader.read()) != -1) {
            inputString.append((char) c);
        }
        return inputString.toString();
    }

    /**
     * Closes buffer.
     */
    @Override
    public void close() throws IOException {
        _reader.close();
    }
}