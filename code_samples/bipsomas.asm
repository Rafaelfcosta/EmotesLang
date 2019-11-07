.data
	var_1_num1 : 0
	var_2_num2 : 0
	var_3_num3 : 0
	var_4_num4 : 0
	var_5_resposta : 0
.text
	CALL main
main : 
	LDI 1000
	STO var_1_num1
	LDI 256
	STO var_2_num2
	LDI 34
	STO var_3_num3
	LDI 187
	STO var_4_num4
	LD var_1_num1
	ADD var_3_num3
	STO var_5_resposta
	LD var_5_resposta
	SUB var_2_num2
	STO var_5_resposta
	LD var_5_resposta
	ADD var_4_num4
	STO var_5_resposta
	LD var_5_resposta
	SUBI 2
	STO var_5_resposta
	LD var_5_resposta
	ADDI 30
	STO var_5_resposta
	LD var_5_resposta
	STO $out_port
	HLT
