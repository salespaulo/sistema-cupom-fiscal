unit uSat;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  dynlibs,StrUtils,ExtCtrls,LCLType;

type

  { TForm1 }

  TForm1 = class(TForm)
    Button1: TButton;
    btnVenda: TButton;
    txtCod: TEdit;
    Label1: TLabel;
    procedure btnVendaClick(Sender: TObject);
    procedure Button1Click(Sender: TObject);
  private
    { private declarations }
  public
    { public declarations }
  end; 

var
  Form1: TForm1; 
   Retorno:Pchar;
implementation
Function EnviarDadosVenda(NumeroSessao:integer; CodAtivacao:AnsiString; Venda_XML:AnsiString):Pchar; stdcall;  external 'libSATDLL.so';
Function ConsultarSAT(NumeroSessao:integer):Pchar; stdcall; external 'libSATDLL.so';
{$R *.lfm}

{ TForm1 }

procedure TForm1.Button1Click(Sender: TObject);



begin
       Retorno:= ConsultarSAT(Random(999999));

      ShowMessage(Retorno);

end;

procedure TForm1.btnVendaClick(Sender: TObject);
var
 xml:AnsiString;
begin

      xml :='<?xml version="1.0" encoding="utf-8"?><CFe><infCFe versaoDadosEnt="0.06"><ide><CNPJ>10615281000140</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><numeroCaixa>233</numeroCaixa></ide><emit><CNPJ>53485215000106</CNPJ><IE>111072115110</IE><IM>111111111</IM><cRegTribISSQN>3</cRegTribISSQN><indRatISSQN>S</indRatISSQN></emit><dest><CNPJ>53485215000106</CNPJ><xNome>Sweda Informatica Ltda.</xNome></dest><entrega><xLgr>Rua Dona Brigida</xLgr><nro>713</nro><xCpl>A</xCpl><xBairro>Vila Mariana</xBairro><xMun>São Paulo</xMun><UF>SP</UF></entrega><det nItem="1"><prod><cProd>123</cProd><xProd>pao</xProd><NCM>85447030</NCM><CFOP>5401</CFOP><uCom>un</uCom><qCom>1.0000</qCom><vUnCom>2.000</vUnCom><indRegra>T</indRegra><vDesc>0.00</vDesc><vOutro>0.00</vOutro></prod><imposto><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>07.00</pICMS></ICMS00></ICMS><PIS><PISSN><CST>49</CST></PISSN></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>1.00</vBC><pCOFINS>5.0000</pCOFINS></COFINSAliq></COFINS></imposto></det><total></total><pgto><MP><cMP>01</cMP><vMP>2.00</vMP><cAdmC>025</cAdmC></MP></pgto></infCFe></CFe>';

      Retorno:= EnviarDadosVenda(Random(999999),txtCod.Text,xml);
      ShowMessage(Retorno);
end;

end.

