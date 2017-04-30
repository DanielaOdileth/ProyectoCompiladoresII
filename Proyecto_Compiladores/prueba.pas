program suma;
uses crt;
var
num1, num2, resultado: integer;

begin
  ClrScr;
  writeln<'Suma de dos numeros'>;
  writeln<'Primer numero: '>;
  readln<num1>;
  writeln<'Segundo numero: '>;
  readln<num2>;
  resultado:=num1 + num2;
  writeln<'El resultado de la suma es: ',resultado);
  readkey;
end
