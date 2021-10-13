
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FinancialDetails
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "billTo",
    "maximumInvoiceAmount",
    "creditTermsAccountReceivable",
    "creditTermsAccountPayable",
    "accountNumberPayable",
    "accountNumberReceivable",
    "minimumOrderLimit",
    "maximumOrderLimit",
    "maximumPositiveVariancePercentage",
    "maximumPositiveVarianceAmount",
    "maximumNegativeVariancePercentage",
    "maximumNegativeVarianceAmount",
    "paymentModeValidationType",
    "profitCenter",
    "isSurchargeApplicable",
    "surchargeVoucherCurrencyType",
    "surchargeOrDiscountPercent",
    "surchargeOrDiscountRate",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class FinancialDetails {

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    private PartyIdentificationType billTo;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInvoiceAmount")
    private AmountType maximumInvoiceAmount;
    /**
     * The method in which the customer should pay.
     * 
     */
    @JsonProperty("creditTermsAccountReceivable")
    @JsonPropertyDescription("The method in which the customer should pay.")
    private String creditTermsAccountReceivable;
    /**
     * The A/P terms for the party.
     * 
     */
    @JsonProperty("creditTermsAccountPayable")
    @JsonPropertyDescription("The A/P terms for the party.")
    private String creditTermsAccountPayable;
    /**
     * Text specifying the number of the payable account of the party.
     * 
     */
    @JsonProperty("accountNumberPayable")
    @JsonPropertyDescription("Text specifying the number of the payable account of the party.")
    private String accountNumberPayable;
    /**
     * Text specifying the number of the receivable account of the party.
     * 
     */
    @JsonProperty("accountNumberReceivable")
    @JsonPropertyDescription("Text specifying the number of the receivable account of the party.")
    private String accountNumberReceivable;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumOrderLimit")
    private AmountType minimumOrderLimit;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumOrderLimit")
    private AmountType maximumOrderLimit;
    /**
     * The maximum positive percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumPositiveVariancePercentage")
    @JsonPropertyDescription("The maximum positive percentage difference allowed in match pay.")
    private Double maximumPositiveVariancePercentage;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumPositiveVarianceAmount")
    private AmountType maximumPositiveVarianceAmount;
    /**
     * The maximum negative percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumNegativeVariancePercentage")
    @JsonPropertyDescription("The maximum negative percentage difference allowed in match pay.")
    private Double maximumNegativeVariancePercentage;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumNegativeVarianceAmount")
    private AmountType maximumNegativeVarianceAmount;
    /**
     * InvoicePaymentModeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentModeValidationType")
    private InvoicePaymentModeEnumerationType paymentModeValidationType;
    /**
     * The profit center to which the customer revenue is assigned.
     * 
     */
    @JsonProperty("profitCenter")
    @JsonPropertyDescription("The profit center to which the customer revenue is assigned.")
    private String profitCenter;
    /**
     * Indicates whether this customer uses a carrier surcharge-based tariff. If true, then you should set the surchargeRate attribute. The default value is false.
     * 
     */
    @JsonProperty("isSurchargeApplicable")
    @JsonPropertyDescription("Indicates whether this customer uses a carrier surcharge-based tariff. If true, then you should set the surchargeRate attribute. The default value is false.")
    private Boolean isSurchargeApplicable;
    /**
     * SurchargeBasedVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeVoucherCurrencyType")
    private SurchargeBasedVoucherCurrencyEnumerationType surchargeVoucherCurrencyType;
    /**
     * The surcharge or discount percentage applied to the base tariff.
     * 
     */
    @JsonProperty("surchargeOrDiscountPercent")
    @JsonPropertyDescription("The surcharge or discount percentage applied to the base tariff.")
    private Double surchargeOrDiscountPercent;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeOrDiscountRate")
    private AmountType surchargeOrDiscountRate;
    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    private NoCustomExtensionsType extensions;
    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    @JsonPropertyDescription("Deprecated, use 'extensions' instead. The placeholder for non-standard data.")
    private List<EcomStringAttributeValuePairListType> avpList = new ArrayList<EcomStringAttributeValuePairListType>();

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    public PartyIdentificationType getBillTo() {
        return billTo;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    public void setBillTo(PartyIdentificationType billTo) {
        this.billTo = billTo;
    }

    public FinancialDetails withBillTo(PartyIdentificationType billTo) {
        this.billTo = billTo;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInvoiceAmount")
    public AmountType getMaximumInvoiceAmount() {
        return maximumInvoiceAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInvoiceAmount")
    public void setMaximumInvoiceAmount(AmountType maximumInvoiceAmount) {
        this.maximumInvoiceAmount = maximumInvoiceAmount;
    }

    public FinancialDetails withMaximumInvoiceAmount(AmountType maximumInvoiceAmount) {
        this.maximumInvoiceAmount = maximumInvoiceAmount;
        return this;
    }

    /**
     * The method in which the customer should pay.
     * 
     */
    @JsonProperty("creditTermsAccountReceivable")
    public String getCreditTermsAccountReceivable() {
        return creditTermsAccountReceivable;
    }

    /**
     * The method in which the customer should pay.
     * 
     */
    @JsonProperty("creditTermsAccountReceivable")
    public void setCreditTermsAccountReceivable(String creditTermsAccountReceivable) {
        this.creditTermsAccountReceivable = creditTermsAccountReceivable;
    }

    public FinancialDetails withCreditTermsAccountReceivable(String creditTermsAccountReceivable) {
        this.creditTermsAccountReceivable = creditTermsAccountReceivable;
        return this;
    }

    /**
     * The A/P terms for the party.
     * 
     */
    @JsonProperty("creditTermsAccountPayable")
    public String getCreditTermsAccountPayable() {
        return creditTermsAccountPayable;
    }

    /**
     * The A/P terms for the party.
     * 
     */
    @JsonProperty("creditTermsAccountPayable")
    public void setCreditTermsAccountPayable(String creditTermsAccountPayable) {
        this.creditTermsAccountPayable = creditTermsAccountPayable;
    }

    public FinancialDetails withCreditTermsAccountPayable(String creditTermsAccountPayable) {
        this.creditTermsAccountPayable = creditTermsAccountPayable;
        return this;
    }

    /**
     * Text specifying the number of the payable account of the party.
     * 
     */
    @JsonProperty("accountNumberPayable")
    public String getAccountNumberPayable() {
        return accountNumberPayable;
    }

    /**
     * Text specifying the number of the payable account of the party.
     * 
     */
    @JsonProperty("accountNumberPayable")
    public void setAccountNumberPayable(String accountNumberPayable) {
        this.accountNumberPayable = accountNumberPayable;
    }

    public FinancialDetails withAccountNumberPayable(String accountNumberPayable) {
        this.accountNumberPayable = accountNumberPayable;
        return this;
    }

    /**
     * Text specifying the number of the receivable account of the party.
     * 
     */
    @JsonProperty("accountNumberReceivable")
    public String getAccountNumberReceivable() {
        return accountNumberReceivable;
    }

    /**
     * Text specifying the number of the receivable account of the party.
     * 
     */
    @JsonProperty("accountNumberReceivable")
    public void setAccountNumberReceivable(String accountNumberReceivable) {
        this.accountNumberReceivable = accountNumberReceivable;
    }

    public FinancialDetails withAccountNumberReceivable(String accountNumberReceivable) {
        this.accountNumberReceivable = accountNumberReceivable;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumOrderLimit")
    public AmountType getMinimumOrderLimit() {
        return minimumOrderLimit;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumOrderLimit")
    public void setMinimumOrderLimit(AmountType minimumOrderLimit) {
        this.minimumOrderLimit = minimumOrderLimit;
    }

    public FinancialDetails withMinimumOrderLimit(AmountType minimumOrderLimit) {
        this.minimumOrderLimit = minimumOrderLimit;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumOrderLimit")
    public AmountType getMaximumOrderLimit() {
        return maximumOrderLimit;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumOrderLimit")
    public void setMaximumOrderLimit(AmountType maximumOrderLimit) {
        this.maximumOrderLimit = maximumOrderLimit;
    }

    public FinancialDetails withMaximumOrderLimit(AmountType maximumOrderLimit) {
        this.maximumOrderLimit = maximumOrderLimit;
        return this;
    }

    /**
     * The maximum positive percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumPositiveVariancePercentage")
    public Double getMaximumPositiveVariancePercentage() {
        return maximumPositiveVariancePercentage;
    }

    /**
     * The maximum positive percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumPositiveVariancePercentage")
    public void setMaximumPositiveVariancePercentage(Double maximumPositiveVariancePercentage) {
        this.maximumPositiveVariancePercentage = maximumPositiveVariancePercentage;
    }

    public FinancialDetails withMaximumPositiveVariancePercentage(Double maximumPositiveVariancePercentage) {
        this.maximumPositiveVariancePercentage = maximumPositiveVariancePercentage;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumPositiveVarianceAmount")
    public AmountType getMaximumPositiveVarianceAmount() {
        return maximumPositiveVarianceAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumPositiveVarianceAmount")
    public void setMaximumPositiveVarianceAmount(AmountType maximumPositiveVarianceAmount) {
        this.maximumPositiveVarianceAmount = maximumPositiveVarianceAmount;
    }

    public FinancialDetails withMaximumPositiveVarianceAmount(AmountType maximumPositiveVarianceAmount) {
        this.maximumPositiveVarianceAmount = maximumPositiveVarianceAmount;
        return this;
    }

    /**
     * The maximum negative percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumNegativeVariancePercentage")
    public Double getMaximumNegativeVariancePercentage() {
        return maximumNegativeVariancePercentage;
    }

    /**
     * The maximum negative percentage difference allowed in match pay.
     * 
     */
    @JsonProperty("maximumNegativeVariancePercentage")
    public void setMaximumNegativeVariancePercentage(Double maximumNegativeVariancePercentage) {
        this.maximumNegativeVariancePercentage = maximumNegativeVariancePercentage;
    }

    public FinancialDetails withMaximumNegativeVariancePercentage(Double maximumNegativeVariancePercentage) {
        this.maximumNegativeVariancePercentage = maximumNegativeVariancePercentage;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumNegativeVarianceAmount")
    public AmountType getMaximumNegativeVarianceAmount() {
        return maximumNegativeVarianceAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumNegativeVarianceAmount")
    public void setMaximumNegativeVarianceAmount(AmountType maximumNegativeVarianceAmount) {
        this.maximumNegativeVarianceAmount = maximumNegativeVarianceAmount;
    }

    public FinancialDetails withMaximumNegativeVarianceAmount(AmountType maximumNegativeVarianceAmount) {
        this.maximumNegativeVarianceAmount = maximumNegativeVarianceAmount;
        return this;
    }

    /**
     * InvoicePaymentModeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentModeValidationType")
    public InvoicePaymentModeEnumerationType getPaymentModeValidationType() {
        return paymentModeValidationType;
    }

    /**
     * InvoicePaymentModeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentModeValidationType")
    public void setPaymentModeValidationType(InvoicePaymentModeEnumerationType paymentModeValidationType) {
        this.paymentModeValidationType = paymentModeValidationType;
    }

    public FinancialDetails withPaymentModeValidationType(InvoicePaymentModeEnumerationType paymentModeValidationType) {
        this.paymentModeValidationType = paymentModeValidationType;
        return this;
    }

    /**
     * The profit center to which the customer revenue is assigned.
     * 
     */
    @JsonProperty("profitCenter")
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * The profit center to which the customer revenue is assigned.
     * 
     */
    @JsonProperty("profitCenter")
    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public FinancialDetails withProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
        return this;
    }

    /**
     * Indicates whether this customer uses a carrier surcharge-based tariff. If true, then you should set the surchargeRate attribute. The default value is false.
     * 
     */
    @JsonProperty("isSurchargeApplicable")
    public Boolean getIsSurchargeApplicable() {
        return isSurchargeApplicable;
    }

    /**
     * Indicates whether this customer uses a carrier surcharge-based tariff. If true, then you should set the surchargeRate attribute. The default value is false.
     * 
     */
    @JsonProperty("isSurchargeApplicable")
    public void setIsSurchargeApplicable(Boolean isSurchargeApplicable) {
        this.isSurchargeApplicable = isSurchargeApplicable;
    }

    public FinancialDetails withIsSurchargeApplicable(Boolean isSurchargeApplicable) {
        this.isSurchargeApplicable = isSurchargeApplicable;
        return this;
    }

    /**
     * SurchargeBasedVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeVoucherCurrencyType")
    public SurchargeBasedVoucherCurrencyEnumerationType getSurchargeVoucherCurrencyType() {
        return surchargeVoucherCurrencyType;
    }

    /**
     * SurchargeBasedVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeVoucherCurrencyType")
    public void setSurchargeVoucherCurrencyType(SurchargeBasedVoucherCurrencyEnumerationType surchargeVoucherCurrencyType) {
        this.surchargeVoucherCurrencyType = surchargeVoucherCurrencyType;
    }

    public FinancialDetails withSurchargeVoucherCurrencyType(SurchargeBasedVoucherCurrencyEnumerationType surchargeVoucherCurrencyType) {
        this.surchargeVoucherCurrencyType = surchargeVoucherCurrencyType;
        return this;
    }

    /**
     * The surcharge or discount percentage applied to the base tariff.
     * 
     */
    @JsonProperty("surchargeOrDiscountPercent")
    public Double getSurchargeOrDiscountPercent() {
        return surchargeOrDiscountPercent;
    }

    /**
     * The surcharge or discount percentage applied to the base tariff.
     * 
     */
    @JsonProperty("surchargeOrDiscountPercent")
    public void setSurchargeOrDiscountPercent(Double surchargeOrDiscountPercent) {
        this.surchargeOrDiscountPercent = surchargeOrDiscountPercent;
    }

    public FinancialDetails withSurchargeOrDiscountPercent(Double surchargeOrDiscountPercent) {
        this.surchargeOrDiscountPercent = surchargeOrDiscountPercent;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeOrDiscountRate")
    public AmountType getSurchargeOrDiscountRate() {
        return surchargeOrDiscountRate;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("surchargeOrDiscountRate")
    public void setSurchargeOrDiscountRate(AmountType surchargeOrDiscountRate) {
        this.surchargeOrDiscountRate = surchargeOrDiscountRate;
    }

    public FinancialDetails withSurchargeOrDiscountRate(AmountType surchargeOrDiscountRate) {
        this.surchargeOrDiscountRate = surchargeOrDiscountRate;
        return this;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public NoCustomExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public void setExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
    }

    public FinancialDetails withExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public List<EcomStringAttributeValuePairListType> getAvpList() {
        return avpList;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public void setAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
    }

    public FinancialDetails withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("billTo");
        sb.append('=');
        sb.append(((this.billTo == null)?"<null>":this.billTo));
        sb.append(',');
        sb.append("maximumInvoiceAmount");
        sb.append('=');
        sb.append(((this.maximumInvoiceAmount == null)?"<null>":this.maximumInvoiceAmount));
        sb.append(',');
        sb.append("creditTermsAccountReceivable");
        sb.append('=');
        sb.append(((this.creditTermsAccountReceivable == null)?"<null>":this.creditTermsAccountReceivable));
        sb.append(',');
        sb.append("creditTermsAccountPayable");
        sb.append('=');
        sb.append(((this.creditTermsAccountPayable == null)?"<null>":this.creditTermsAccountPayable));
        sb.append(',');
        sb.append("accountNumberPayable");
        sb.append('=');
        sb.append(((this.accountNumberPayable == null)?"<null>":this.accountNumberPayable));
        sb.append(',');
        sb.append("accountNumberReceivable");
        sb.append('=');
        sb.append(((this.accountNumberReceivable == null)?"<null>":this.accountNumberReceivable));
        sb.append(',');
        sb.append("minimumOrderLimit");
        sb.append('=');
        sb.append(((this.minimumOrderLimit == null)?"<null>":this.minimumOrderLimit));
        sb.append(',');
        sb.append("maximumOrderLimit");
        sb.append('=');
        sb.append(((this.maximumOrderLimit == null)?"<null>":this.maximumOrderLimit));
        sb.append(',');
        sb.append("maximumPositiveVariancePercentage");
        sb.append('=');
        sb.append(((this.maximumPositiveVariancePercentage == null)?"<null>":this.maximumPositiveVariancePercentage));
        sb.append(',');
        sb.append("maximumPositiveVarianceAmount");
        sb.append('=');
        sb.append(((this.maximumPositiveVarianceAmount == null)?"<null>":this.maximumPositiveVarianceAmount));
        sb.append(',');
        sb.append("maximumNegativeVariancePercentage");
        sb.append('=');
        sb.append(((this.maximumNegativeVariancePercentage == null)?"<null>":this.maximumNegativeVariancePercentage));
        sb.append(',');
        sb.append("maximumNegativeVarianceAmount");
        sb.append('=');
        sb.append(((this.maximumNegativeVarianceAmount == null)?"<null>":this.maximumNegativeVarianceAmount));
        sb.append(',');
        sb.append("paymentModeValidationType");
        sb.append('=');
        sb.append(((this.paymentModeValidationType == null)?"<null>":this.paymentModeValidationType));
        sb.append(',');
        sb.append("profitCenter");
        sb.append('=');
        sb.append(((this.profitCenter == null)?"<null>":this.profitCenter));
        sb.append(',');
        sb.append("isSurchargeApplicable");
        sb.append('=');
        sb.append(((this.isSurchargeApplicable == null)?"<null>":this.isSurchargeApplicable));
        sb.append(',');
        sb.append("surchargeVoucherCurrencyType");
        sb.append('=');
        sb.append(((this.surchargeVoucherCurrencyType == null)?"<null>":this.surchargeVoucherCurrencyType));
        sb.append(',');
        sb.append("surchargeOrDiscountPercent");
        sb.append('=');
        sb.append(((this.surchargeOrDiscountPercent == null)?"<null>":this.surchargeOrDiscountPercent));
        sb.append(',');
        sb.append("surchargeOrDiscountRate");
        sb.append('=');
        sb.append(((this.surchargeOrDiscountRate == null)?"<null>":this.surchargeOrDiscountRate));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.maximumInvoiceAmount == null)? 0 :this.maximumInvoiceAmount.hashCode()));
        result = ((result* 31)+((this.minimumOrderLimit == null)? 0 :this.minimumOrderLimit.hashCode()));
        result = ((result* 31)+((this.maximumPositiveVariancePercentage == null)? 0 :this.maximumPositiveVariancePercentage.hashCode()));
        result = ((result* 31)+((this.accountNumberPayable == null)? 0 :this.accountNumberPayable.hashCode()));
        result = ((result* 31)+((this.profitCenter == null)? 0 :this.profitCenter.hashCode()));
        result = ((result* 31)+((this.creditTermsAccountReceivable == null)? 0 :this.creditTermsAccountReceivable.hashCode()));
        result = ((result* 31)+((this.creditTermsAccountPayable == null)? 0 :this.creditTermsAccountPayable.hashCode()));
        result = ((result* 31)+((this.accountNumberReceivable == null)? 0 :this.accountNumberReceivable.hashCode()));
        result = ((result* 31)+((this.isSurchargeApplicable == null)? 0 :this.isSurchargeApplicable.hashCode()));
        result = ((result* 31)+((this.maximumNegativeVariancePercentage == null)? 0 :this.maximumNegativeVariancePercentage.hashCode()));
        result = ((result* 31)+((this.maximumNegativeVarianceAmount == null)? 0 :this.maximumNegativeVarianceAmount.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.maximumOrderLimit == null)? 0 :this.maximumOrderLimit.hashCode()));
        result = ((result* 31)+((this.billTo == null)? 0 :this.billTo.hashCode()));
        result = ((result* 31)+((this.surchargeVoucherCurrencyType == null)? 0 :this.surchargeVoucherCurrencyType.hashCode()));
        result = ((result* 31)+((this.maximumPositiveVarianceAmount == null)? 0 :this.maximumPositiveVarianceAmount.hashCode()));
        result = ((result* 31)+((this.surchargeOrDiscountRate == null)? 0 :this.surchargeOrDiscountRate.hashCode()));
        result = ((result* 31)+((this.paymentModeValidationType == null)? 0 :this.paymentModeValidationType.hashCode()));
        result = ((result* 31)+((this.surchargeOrDiscountPercent == null)? 0 :this.surchargeOrDiscountPercent.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialDetails) == false) {
            return false;
        }
        FinancialDetails rhs = ((FinancialDetails) other);
        return (((((((((((((((((((((this.maximumInvoiceAmount == rhs.maximumInvoiceAmount)||((this.maximumInvoiceAmount!= null)&&this.maximumInvoiceAmount.equals(rhs.maximumInvoiceAmount)))&&((this.minimumOrderLimit == rhs.minimumOrderLimit)||((this.minimumOrderLimit!= null)&&this.minimumOrderLimit.equals(rhs.minimumOrderLimit))))&&((this.maximumPositiveVariancePercentage == rhs.maximumPositiveVariancePercentage)||((this.maximumPositiveVariancePercentage!= null)&&this.maximumPositiveVariancePercentage.equals(rhs.maximumPositiveVariancePercentage))))&&((this.accountNumberPayable == rhs.accountNumberPayable)||((this.accountNumberPayable!= null)&&this.accountNumberPayable.equals(rhs.accountNumberPayable))))&&((this.profitCenter == rhs.profitCenter)||((this.profitCenter!= null)&&this.profitCenter.equals(rhs.profitCenter))))&&((this.creditTermsAccountReceivable == rhs.creditTermsAccountReceivable)||((this.creditTermsAccountReceivable!= null)&&this.creditTermsAccountReceivable.equals(rhs.creditTermsAccountReceivable))))&&((this.creditTermsAccountPayable == rhs.creditTermsAccountPayable)||((this.creditTermsAccountPayable!= null)&&this.creditTermsAccountPayable.equals(rhs.creditTermsAccountPayable))))&&((this.accountNumberReceivable == rhs.accountNumberReceivable)||((this.accountNumberReceivable!= null)&&this.accountNumberReceivable.equals(rhs.accountNumberReceivable))))&&((this.isSurchargeApplicable == rhs.isSurchargeApplicable)||((this.isSurchargeApplicable!= null)&&this.isSurchargeApplicable.equals(rhs.isSurchargeApplicable))))&&((this.maximumNegativeVariancePercentage == rhs.maximumNegativeVariancePercentage)||((this.maximumNegativeVariancePercentage!= null)&&this.maximumNegativeVariancePercentage.equals(rhs.maximumNegativeVariancePercentage))))&&((this.maximumNegativeVarianceAmount == rhs.maximumNegativeVarianceAmount)||((this.maximumNegativeVarianceAmount!= null)&&this.maximumNegativeVarianceAmount.equals(rhs.maximumNegativeVarianceAmount))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.maximumOrderLimit == rhs.maximumOrderLimit)||((this.maximumOrderLimit!= null)&&this.maximumOrderLimit.equals(rhs.maximumOrderLimit))))&&((this.billTo == rhs.billTo)||((this.billTo!= null)&&this.billTo.equals(rhs.billTo))))&&((this.surchargeVoucherCurrencyType == rhs.surchargeVoucherCurrencyType)||((this.surchargeVoucherCurrencyType!= null)&&this.surchargeVoucherCurrencyType.equals(rhs.surchargeVoucherCurrencyType))))&&((this.maximumPositiveVarianceAmount == rhs.maximumPositiveVarianceAmount)||((this.maximumPositiveVarianceAmount!= null)&&this.maximumPositiveVarianceAmount.equals(rhs.maximumPositiveVarianceAmount))))&&((this.surchargeOrDiscountRate == rhs.surchargeOrDiscountRate)||((this.surchargeOrDiscountRate!= null)&&this.surchargeOrDiscountRate.equals(rhs.surchargeOrDiscountRate))))&&((this.paymentModeValidationType == rhs.paymentModeValidationType)||((this.paymentModeValidationType!= null)&&this.paymentModeValidationType.equals(rhs.paymentModeValidationType))))&&((this.surchargeOrDiscountPercent == rhs.surchargeOrDiscountPercent)||((this.surchargeOrDiscountPercent!= null)&&this.surchargeOrDiscountPercent.equals(rhs.surchargeOrDiscountPercent))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
