// automatically generated by the FlatBuffers compiler, do not modify

package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * File specific information.
 * Symbols declared within a file may be recovered by iterating over all
 * symbols and examining the `declaration_file` field.
 */
@SuppressWarnings("unused")
public final class SchemaFile extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static SchemaFile getRootAsSchemaFile(ByteBuffer _bb) { return getRootAsSchemaFile(_bb, new SchemaFile()); }
  public static SchemaFile getRootAsSchemaFile(ByteBuffer _bb, SchemaFile obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SchemaFile __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Filename, relative to project root.
   */
  public String filename() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filenameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filenameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * Names of included files, relative to project root.
   */
  public String includedFilenames(int j) { int o = __offset(6); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int includedFilenamesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public StringVector includedFilenamesVector() { return includedFilenamesVector(new StringVector()); }
  public StringVector includedFilenamesVector(StringVector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSchemaFile(FlatBufferBuilder builder,
      int filenameOffset,
      int includedFilenamesOffset) {
    builder.startTable(2);
    SchemaFile.addIncludedFilenames(builder, includedFilenamesOffset);
    SchemaFile.addFilename(builder, filenameOffset);
    return SchemaFile.endSchemaFile(builder);
  }

  public static void startSchemaFile(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addFilename(FlatBufferBuilder builder, int filenameOffset) { builder.addOffset(filenameOffset); builder.slot(0); }
  public static void addIncludedFilenames(FlatBufferBuilder builder, int includedFilenamesOffset) { builder.addOffset(1, includedFilenamesOffset, 0); }
  public static int createIncludedFilenamesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIncludedFilenamesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSchemaFile(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // filename
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static SchemaFile __lookup_by_key(SchemaFile obj, int vectorLocation, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    int span = bb.getInt(vectorLocation - 4);
    int start = 0;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.capacity() - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return (obj == null ? new SchemaFile() : obj).__assign(tableOffset, bb);
      }
    }
    return null;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SchemaFile get(int j) { return get(new SchemaFile(), j); }
    public SchemaFile get(SchemaFile obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
    public SchemaFile getByKey(String key) {  return __lookup_by_key(null, __vector(), key, bb); }
    public SchemaFile getByKey(SchemaFile obj, String key) {  return __lookup_by_key(obj, __vector(), key, bb); }
  }
}
