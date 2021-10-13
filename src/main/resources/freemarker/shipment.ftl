{
"creationDateTime": "${ti.creationDateTime!"-"}",
"transportInstructionId": "${ti.transportInstructionId!"-"}",
"lastUpdateDateTime": "${ti.lastUpdateDateTime!"-"}",
"shipment": [
{
"shipmentId": "${ti.shipment[0].primaryId!"-"}",
"customerCode": "${ti.shipment[0].customerCode!"-"}",
"freightTermsCode": "${ti.shipment[0].freightTermsCode!"-"}",
"actualShipDateTime": "${ti.shipment[0].actualShipDateTime!"-"}",
"actualDeliveryDateTime": "${ti.shipment[0].actualDeliveryDateTime!"-"}",
"predictedDeliveryDateTime": "${ti.shipment[0].predictedDeliveryDateTime!"-"}",
"proofOfDeliveryDeliveryDateTime": "${ti.shipment[0].proofOfDeliveryDeliveryDateTime!"-"}",
"deliveryTypeCode": "${ti.shipment[0].deliveryTypeCode!"-"}",
"note": [

<#list ti.shipment[0].note as note>

    {
    "lineNumber": "${note.lineNumber!"-"}",
    "isPrintable": ${note.isPrintable?c},
    "text": {
    "languageCode": "${note.languageCode!"-"}",
    "value": "${note.value!"-"}"
    },
    "type": "${note.type!"-"}"
    }
</#list>
],
"transportInstructionTerms": {
"transportServiceCategoryType": "${ti.shipment[0].transportInstructionTerms.transportServiceCategoryType!"-"}"
},
"logisticUnit": [
<#list ti.shipment[0].logisticUnit as logisticUnit>
    {
    "primaryId": "${logisticUnit.primaryId!"-"}",
    "totalLoadingLength": {
    "measurementUnitCode": "${logisticUnit.totalLoadingLength.measurementUnitCode!"-"}",
    "value": "${logisticUnit.totalLoadingLength.value}"
    }
    }
</#list>


],
"carrier": {
"name": "fake_data"
},
"transportReference": [
<#list ti.shipment[0].transportReference as transportReference>

    {
    "entityId": "${transportReference.entityId}",
    "typeCode": "${transportReference.typeCode}"
    }
</#list>
],
"tmReferenceNumber": [
<#list ti.shipment[0].tmReferenceNumber as tmReferenceNumber>

    {
    "referenceNumberName": "${tmReferenceNumber.referenceNumberName}",
    "referenceNumberValue": "${tmReferenceNumber.referenceNumberValue}"
    }
</#list>
],
"plannedDespatch": {
"logisticEventPeriod": {
"beginDate":"${ti.shipment[0].plannedDespatch.logisticEventPeriod.beginDate}",
"beginTime": "${ti.shipment[0].plannedDespatch.logisticEventPeriod.beginTime}",
"endDate": "${ti.shipment[0].plannedDespatch.logisticEventPeriod.endDate}",
"endTime": "${ti.shipment[0].plannedDespatch.logisticEventPeriod.endTime}"
}
},
"plannedDelivery": {
"logisticEventPeriod": {
"beginDate": "${ti.shipment[0].plannedDelivery.logisticEventPeriod.beginDate}",
"beginTime": "${ti.shipment[0].plannedDelivery.logisticEventPeriod.beginTime}",
"endDate": "${ti.shipment[0].plannedDelivery.logisticEventPeriod.endDate}",
"endTime": "${ti.shipment[0].plannedDelivery.logisticEventPeriod.endTime}"
}
},
"transportCargoCharacteristics": {
"cargoTypeCode": "${ti.shipment[0].transportCargoCharacteristics.cargoTypeCode}",
"totalGrossWeight": {
"measurementUnitCode": "${ti.shipment[0].transportCargoCharacteristics.totalGrossWeight.measurementUnitCode}",
"value": ${ti.shipment[0].transportCargoCharacteristics.totalGrossWeight.value}
},
"totalGrossVolume": {
"measurementUnitCode": "${ti.shipment[0].transportCargoCharacteristics.totalGrossVolume.measurementUnitCode}",
"value": ${ti.shipment[0].transportCargoCharacteristics.totalGrossVolume.value}
},
"totalPackageQuantity": {
"measurementUnitCode": "${ti.shipment[0].transportCargoCharacteristics.totalPackageQuantity.measurementUnitCode}",
"value": ${ti.shipment[0].transportCargoCharacteristics.totalPackageQuantity.value}
}
},
"shippingInformation": {
"holdShipment": ${ti.shipment[0].shippingInformation.holdShipment?c},
"shipmentPriority": "${ti.shipment[0].shippingInformation.shipmentPriority}",
"isUrgentShipment": ${ti.shipment[0].shippingInformation.isUrgentShipment?c}
},
"shipFrom": {
"primaryId": "${ti.shipment[0].shipFrom.primaryId}",
"organisationName": "${ti.shipment[0].shipFrom.organisationName}",
"isResidentialAddress": ${ti.shipment[0].shipFrom.isResidentialAddress?c},
"contact": [
<#list ti.shipment[0].shipFrom.contact as contact>
    {
    "personName": "${contact.personName}",
    "communicationChannel": [
    <#list contact.communicationChannel as communicationChannel>
        {
        "communicationChannelCode": "${communicationChannel.communicationChannelCode}",
        "communicationValue": "${communicationChannel.communicationValue}",
        "communicationChannelName": "${communicationChannel.communicationChannelName}"
        }
    </#list>
    ]
    }
</#list>
],
"address": {
"streetAddressOne":  "${ti.shipment[0].shipFrom.address.streetAddressOne}",
"streetAddressTwo": "${ti.shipment[0].shipFrom.address.streetAddressTwo}",
"streetAddressThree": "${ti.shipment[0].shipFrom.address.streetAddressThree}",
"city": "${ti.shipment[0].shipFrom.address.city}",
"countryCode": "${ti.shipment[0].shipFrom.address.countryCode}",
"name": "${ti.shipment[0].shipFrom.address.name}",
"state": "${ti.shipment[0].shipFrom.address.state}",
"postalCode": "${ti.shipment[0].shipFrom.address.postalCode}",
"geographicalCoordinates": {
"latitude": "${ti.shipment[0].shipFrom.address.geographicalCoordinates.latitude}",
"longitude": "${ti.shipment[0].shipFrom.address.geographicalCoordinates.longitude}"
}
}
},
"shipTo": {
"primaryId": "${ti.shipment[0].shipTo.primaryId}",
"organisationName": "${ti.shipment[0].shipTo.organisationName}",
"isResidentialAddress": ${ti.shipment[0].shipTo.isResidentialAddress?c},
"contact": [
<#list ti.shipment[0].shipTo.contact as contact>
    {
    "personName": "${contact.personName}",
    "communicationChannel": [
    <#list contact.communicationChannel as communicationChannel>
        {
        "communicationChannelCode": "${communicationChannel.communicationChannelCode}",
        "communicationValue": "${communicationChannel.communicationValue}",
        "communicationChannelName": "${communicationChannel.communicationChannelName}"
        }
    </#list>
    ]
    }
</#list>
],
"address": {
"streetAddressOne": "${ti.shipment[0].shipTo.address.streetAddressOne}",
"streetAddressTwo":  "${ti.shipment[0].shipTo.address.streetAddressTwo}",
"streetAddressThree":  "${ti.shipment[0].shipTo.address.streetAddressThree}",
"city":  "${ti.shipment[0].shipTo.address.city}",
"countryCode":  "${ti.shipment[0].shipTo.address.countryCode}",
"name":  "${ti.shipment[0].shipTo.address.name}",
"state":  "${ti.shipment[0].shipTo.address.state}",
"postalCode":  "${ti.shipment[0].shipTo.address.postalCode}",
"geographicalCoordinates": {
"latitude": "${ti.shipment[0].shipTo.address.geographicalCoordinates.latitude}",
"longitude": "${ti.shipment[0].shipTo.address.geographicalCoordinates.longitude}"
}
}
}
}
],
"billTo": {
"primaryId": "${ti.billTo.primaryId}",
"name": "${ti.billTo.name}"
}
}