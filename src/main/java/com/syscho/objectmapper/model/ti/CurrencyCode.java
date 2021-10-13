
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CurrencyCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CurrencyCode {

    AFN("AFN"),
    EUR("EUR"),
    ALL("ALL"),
    DZD("DZD"),
    USD("USD"),
    AOA("AOA"),
    XCD("XCD"),
    ARS("ARS"),
    AMD("AMD"),
    AWG("AWG"),
    AUD("AUD"),
    AZN("AZN"),
    BSD("BSD"),
    BHD("BHD"),
    BDT("BDT"),
    BBD("BBD"),
    BYR("BYR"),
    BZD("BZD"),
    XOF("XOF"),
    BMD("BMD"),
    BTN("BTN"),
    INR("INR"),
    BOB("BOB"),
    BOV("BOV"),
    BAM("BAM"),
    BWP("BWP"),
    NOK("NOK"),
    BRL("BRL"),
    BND("BND"),
    BGN("BGN"),
    BIF("BIF"),
    KHR("KHR"),
    XAF("XAF"),
    CAD("CAD"),
    CVE("CVE"),
    KYD("KYD"),
    CLF("CLF"),
    CLP("CLP"),
    CNY("CNY"),
    COP("COP"),
    COU("COU"),
    KMF("KMF"),
    CDF("CDF"),
    NZD("NZD"),
    CRC("CRC"),
    HRK("HRK"),
    CUC("CUC"),
    CUP("CUP"),
    ANG("ANG"),
    CZK("CZK"),
    DKK("DKK"),
    DJF("DJF"),
    DOP("DOP"),
    EGP("EGP"),
    SVC("SVC"),
    ERN("ERN"),
    ETB("ETB"),
    FKP("FKP"),
    FJD("FJD"),
    XPF("XPF"),
    GMD("GMD"),
    GEL("GEL"),
    GHS("GHS"),
    GIP("GIP"),
    GTQ("GTQ"),
    GBP("GBP"),
    GNF("GNF"),
    GYD("GYD"),
    HTG("HTG"),
    HNL("HNL"),
    HKD("HKD"),
    HUF("HUF"),
    ISK("ISK"),
    IDR("IDR"),
    XDR("XDR"),
    IRR("IRR"),
    IQD("IQD"),
    ILS("ILS"),
    JMD("JMD"),
    JPY("JPY"),
    JOD("JOD"),
    KZT("KZT"),
    KES("KES"),
    KPW("KPW"),
    KRW("KRW"),
    KWD("KWD"),
    KGS("KGS"),
    LAK("LAK"),
    LBP("LBP"),
    LSL("LSL"),
    ZAR("ZAR"),
    LRD("LRD"),
    LYD("LYD"),
    CHF("CHF"),
    MOP("MOP"),
    MKD("MKD"),
    MGA("MGA"),
    MWK("MWK"),
    MYR("MYR"),
    MVR("MVR"),
    MRO("MRO"),
    MUR("MUR"),
    XUA("XUA"),
    MXN("MXN"),
    MXV("MXV"),
    MDL("MDL"),
    MNT("MNT"),
    MAD("MAD"),
    MZN("MZN"),
    MMK("MMK"),
    NAD("NAD"),
    NPR("NPR"),
    NIO("NIO"),
    NGN("NGN"),
    OMR("OMR"),
    PKR("PKR"),
    PAB("PAB"),
    PGK("PGK"),
    PYG("PYG"),
    PEN("PEN"),
    PHP("PHP"),
    PLN("PLN"),
    QAR("QAR"),
    RON("RON"),
    RUB("RUB"),
    RWF("RWF"),
    SHP("SHP"),
    WST("WST"),
    STD("STD"),
    SAR("SAR"),
    RSD("RSD"),
    SCR("SCR"),
    SLL("SLL"),
    SGD("SGD"),
    XSU("XSU"),
    SBD("SBD"),
    SOS("SOS"),
    SSP("SSP"),
    LKR("LKR"),
    SDG("SDG"),
    SRD("SRD"),
    SZL("SZL"),
    SEK("SEK"),
    CHE("CHE"),
    CHW("CHW"),
    SYP("SYP"),
    TWD("TWD"),
    TJS("TJS"),
    TZS("TZS"),
    THB("THB"),
    TOP("TOP"),
    TTD("TTD"),
    TND("TND"),
    TRY("TRY"),
    TMT("TMT"),
    UGX("UGX"),
    UAH("UAH"),
    AED("AED"),
    USN("USN"),
    UYI("UYI"),
    UYU("UYU"),
    UZS("UZS"),
    VUV("VUV"),
    VEF("VEF"),
    VND("VND"),
    YER("YER"),
    ZMW("ZMW"),
    ZWL("ZWL"),
    XBA("XBA"),
    XBB("XBB"),
    XBC("XBC"),
    XBD("XBD"),
    XTS("XTS"),
    XXX("XXX"),
    XAU("XAU"),
    XPD("XPD"),
    XPT("XPT"),
    XAG("XAG");
    private final String value;
    private final static Map<String, CurrencyCode> CONSTANTS = new HashMap<String, CurrencyCode>();

    static {
        for (CurrencyCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CurrencyCode(String value) {
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
    public static CurrencyCode fromValue(String value) {
        CurrencyCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
