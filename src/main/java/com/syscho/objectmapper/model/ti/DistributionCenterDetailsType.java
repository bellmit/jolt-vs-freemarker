
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DistributionCenterDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actionCode",
    "distributionCenterId",
    "ownerOfStore",
    "processingPriority",
    "storeCategory",
    "storeGroup",
    "routeToCustomer",
    "billToCustomer",
    "storeStagingLocation",
    "routeSchedule"
})
@Generated("jsonschema2pojo")
public class DistributionCenterDetailsType {

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;
    /**
     * The set of characters that uniquely references the facility that provides replenishment services to the store location.
     * (Required)
     * 
     */
    @JsonProperty("distributionCenterId")
    @JsonPropertyDescription("The set of characters that uniquely references the facility that provides replenishment services to the store location.")
    private String distributionCenterId;
    /**
     * The party responsible for the opertation of the store.
     * 
     */
    @JsonProperty("ownerOfStore")
    @JsonPropertyDescription("The party responsible for the opertation of the store.")
    private String ownerOfStore;
    /**
     * A number representing the relative importance of servicing this store in distribution operations.
     * 
     */
    @JsonProperty("processingPriority")
    @JsonPropertyDescription("A number representing the relative importance of servicing this store in distribution operations.")
    private Integer processingPriority;
    /**
     * A term used by the business to identify the operational characteristics of the store.
     * 
     */
    @JsonProperty("storeCategory")
    @JsonPropertyDescription("A term used by the business to identify the operational characteristics of the store.")
    private String storeCategory;
    /**
     * The term used by the business to refer to a specific collection of stores.
     * 
     */
    @JsonProperty("storeGroup")
    @JsonPropertyDescription("The term used by the business to refer to a specific collection of stores.")
    private String storeGroup;
    /**
     * The geographic location through which deliveries to this store should be transported.
     * 
     */
    @JsonProperty("routeToCustomer")
    @JsonPropertyDescription("The geographic location through which deliveries to this store should be transported.")
    private String routeToCustomer;
    /**
     * The party that will be responsible for any charges that are due as a result of services provided to the store.
     * 
     */
    @JsonProperty("billToCustomer")
    @JsonPropertyDescription("The party that will be responsible for any charges that are due as a result of services provided to the store.")
    private String billToCustomer;
    /**
     * StoreStagingLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("storeStagingLocation")
    private StoreStagingLocationType storeStagingLocation;
    /**
     * RouteScheduleType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeSchedule")
    private RouteScheduleType routeSchedule;

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public SegmentActionEnumerationType getActionCode() {
        return actionCode;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public void setActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
    }

    public DistributionCenterDetailsType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * The set of characters that uniquely references the facility that provides replenishment services to the store location.
     * (Required)
     * 
     */
    @JsonProperty("distributionCenterId")
    public String getDistributionCenterId() {
        return distributionCenterId;
    }

    /**
     * The set of characters that uniquely references the facility that provides replenishment services to the store location.
     * (Required)
     * 
     */
    @JsonProperty("distributionCenterId")
    public void setDistributionCenterId(String distributionCenterId) {
        this.distributionCenterId = distributionCenterId;
    }

    public DistributionCenterDetailsType withDistributionCenterId(String distributionCenterId) {
        this.distributionCenterId = distributionCenterId;
        return this;
    }

    /**
     * The party responsible for the opertation of the store.
     * 
     */
    @JsonProperty("ownerOfStore")
    public String getOwnerOfStore() {
        return ownerOfStore;
    }

    /**
     * The party responsible for the opertation of the store.
     * 
     */
    @JsonProperty("ownerOfStore")
    public void setOwnerOfStore(String ownerOfStore) {
        this.ownerOfStore = ownerOfStore;
    }

    public DistributionCenterDetailsType withOwnerOfStore(String ownerOfStore) {
        this.ownerOfStore = ownerOfStore;
        return this;
    }

    /**
     * A number representing the relative importance of servicing this store in distribution operations.
     * 
     */
    @JsonProperty("processingPriority")
    public Integer getProcessingPriority() {
        return processingPriority;
    }

    /**
     * A number representing the relative importance of servicing this store in distribution operations.
     * 
     */
    @JsonProperty("processingPriority")
    public void setProcessingPriority(Integer processingPriority) {
        this.processingPriority = processingPriority;
    }

    public DistributionCenterDetailsType withProcessingPriority(Integer processingPriority) {
        this.processingPriority = processingPriority;
        return this;
    }

    /**
     * A term used by the business to identify the operational characteristics of the store.
     * 
     */
    @JsonProperty("storeCategory")
    public String getStoreCategory() {
        return storeCategory;
    }

    /**
     * A term used by the business to identify the operational characteristics of the store.
     * 
     */
    @JsonProperty("storeCategory")
    public void setStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    public DistributionCenterDetailsType withStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
        return this;
    }

    /**
     * The term used by the business to refer to a specific collection of stores.
     * 
     */
    @JsonProperty("storeGroup")
    public String getStoreGroup() {
        return storeGroup;
    }

    /**
     * The term used by the business to refer to a specific collection of stores.
     * 
     */
    @JsonProperty("storeGroup")
    public void setStoreGroup(String storeGroup) {
        this.storeGroup = storeGroup;
    }

    public DistributionCenterDetailsType withStoreGroup(String storeGroup) {
        this.storeGroup = storeGroup;
        return this;
    }

    /**
     * The geographic location through which deliveries to this store should be transported.
     * 
     */
    @JsonProperty("routeToCustomer")
    public String getRouteToCustomer() {
        return routeToCustomer;
    }

    /**
     * The geographic location through which deliveries to this store should be transported.
     * 
     */
    @JsonProperty("routeToCustomer")
    public void setRouteToCustomer(String routeToCustomer) {
        this.routeToCustomer = routeToCustomer;
    }

    public DistributionCenterDetailsType withRouteToCustomer(String routeToCustomer) {
        this.routeToCustomer = routeToCustomer;
        return this;
    }

    /**
     * The party that will be responsible for any charges that are due as a result of services provided to the store.
     * 
     */
    @JsonProperty("billToCustomer")
    public String getBillToCustomer() {
        return billToCustomer;
    }

    /**
     * The party that will be responsible for any charges that are due as a result of services provided to the store.
     * 
     */
    @JsonProperty("billToCustomer")
    public void setBillToCustomer(String billToCustomer) {
        this.billToCustomer = billToCustomer;
    }

    public DistributionCenterDetailsType withBillToCustomer(String billToCustomer) {
        this.billToCustomer = billToCustomer;
        return this;
    }

    /**
     * StoreStagingLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("storeStagingLocation")
    public StoreStagingLocationType getStoreStagingLocation() {
        return storeStagingLocation;
    }

    /**
     * StoreStagingLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("storeStagingLocation")
    public void setStoreStagingLocation(StoreStagingLocationType storeStagingLocation) {
        this.storeStagingLocation = storeStagingLocation;
    }

    public DistributionCenterDetailsType withStoreStagingLocation(StoreStagingLocationType storeStagingLocation) {
        this.storeStagingLocation = storeStagingLocation;
        return this;
    }

    /**
     * RouteScheduleType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeSchedule")
    public RouteScheduleType getRouteSchedule() {
        return routeSchedule;
    }

    /**
     * RouteScheduleType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeSchedule")
    public void setRouteSchedule(RouteScheduleType routeSchedule) {
        this.routeSchedule = routeSchedule;
    }

    public DistributionCenterDetailsType withRouteSchedule(RouteScheduleType routeSchedule) {
        this.routeSchedule = routeSchedule;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DistributionCenterDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("distributionCenterId");
        sb.append('=');
        sb.append(((this.distributionCenterId == null)?"<null>":this.distributionCenterId));
        sb.append(',');
        sb.append("ownerOfStore");
        sb.append('=');
        sb.append(((this.ownerOfStore == null)?"<null>":this.ownerOfStore));
        sb.append(',');
        sb.append("processingPriority");
        sb.append('=');
        sb.append(((this.processingPriority == null)?"<null>":this.processingPriority));
        sb.append(',');
        sb.append("storeCategory");
        sb.append('=');
        sb.append(((this.storeCategory == null)?"<null>":this.storeCategory));
        sb.append(',');
        sb.append("storeGroup");
        sb.append('=');
        sb.append(((this.storeGroup == null)?"<null>":this.storeGroup));
        sb.append(',');
        sb.append("routeToCustomer");
        sb.append('=');
        sb.append(((this.routeToCustomer == null)?"<null>":this.routeToCustomer));
        sb.append(',');
        sb.append("billToCustomer");
        sb.append('=');
        sb.append(((this.billToCustomer == null)?"<null>":this.billToCustomer));
        sb.append(',');
        sb.append("storeStagingLocation");
        sb.append('=');
        sb.append(((this.storeStagingLocation == null)?"<null>":this.storeStagingLocation));
        sb.append(',');
        sb.append("routeSchedule");
        sb.append('=');
        sb.append(((this.routeSchedule == null)?"<null>":this.routeSchedule));
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
        result = ((result* 31)+((this.billToCustomer == null)? 0 :this.billToCustomer.hashCode()));
        result = ((result* 31)+((this.processingPriority == null)? 0 :this.processingPriority.hashCode()));
        result = ((result* 31)+((this.storeStagingLocation == null)? 0 :this.storeStagingLocation.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.storeCategory == null)? 0 :this.storeCategory.hashCode()));
        result = ((result* 31)+((this.distributionCenterId == null)? 0 :this.distributionCenterId.hashCode()));
        result = ((result* 31)+((this.ownerOfStore == null)? 0 :this.ownerOfStore.hashCode()));
        result = ((result* 31)+((this.routeSchedule == null)? 0 :this.routeSchedule.hashCode()));
        result = ((result* 31)+((this.storeGroup == null)? 0 :this.storeGroup.hashCode()));
        result = ((result* 31)+((this.routeToCustomer == null)? 0 :this.routeToCustomer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionCenterDetailsType) == false) {
            return false;
        }
        DistributionCenterDetailsType rhs = ((DistributionCenterDetailsType) other);
        return (((((((((((this.billToCustomer == rhs.billToCustomer)||((this.billToCustomer!= null)&&this.billToCustomer.equals(rhs.billToCustomer)))&&((this.processingPriority == rhs.processingPriority)||((this.processingPriority!= null)&&this.processingPriority.equals(rhs.processingPriority))))&&((this.storeStagingLocation == rhs.storeStagingLocation)||((this.storeStagingLocation!= null)&&this.storeStagingLocation.equals(rhs.storeStagingLocation))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.storeCategory == rhs.storeCategory)||((this.storeCategory!= null)&&this.storeCategory.equals(rhs.storeCategory))))&&((this.distributionCenterId == rhs.distributionCenterId)||((this.distributionCenterId!= null)&&this.distributionCenterId.equals(rhs.distributionCenterId))))&&((this.ownerOfStore == rhs.ownerOfStore)||((this.ownerOfStore!= null)&&this.ownerOfStore.equals(rhs.ownerOfStore))))&&((this.routeSchedule == rhs.routeSchedule)||((this.routeSchedule!= null)&&this.routeSchedule.equals(rhs.routeSchedule))))&&((this.storeGroup == rhs.storeGroup)||((this.storeGroup!= null)&&this.storeGroup.equals(rhs.storeGroup))))&&((this.routeToCustomer == rhs.routeToCustomer)||((this.routeToCustomer!= null)&&this.routeToCustomer.equals(rhs.routeToCustomer))));
    }

}
