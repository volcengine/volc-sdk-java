/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.example.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Integer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8593585385627053233L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Integer\",\"namespace\":\"org.example.avro\",\"fields\":[{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"value\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Integer> ENCODER =
      new BinaryMessageEncoder<Integer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Integer> DECODER =
      new BinaryMessageDecoder<Integer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Integer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Integer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Integer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Integer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Integer from a ByteBuffer. */
  public static Integer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int precision;
  @Deprecated public java.lang.CharSequence value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Integer() {}

  /**
   * All-args constructor.
   * @param precision The new value for precision
   * @param value The new value for value
   */
  public Integer(java.lang.Integer precision, java.lang.CharSequence value) {
    this.precision = precision;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return precision;
    case 1: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: precision = (java.lang.Integer)value$; break;
    case 1: value = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'precision' field.
   * @return The value of the 'precision' field.
   */
  public java.lang.Integer getPrecision() {
    return precision;
  }

  /**
   * Sets the value of the 'precision' field.
   * @param value the value to set.
   */
  public void setPrecision(java.lang.Integer value) {
    this.precision = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.CharSequence getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.CharSequence value) {
    this.value = value;
  }

  /**
   * Creates a new Integer RecordBuilder.
   * @return A new Integer RecordBuilder
   */
  public static org.example.avro.Integer.Builder newBuilder() {
    return new org.example.avro.Integer.Builder();
  }

  /**
   * Creates a new Integer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Integer RecordBuilder
   */
  public static org.example.avro.Integer.Builder newBuilder(org.example.avro.Integer.Builder other) {
    return new org.example.avro.Integer.Builder(other);
  }

  /**
   * Creates a new Integer RecordBuilder by copying an existing Integer instance.
   * @param other The existing instance to copy.
   * @return A new Integer RecordBuilder
   */
  public static org.example.avro.Integer.Builder newBuilder(org.example.avro.Integer other) {
    return new org.example.avro.Integer.Builder(other);
  }

  /**
   * RecordBuilder for Integer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Integer>
    implements org.apache.avro.data.RecordBuilder<Integer> {

    private int precision;
    private java.lang.CharSequence value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.example.avro.Integer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.precision)) {
        this.precision = data().deepCopy(fields()[0].schema(), other.precision);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Integer instance
     * @param other The existing instance to copy.
     */
    private Builder(org.example.avro.Integer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.precision)) {
        this.precision = data().deepCopy(fields()[0].schema(), other.precision);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'precision' field.
      * @return The value.
      */
    public java.lang.Integer getPrecision() {
      return precision;
    }

    /**
      * Sets the value of the 'precision' field.
      * @param value The value of 'precision'.
      * @return This builder.
      */
    public org.example.avro.Integer.Builder setPrecision(int value) {
      validate(fields()[0], value);
      this.precision = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'precision' field has been set.
      * @return True if the 'precision' field has been set, false otherwise.
      */
    public boolean hasPrecision() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'precision' field.
      * @return This builder.
      */
    public org.example.avro.Integer.Builder clearPrecision() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.CharSequence getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public org.example.avro.Integer.Builder setValue(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public org.example.avro.Integer.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer build() {
      try {
        Integer record = new Integer();
        record.precision = fieldSetFlags()[0] ? this.precision : (java.lang.Integer) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Integer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Integer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Integer>
    READER$ = (org.apache.avro.io.DatumReader<Integer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
