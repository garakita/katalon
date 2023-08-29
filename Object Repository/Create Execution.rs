<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Execution</name>
   <tag></tag>
   <elementGuidId>53451763-5b8b-496f-82c1-0ad33d26b140</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczovL3RlY2htZXJjaC5hdGxhc3NpYW4ubmV0IiwidXNlciI6eyJhY2NvdW50SWQiOiI2MzljMGUwZWZiZjU0YmFmMjkwNDQyNDEifX0sImlzcyI6ImNvbS5rYW5vYWgudGVzdC1tYW5hZ2VyIiwic3ViIjoiMjRlNmNkYzQtNjFjMS0zNDE0LTk5ZDgtYWNiZTM1MWViOGVmIiwiZXhwIjoxNzI0ODMxMDQ1LCJpYXQiOjE2OTMyOTUwNDV9.4-RX-o26xSSWqFWrZfymBmJOVHYuwT2-MHe4B5SHzN0</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;projectKey\&quot;: \&quot;${GlobalVariable.g_ZS_ProjectKey}\&quot;,\n    \&quot;testCaseKey\&quot;: \&quot;${GlobalVariable.g_ZS_TestCaseKey}\&quot;,\n    \&quot;testCycleKey\&quot;: \&quot;${GlobalVariable.g_ZS_TestCycleKey}\&quot;,\n    \&quot;statusName\&quot;: \&quot;${GlobalVariable.g_ZS_StatusName}\&quot;\n    }&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
      <webElementGuid>fe37cf54-81da-4635-b047-a3376ab1097e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczovL3RlY2htZXJjaC5hdGxhc3NpYW4ubmV0IiwidXNlciI6eyJhY2NvdW50SWQiOiI2MzljMGUwZWZiZjU0YmFmMjkwNDQyNDEifX0sImlzcyI6ImNvbS5rYW5vYWgudGVzdC1tYW5hZ2VyIiwic3ViIjoiMjRlNmNkYzQtNjFjMS0zNDE0LTk5ZDgtYWNiZTM1MWViOGVmIiwiZXhwIjoxNzI0ODMxMDQ1LCJpYXQiOjE2OTMyOTUwNDV9.4-RX-o26xSSWqFWrZfymBmJOVHYuwT2-MHe4B5SHzN0</value>
      <webElementGuid>e11befcd-cd7a-4198-99e7-2977306c150f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.6</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.zephyrscale.smartbear.com/v2/testexecutions</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
