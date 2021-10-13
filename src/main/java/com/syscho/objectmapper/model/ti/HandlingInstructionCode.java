
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * HandlingInstructionCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum HandlingInstructionCode {

    _1("1"),
    _11("11"),
    _12("12"),
    _2("2"),
    _3("3"),
    AVI("AVI"),
    BIG("BIG"),
    CRU("CRU"),
    DAE("DAE"),
    DCE("DCE"),
    DDE("DDE"),
    DES("DES"),
    EAT("EAT"),
    FAC("FAC"),
    FRO("FRO"),
    FTD("FTD"),
    HEA("HEA"),
    HGA("HGA"),
    HWC("HWC"),
    LAB("LAB"),
    LYG("LYG"),
    MF("MF"),
    MOV("MOV"),
    NES("NES"),
    NSD("NSD"),
    NSH("NSH"),
    NSW("NSW"),
    NWP("NWP"),
    OHG("OHG"),
    PACE("PACE"),
    PER("PER"),
    PFS("PFS"),
    PIC("PIC"),
    PKS("PKS"),
    PSC("PSC"),
    RCY("RCY"),
    RES("RES"),
    RFG("RFG"),
    RFL("RFL"),
    RFS("RFS"),
    RPB("RPB"),
    SGU("SGU"),
    SLT("SLT"),
    SSN("SSN"),
    STR("STR"),
    TRD("TRD"),
    UNP("UNP"),
    UPR("UPR"),
    UST("UST"),
    VAL("VAL"),
    PAR("PAR"),
    TMC("TMC"),
    RLHD("RLHD"),
    RLHA("RLHA"),
    ARD("ARD"),
    ARA("ARA");
    private final String value;
    private final static Map<String, HandlingInstructionCode> CONSTANTS = new HashMap<String, HandlingInstructionCode>();

    static {
        for (HandlingInstructionCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    HandlingInstructionCode(String value) {
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
    public static HandlingInstructionCode fromValue(String value) {
        HandlingInstructionCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
