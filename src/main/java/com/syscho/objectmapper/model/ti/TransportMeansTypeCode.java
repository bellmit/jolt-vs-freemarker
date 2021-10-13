
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TransportMeansTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportMeansTypeCode {

    _1("1"),
    _100("100"),
    _101("101"),
    _102("102"),
    _103("103"),
    _104("104"),
    _106("106"),
    _10_E("10E"),
    _11_E("11E"),
    _12("12"),
    _12_E("12E"),
    _13("13"),
    _13_E("13E"),
    _14_E("14E"),
    _15_E("15E"),
    _16_E("16E"),
    _17_E("17E"),
    _18_E("18E"),
    _19("19"),
    _19_E("19E"),
    _20("20"),
    _20_E("20E"),
    _21("21"),
    _21_E("21E"),
    _22("22"),
    _22_E("22E"),
    _23("23"),
    _25("25"),
    _26("26"),
    _27_E("27E"),
    _28("28"),
    _28_E("28E"),
    _29("29"),
    _30("30"),
    _31("31"),
    _32("32"),
    _32_E("32E"),
    _33("33"),
    _33_E("33E"),
    _34_E("34E"),
    _35("35"),
    _37_E("37E"),
    _38_E("38E"),
    _39_E("39E"),
    _40("40"),
    _41("41"),
    _41_E("41E"),
    _42("42"),
    _43("43"),
    _44("44"),
    _44_E("44E"),
    _45("45"),
    _45_E("45E"),
    _46("46"),
    _46_E("46E"),
    _47("47"),
    _48("48"),
    _50_E("50E"),
    _51_E("51E"),
    _53_E("53E"),
    _54_E("54E"),
    _55_E("55E"),
    _56_E("56E"),
    _57_E("57E"),
    _58_E("58E"),
    _59_E("59E"),
    _73("73"),
    _74("74"),
    _77("77"),
    _77_E("77E"),
    _78("78"),
    _78_E("78E"),
    _79("79"),
    _79_E("79E"),
    _80("80"),
    _81("81"),
    _82("82"),
    _83("83"),
    _84("84"),
    _85("85"),
    _86("86"),
    _87("87"),
    _88("88"),
    _89("89"),
    _9("9"),
    _90("90"),
    _91("91"),
    _92("92"),
    _93("93"),
    _93_E("93E"),
    _94("94"),
    _95("95"),
    _95_E("95E"),
    _96("96"),
    _96_E("96E"),
    _97("97"),
    _97_E("97E"),
    _98("98"),
    _98_E("98E"),
    _99("99"),
    _99_E("99E"),
    X_01("X01"),
    X_02("X02"),
    X_15("X15"),
    X_3("X3"),
    X_4("X4");
    private final String value;
    private final static Map<String, TransportMeansTypeCode> CONSTANTS = new HashMap<String, TransportMeansTypeCode>();

    static {
        for (TransportMeansTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportMeansTypeCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TransportMeansTypeCode fromValue(String value) {
        TransportMeansTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
