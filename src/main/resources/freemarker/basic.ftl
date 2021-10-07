{
<#-- Java Object  -->
"personName": "${contact.personName}",
"email": "${contact.email}",
<#-- List Field -->
"lineNumber": "${list[0].lineNumber}",
"message": "${list[0].message}",
"isPrintable": "${list[2].message}",
"billinNum": "${map.billinNum}",
<#-- HASHMAP Field -->
"TaxId": "${map.TaxId}",
"checkList": ${map.checkList?c},
<#-- Boolean Field -->
"checkList2": ${booleanCheckList?c},
<#-- Number Field -->
"rollNumber":${numberField},
<#-- The if directive-->
<#if contact.personName == "Wood">
    "printableMsg" : "${contact.personName}",
</#if>
<#-- The if else directive : https://freemarker.apache.org/docs/dgui_template_exp.html#dgui_template_exp_methodcall-->
<#if loggedIn>
    "loginStatus" :true,
<#else>
    "loginStatus" :false,
</#if>
<#-- The list directive-->
<#assign i = list?size>
"userNotesWithComma":[
<#list list as note>
    "${note.message}"<#if note?index != i-1>,</#if>
</#list>
],


<#-- Dealing with missing variables-->
"password":"${password!"defaultPassword"}",
"confirmPassword":"${password!contact.test!"Test"}",

<#assign seq = ['a', 'b']>
"val1":"${seq[0]!'-'}",
<#-- Dealing with Basics Types : https://freemarker.apache.org/docs/dgui_datamodel_basics.html-->
"Weight": ${400 / 2 + 100},
"caseworker": "${"marvel"?upper_case}",
<#assign x = "Iron Man">
"lenght":${contact.email?length},
<#-- Using Custom Functions Java/ftl file level: https://freemarker.apache.org/docs/ref_directive_function.html-->
"indexOf+":${indexOf("Man", x)},
"indexOf-":${indexOf("Non", x)},
"avg" : ${avg(10, 20)},
"avgMul":${avg(10, 20, 30, 40)},
"avgNon":"${avg()!"N/A"}",
<#-- USING your own directives: https://freemarker.apache.org/docs/dgui_misc_userdefdir.html-->
"homeContact":{
<@Contact data=homeContact/>
},
"officeContact":{
<@Contact data=officeContact/>
}
}


<#function avg x y>
    <#return (x + y) / 2>
</#function>

<#function avg nums...>
    <#local sum = 0>
    <#list nums as num>
        <#local sum += num>
    </#list>
    <#if nums?size != 0>
        <#return sum / nums?size>
    </#if>
</#function>

<#-- Defining your own directives: https://freemarker.apache.org/docs/dgui_misc_userdefdir.html-->

<#macro Contact data>
    "email":   "${data.email}",
    "name":  "${data.personName}"
</#macro>
