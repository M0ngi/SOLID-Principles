package com.directi.training.dip.exercise_refacto;

import java.io.IOException;

import com.directi.training.dip.exercise_refacto.custom_io.CustomFileReader;
import com.directi.training.dip.exercise_refacto.custom_io.CustomFileWriter;
import com.directi.training.dip.exercise_refacto.custom_io.DatabaseWriter;
import com.directi.training.dip.exercise_refacto.custom_io.NetworkReader;
import com.directi.training.dip.exercise_refacto.encoding.Base64EncoderModule;
import com.directi.training.dip.exercise_refacto.encoding.IEncoder;

public class EncodingModuleClient {
    private static String beforeEncryptionFile = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
    private static String afterEncryptionFile = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";

    public static void main(String[] args) throws IOException {
        IEncoder encodingModule = new Base64EncoderModule();

        CustomFileReader fileReader = new CustomFileReader(beforeEncryptionFile);
        CustomFileWriter fileWriter = new CustomFileWriter(afterEncryptionFile);

        encodingModule.encode(fileReader, fileWriter);

        NetworkReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        DatabaseWriter dbWriter = new DatabaseWriter();

        encodingModule.encode(networkReader, dbWriter);
    }
}
