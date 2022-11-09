%dw 2.0
output application/java
---
[{
	"DHP_Proof__c": payload,
	"RecordId__c": vars.record_Id
}]