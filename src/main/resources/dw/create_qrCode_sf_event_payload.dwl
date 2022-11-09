%dw 2.0
output application/java
---
[{
	"QRCode__c": payload,
	"RecordId__c": vars.record_Id
}]