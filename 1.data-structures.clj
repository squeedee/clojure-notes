(4 :alpha 3.0)   ; List
'(4 :alpha 3.0)  ; Quoted List

[2 "hello" 99]   ; Vector

{:a 1, :b 2}     ; Map
{:a 1 :b 2}      ; Map (commas are whitespace)

#{alice jim bob} ; Set
#{"a" "b" "c"}   ; Set
#{"a" "a" "c"}   ; Not a set (duplicate key exception)
