package com.directi.training.dip.exercise_refacto.custom_io;

import java.io.IOException;

public interface IReader {
    public String read() throws IOException;

    public void close() throws IOException;
}
