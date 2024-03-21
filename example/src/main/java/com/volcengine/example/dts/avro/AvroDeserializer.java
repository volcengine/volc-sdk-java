package org.example;

import org.example.avro.Record;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;

public class AvroDeserializer {
    private final SpecificDatumReader<Record> reader = new SpecificDatumReader<Record>(Record.class);

    public AvroDeserializer() {
    }

    public Record deserialize(byte[] data) {
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        Record payload = null;
        try {
            payload = reader.read(null, decoder);
            return payload;
        }catch (Throwable ex) {
            System.out.println("deserialize record failed, err="+ex.getMessage());
            throw new RuntimeException(ex);
        }
    }
}
