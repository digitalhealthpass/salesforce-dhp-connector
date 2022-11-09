%dw 2.0
output application/json
import * from dw::core::Strings

var dt = vars.actualPayload.expirationDate default now()+|P2D|
---

if((vars.jwkKey != []) and (dt > now())) true else false