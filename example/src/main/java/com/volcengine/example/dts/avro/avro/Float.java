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
public class Float extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5531771486850784145L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Float\",\"namespace\":\"org.example.avro\",\"fields\":[{\"name\":\"value\",\"type\":\"double\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Float> ENCODER =
      new BinaryMessageEncoder<Float>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Float> DECODER =
      new BinaryMessageDecoder<Float>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Float> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Float> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Float>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Float to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Float from a ByteBuffer. */
  public static Float fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public double value;
  @Deprecated public int precision;
  @Deprecated public int scale;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Float() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param precision The new value for precision
   * @param scale The new value for scale
   */
  public Float(java.lang.Double value, java.lang.Integer precision, java.lang.Integer scale) {
    this.value = value;
    this.precision = precision;
    this.scale = scale;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return precision;
    case 2: return scale;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Double)value$; break;
    case 1: precision = (java.lang.Integer)value$; break;
    case 2: scale = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Double value) {
    this.value = value;
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
   * Gets the value of the 'scale' field.
   * @return The value of the 'scale' field.
   */
  public java.lang.Integer getScale() {
    return scale;
  }

  /**
   * Sets the value of the 'scale' field.
   * @param value the value to set.
   */
  public void setScale(java.lang.Integer value) {
    this.scale = value;
  }

  /**
   * Creates a new Float RecordBuilder.
   * @return A new Float RecordBuilder
   */
  public static org.example.avro.Float.Builder newBuilder() {
    return new org.example.avro.Float.Builder();
  }

  /**
   * Creates a new Float RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Float RecordBuilder
   */
  public static org.example.avro.Float.Builder newBuilder(org.example.avro.Float.Builder other) {
    return new org.example.avro.Float.Builder(other);
  }

  /**
   * Creates a new Float RecordBuilder by copying an existing Float instance.
   * @param other The existing instance to copy.
   * @return A new Float RecordBuilder
   */
  public static org.example.avro.Float.Builder newBuilder(org.example.avro.Float other) {
    return new org.example.avro.Float.Builder(other);
  }

  /**
   * RecordBuilder for Float instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Float>
    implements org.apache.avro.data.RecordBuilder<Float> {

    private double value;
    private int precision;
    private int scale;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.example.avro.Float.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.precision)) {
        this.precision = data().deepCopy(fields()[1].schema(), other.precision);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.scale)) {
        this.scale = data().deepCopy(fields()[2].schema(), other.scale);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Float instance
     * @param other The existing instance to copy.
     */
    private Builder(org.example.avro.Float other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.precision)) {
        this.precision = data().deepCopy(fields()[1].schema(), other.precision);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.scale)) {
        this.scale = data().deepCopy(fields()[2].schema(), other.scale);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Double getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public org.example.avro.Float.Builder setValue(double value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public org.example.avro.Float.Builder clearValue() {
      fieldSetFlags()[0] = false;
      return this;
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
    public org.example.avro.Float.Builder setPrecision(int value) {
      validate(fields()[1], value);
      this.precision = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'precision' field has been set.
      * @return True if the 'precision' field has been set, false otherwise.
      */
    public boolean hasPrecision() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'precision' field.
      * @return This builder.
      */
    public org.example.avro.Float.Builder clearPrecision() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'scale' field.
      * @return The value.
      */
    public java.lang.Integer getScale() {
      return scale;
    }

    /**
      * Sets the value of the 'scale' field.
      * @param value The value of 'scale'.
      * @return This builder.
      */
    public org.example.avro.Float.Builder setScale(int value) {
      validate(fields()[2], value);
      this.scale = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'scale' field has been set.
      * @return True if the 'scale' field has been set, false otherwise.
      */
    public boolean hasScale() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'scale' field.
      * @return This builder.
      */
    public org.example.avro.Float.Builder clearScale() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float build() {
      try {
        Float record = new Float();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Double) defaultValue(fields()[0]);
        record.precision = fieldSetFlags()[1] ? this.precision : (java.lang.Integer) defaultValue(fields()[1]);
        record.scale = fieldSetFlags()[2] ? this.scale : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Float>
    WRITER$ = (org.apache.avro.io.DatumWriter<Float>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Float>
    READER$ = (org.apache.avro.io.DatumReader<Float>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
