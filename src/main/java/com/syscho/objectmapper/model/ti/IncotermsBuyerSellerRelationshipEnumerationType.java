
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * IncotermsBuyerSellerRelationshipEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum IncotermsBuyerSellerRelationshipEnumerationType {

    INCO_BUYER_SELLER_NULL("INCO_BuyerSeller_NULL"),
    INCO_BUYER_SELLER_BUYER("INCO_BuyerSeller_BUYER"),
    INCO_BUYER_SELLER_SELLER("INCO_BuyerSeller_SELLER");
    private final String value;
    private final static Map<String, IncotermsBuyerSellerRelationshipEnumerationType> CONSTANTS = new HashMap<String, IncotermsBuyerSellerRelationshipEnumerationType>();

    static {
        for (IncotermsBuyerSellerRelationshipEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IncotermsBuyerSellerRelationshipEnumerationType(String value) {
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
    public static IncotermsBuyerSellerRelationshipEnumerationType fromValue(String value) {
        IncotermsBuyerSellerRelationshipEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
