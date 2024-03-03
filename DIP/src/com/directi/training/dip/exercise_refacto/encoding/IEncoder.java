package com.directi.training.dip.exercise_refacto.encoding;

import java.io.IOException;

import com.directi.training.dip.exercise_refacto.custom_io.IReader;
import com.directi.training.dip.exercise_refacto.custom_io.IWriter;

public interface IEncoder {
    public void encode(IReader reader, IWriter writer) throws IOException;
}
