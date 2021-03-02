package br.intelipost.until;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.github.fge.jsonschema.examples.Utils;

public class JsonMessage {

	public static String getMessage(String mockName) throws IOException {
        try(InputStream is = Utils.class.getResourceAsStream(mockName)) {
            return IOUtils.toString(is);
        }
    }

}
