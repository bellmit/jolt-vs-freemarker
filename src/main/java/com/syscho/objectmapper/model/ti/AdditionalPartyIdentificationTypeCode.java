
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdditionalPartyIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalPartyIdentificationTypeCode {

    BUYER_ASSIGNED_IDENTIFIER_FOR_A_PARTY("BUYER_ASSIGNED_IDENTIFIER_FOR_A_PARTY"),
    CASHSSP("CASHSSP"),
    DEA_DRUG_ENFORCEMENT_AGENCY("DEA_DRUG_ENFORCEMENT_AGENCY"),
    DUNS("DUNS"),
    DUNS_PLUS_FOUR("DUNS_PLUS_FOUR"),
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
    HIN_CANADIAN_HEALTHCARE_IDENTIFICATION_NUMBER("HIN_CANADIAN_HEALTHCARE_IDENTIFICATION_NUMBER"),
    PARTITA_IVA("PARTITA_IVA"),
    SCAC("SCAC"),
    SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY("SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY"),
    SIRET("SIRET"),
    TD_LINK_TRADE_DIMENSIONS("TD_LINK_TRADE_DIMENSIONS"),
    UCC_COMMUNICATION_IDENTIFICATION("UCC_COMMUNICATION_IDENTIFICATION"),
    UN_LOCATION_CODE("UN_LOCATION_CODE"),
    UNKNOWN("UNKNOWN"),
    USDA_ESTABLISHMENT_NUMBER("USDA_ESTABLISHMENT_NUMBER"),
    GLN("GLN"),
    COMPANY_REGISTRATION("COMPANY_REGISTRATION"),
    VAT_REGISTRATION("VAT_REGISTRATION"),
    EDI_ADDRESS("EDI_ADDRESS"),
    LAST_MILE_CARRIER("LAST_MILE_CARRIER");
    private final String value;
    private final static Map<String, AdditionalPartyIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalPartyIdentificationTypeCode>();

    static {
        for (AdditionalPartyIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalPartyIdentificationTypeCode(String value) {
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
    public static AdditionalPartyIdentificationTypeCode fromValue(String value) {
        AdditionalPartyIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
