package com.readlearncode.object.lesson2;

import org.junit.Test;

import javax.json.*;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ObjectExample2Test {

    @Test
    public void givenJsonDateInFlatFile_readsDataIntoJsonObject() throws Exception {

        // Arrange
        ObjectExample2 objectExample2 = new ObjectExample2();

        // Act
        JsonObject jsonObject = objectExample2.loadJsonObject();

        // Assert
        assertThat(jsonObject.getValueType()).isEqualTo(JsonValue.ValueType.OBJECT);
    }












    @Test
    public void givenJsonArrayDataInFlatFile_readsDataIntoJsonStructure() throws Exception {

        // Arrange
        ObjectExample2 objectExample2 = new ObjectExample2();

        // Act
        JsonStructure jsonStructure = objectExample2.loadJsonStructure();

        // Assert
        assertThat(jsonStructure.getValueType()).isEqualTo(JsonValue.ValueType.ARRAY);
    }

}