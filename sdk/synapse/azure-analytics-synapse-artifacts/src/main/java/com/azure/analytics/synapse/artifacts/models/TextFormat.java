// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The data stored in text format. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TextFormat")
@Fluent
public final class TextFormat extends DatasetStorageFormat {
    /*
     * The column delimiter. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "columnDelimiter")
    private Object columnDelimiter;

    /*
     * The row delimiter. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "rowDelimiter")
    private Object rowDelimiter;

    /*
     * The escape character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "escapeChar")
    private Object escapeChar;

    /*
     * The quote character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "quoteChar")
    private Object quoteChar;

    /*
     * The null value string. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "nullValue")
    private Object nullValue;

    /*
     * The code page name of the preferred encoding. If miss, the default value
     * is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to
     * the ΓÇ£NameΓÇ¥ column of the table in the following link to set
     * supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "encodingName")
    private Object encodingName;

    /*
     * Treat empty column values in the text file as null. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "treatEmptyAsNull")
    private Object treatEmptyAsNull;

    /*
     * The number of lines/rows to be skipped when parsing text files. The
     * default value is 0. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "skipLineCount")
    private Object skipLineCount;

    /*
     * When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "firstRowAsHeader")
    private Object firstRowAsHeader;

    /**
     * Get the columnDelimiter property: The column delimiter. Type: string (or Expression with resultType string).
     *
     * @return the columnDelimiter value.
     */
    public Object getColumnDelimiter() {
        return this.columnDelimiter;
    }

    /**
     * Set the columnDelimiter property: The column delimiter. Type: string (or Expression with resultType string).
     *
     * @param columnDelimiter the columnDelimiter value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setColumnDelimiter(Object columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    /**
     * Get the rowDelimiter property: The row delimiter. Type: string (or Expression with resultType string).
     *
     * @return the rowDelimiter value.
     */
    public Object getRowDelimiter() {
        return this.rowDelimiter;
    }

    /**
     * Set the rowDelimiter property: The row delimiter. Type: string (or Expression with resultType string).
     *
     * @param rowDelimiter the rowDelimiter value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setRowDelimiter(Object rowDelimiter) {
        this.rowDelimiter = rowDelimiter;
        return this;
    }

    /**
     * Get the escapeChar property: The escape character. Type: string (or Expression with resultType string).
     *
     * @return the escapeChar value.
     */
    public Object getEscapeChar() {
        return this.escapeChar;
    }

    /**
     * Set the escapeChar property: The escape character. Type: string (or Expression with resultType string).
     *
     * @param escapeChar the escapeChar value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setEscapeChar(Object escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * Get the quoteChar property: The quote character. Type: string (or Expression with resultType string).
     *
     * @return the quoteChar value.
     */
    public Object getQuoteChar() {
        return this.quoteChar;
    }

    /**
     * Set the quoteChar property: The quote character. Type: string (or Expression with resultType string).
     *
     * @param quoteChar the quoteChar value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setQuoteChar(Object quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * Get the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value.
     */
    public Object getNullValue() {
        return this.nullValue;
    }

    /**
     * Set the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If miss, the default value is
     * ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the
     * following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     *
     * @return the encodingName value.
     */
    public Object getEncodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If miss, the default value is
     * ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the
     * following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the treatEmptyAsNull property: Treat empty column values in the text file as null. The default value is true.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the treatEmptyAsNull value.
     */
    public Object getTreatEmptyAsNull() {
        return this.treatEmptyAsNull;
    }

    /**
     * Set the treatEmptyAsNull property: Treat empty column values in the text file as null. The default value is true.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param treatEmptyAsNull the treatEmptyAsNull value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setTreatEmptyAsNull(Object treatEmptyAsNull) {
        this.treatEmptyAsNull = treatEmptyAsNull;
        return this;
    }

    /**
     * Get the skipLineCount property: The number of lines/rows to be skipped when parsing text files. The default value
     * is 0. Type: integer (or Expression with resultType integer).
     *
     * @return the skipLineCount value.
     */
    public Object getSkipLineCount() {
        return this.skipLineCount;
    }

    /**
     * Set the skipLineCount property: The number of lines/rows to be skipped when parsing text files. The default value
     * is 0. Type: integer (or Expression with resultType integer).
     *
     * @param skipLineCount the skipLineCount value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setSkipLineCount(Object skipLineCount) {
        this.skipLineCount = skipLineCount;
        return this;
    }

    /**
     * Get the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the firstRowAsHeader value.
     */
    public Object getFirstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param firstRowAsHeader the firstRowAsHeader value to set.
     * @return the TextFormat object itself.
     */
    public TextFormat setFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextFormat setSerializer(Object serializer) {
        super.setSerializer(serializer);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextFormat setDeserializer(Object deserializer) {
        super.setDeserializer(deserializer);
        return this;
    }
}
