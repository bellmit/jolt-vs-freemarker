{
"address" : {
"city" : "${input.address.city}",
"cityCode" : "${input.address.cityCode}",
"countryCode" :"${input.address.countryCode}",
"currencyOfPartyCode" : "${input.address.currencyOfPartyCode}",
"languageOfThePartyCode" :  "${input.address.languageOfThePartyCode}",
"name" : "${input.address.name}",
"pOBoxNumber" :"${input.address.pOBoxNumber}",
"postalCode" : "${input.address.postalCode}",
"state" : "${input.address.state}",
"streetAddressOne" : "${input.address.streetAddressOne}",
"streetAddressTwo" : "${input.address.streetAddressTwo}",
"streetAddressThree" : "${input.address.streetAddressThree}",
"geographicalCoordinates" : {
"latitude" : "${input.address.geographicalCoordinates.latitude}",
"longitude" : "${input.address.geographicalCoordinates.longitude}"
},
"addressDistrict" : "${input.address.addressDistrict}",
"addressRegion" : "${input.address.addressRegion}"
},
<#assign i = input.contact?size>
"contact" : [
<#list input.contact as contact>
    {
    "personName": "${contact.personName}",
    "communicationChannel": [
    <#assign i2 = contact.communicationChannel?size>
    <#list contact.communicationChannel as communicationChannel>
        {
        "communicationChannelCode": "${communicationChannel.communicationChannelCode}",
        "communicationValue": "${communicationChannel.communicationValue}",
        "communicationChannelName": "${communicationChannel.communicationChannelName}"
        }
        <#if communicationChannel?index != i2-1>,</#if>
    </#list>
    ]
    }
    <#if contact?index != i-1>,</#if>
</#list>
],
"record" : "${input.comment}",
"context" : {
"Name" :  "${input.context.name}",
"ingredient" : "${input.context.ingredient}",
"yield" : "${input.context.yield}",
"description" : "${input.context.description}"
},
"root" : {
"ins" : "${input.context.instructions}",
"stepRound" : {
"id" :"${input.context.step.id}",
"type" : "${input.context.step.type}"
}
},
"xsd" : "${input.context.xsd}",
"Name" : "${input.name}",
<#assign i3 = input.ingredient?size>
"Inputs" : [
<#list input.ingredient as data>
    "${data}"
    <#if data?index != i3-1>,</#if>

</#list>
]
,
<#assign emp = input.dummyTest?size>


"employee" : [
<#list input.dummyTest as data>
    { "title": "${data.title}",
    "age": ${data.age}
    }
    <#if data?index != emp-1>,</#if>
</#list>
],
"Makes" : "${input.yield}",
<#assign inssize = input.instructions?size>


"des" : [<#list input.instructions as data>
    { "step": ${data.step},
    "description": "${data.description}"
    }
    <#if data?index != inssize-1>,</#if>
</#list>
]
}