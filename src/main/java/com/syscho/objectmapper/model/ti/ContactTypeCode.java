
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * ContactTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ContactTypeCode {

    AA("AA"),
    AD("AD"),
    AE("AE"),
    AM("AM"),
    AP("AP"),
    AR("AR"),
    BC("BC"),
    BJ("BJ"),
    BO("BO"),
    BVP("BVP"),
    BXA("BXA"),
    BYF("BYF"),
    BZL("BZL"),
    CB("CB"),
    CKE("CKE"),
    CP("CP"),
    CR("CR"),
    CXC("CXC"),
    CYC("CYC"),
    CZL("CZL"),
    DE("DE"),
    DI("DI"),
    DL("DL"),
    DMO("DMO"),
    DNR("DNR"),
    DOG("DOG"),
    DPP("DPP"),
    DQT("DQT"),
    DSU("DSU"),
    ED("ED"),
    GR("GR"),
    HE("HE"),
    HG("HG"),
    IC("IC"),
    LO("LO"),
    MGR("MGR"),
    NT("NT"),
    OC("OC"),
    PD("PD"),
    PM("PM"),
    PRC("PRC"),
    PRM("PRM"),
    PRR("PRR"),
    QC("QC"),
    SA("SA"),
    SD("SD"),
    SR("SR"),
    TA("TA"),
    TD("TD"),
    TR("TR"),
    WH("WH"),
    ZZZ("ZZZ"),
    _01("01"),
    _04("04"),
    _05("05"),
    _07("07"),
    _10("10"),
    _14("14"),
    _15("15"),
    _17("17"),
    _18("18"),
    _19("19"),
    _21("21"),
    _22("22"),
    _24("24"),
    _25("25"),
    _27("27"),
    _28("28"),
    _29("29"),
    _30("30"),
    _31("31"),
    _32("32"),
    _40("40"),
    _41("41"),
    _42("42"),
    OR("OR"),
    R_1("R1"),
    FA("FA"),
    PPU("PPU");
    private final String value;
    private final static Map<String, ContactTypeCode> CONSTANTS = new HashMap<String, ContactTypeCode>();

    static {
        for (ContactTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ContactTypeCode(String value) {
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
    public static ContactTypeCode fromValue(String value) {
        ContactTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
