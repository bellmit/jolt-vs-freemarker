
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdditionalTradeItemIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalTradeItemIdentificationTypeCode {

    ARTG_ID("ARTG_ID"),
    AU_PROSTHESES_REBATE_CODE("AU_PROSTHESES_REBATE_CODE"),
    BUYER_ASSIGNED("BUYER_ASSIGNED"),
    DIN("DIN"),
    DIN_HM("DIN_HM"),
    DISTRIBUTOR_ASSIGNED("DISTRIBUTOR_ASSIGNED"),
    EPD("EPD"),
    FDA_NDC_10("FDA_NDC_10"),
    FDA_NDC_11("FDA_NDC_11"),
    FOR_INTERNAL_USE_1("FOR_INTERNAL_USE_1"),
    FOR_INTERNAL_USE_10("FOR_INTERNAL_USE_10"),
    FOR_INTERNAL_USE_11("FOR_INTERNAL_USE_11"),
    FOR_INTERNAL_USE_12("FOR_INTERNAL_USE_12"),
    FOR_INTERNAL_USE_13("FOR_INTERNAL_USE_13"),
    FOR_INTERNAL_USE_14("FOR_INTERNAL_USE_14"),
    FOR_INTERNAL_USE_15("FOR_INTERNAL_USE_15"),
    FOR_INTERNAL_USE_16("FOR_INTERNAL_USE_16"),
    FOR_INTERNAL_USE_17("FOR_INTERNAL_USE_17"),
    FOR_INTERNAL_USE_18("FOR_INTERNAL_USE_18"),
    FOR_INTERNAL_USE_19("FOR_INTERNAL_USE_19"),
    FOR_INTERNAL_USE_2("FOR_INTERNAL_USE_2"),
    FOR_INTERNAL_USE_20("FOR_INTERNAL_USE_20"),
    FOR_INTERNAL_USE_3("FOR_INTERNAL_USE_3"),
    FOR_INTERNAL_USE_4("FOR_INTERNAL_USE_4"),
    FOR_INTERNAL_USE_5("FOR_INTERNAL_USE_5"),
    FOR_INTERNAL_USE_6("FOR_INTERNAL_USE_6"),
    FOR_INTERNAL_USE_7("FOR_INTERNAL_USE_7"),
    FOR_INTERNAL_USE_8("FOR_INTERNAL_USE_8"),
    FOR_INTERNAL_USE_9("FOR_INTERNAL_USE_9"),
    GTIN_12("GTIN_12"),
    GTIN_13("GTIN_13"),
    GTIN_14("GTIN_14"),
    GTIN_8("GTIN_8"),
    HIBC("HIBC"),
    INDUSTRY_ASSIGNED("INDUSTRY_ASSIGNED"),
    INVIMA("INVIMA"),
    ISBN_NUMBER("ISBN_NUMBER"),
    ISSN_NUMBER("ISSN_NUMBER"),
    LOTTERY_GAME_NUMBER("LOTTERY_GAME_NUMBER"),
    LOTTERY_PACK_BOOK_NUMBER("LOTTERY_PACK_BOOK_NUMBER"),
    MANUFACTURER_PART_NUMBER("MANUFACTURER_PART_NUMBER"),
    MDL("MDL"),
    MODEL_NUMBER("MODEL_NUMBER"),
    NABCA_PRODUCT_CODE("NABCA_PRODUCT_CODE"),
    NAN("NAN"),
    NPN("NPN"),
    NSN("NSN"),
    NUMERO_RDN("NUMERO_RDN"),
    PLU("PLU"),
    RVG("RVG"),
    RVH("RVH"),
    SAN_4("SAN_4"),
    SUPPLIER_ASSIGNED("SUPPLIER_ASSIGNED"),
    Z_INDEX("Z_INDEX"),
    NDC("NDC"),
    SELLER_ASSIGNED("SELLER_ASSIGNED"),
    EAN("EAN"),
    ORIGINAL_ITEM("ORIGINAL_ITEM");
    private final String value;
    private final static Map<String, AdditionalTradeItemIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalTradeItemIdentificationTypeCode>();

    static {
        for (AdditionalTradeItemIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalTradeItemIdentificationTypeCode(String value) {
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
    public static AdditionalTradeItemIdentificationTypeCode fromValue(String value) {
        AdditionalTradeItemIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
