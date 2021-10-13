
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MeasurementUnitCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum MeasurementUnitCode {

    MGM("MGM"),
    GRM("GRM"),
    KGM("KGM"),
    TNE("TNE"),
    GRN("GRN"),
    LBR("LBR"),
    LTN("LTN"),
    ONZ("ONZ"),
    MMT("MMT"),
    CMT("CMT"),
    MTR("MTR"),
    KMT("KMT"),
    INH("INH"),
    FOT("FOT"),
    YRD("YRD"),
    SMI("SMI"),
    INK("INK"),
    FTK("FTK"),
    YDK("YDK"),
    ACR("ACR"),
    MIK("MIK"),
    CMK("CMK"),
    MTK("MTK"),
    KMK("KMK"),
    CMQ("CMQ"),
    OZI("OZI"),
    LTR("LTR"),
    MTQ("MTQ"),
    INQ("INQ"),
    FTQ("FTQ"),
    YDQ("YDQ"),
    PT("PT"),
    QT("QT"),
    GLI("GLI"),
    EA("EA"),
    DPC("DPC"),
    CS("CS"),
    PF("PF"),
    PK("PK"),
    HAP("HAP"),
    LR("LR"),
    BO("BO"),
    CA("CA");
    private final String value;
    private final static Map<String, MeasurementUnitCode> CONSTANTS = new HashMap<String, MeasurementUnitCode>();

    static {
        for (MeasurementUnitCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MeasurementUnitCode(String value) {
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
    public static MeasurementUnitCode fromValue(String value) {
        MeasurementUnitCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
