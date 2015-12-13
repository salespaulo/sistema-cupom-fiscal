Attribute VB_Name = "Module1"
Option Explicit

Public Declare Function ConsultarSAT Lib "SATDLL.dll" (ByVal sessao As Integer) As String

Public Declare Function ConsultarStatusOperacional Lib "SATDLL.dll" (ByVal numeroSessao As Integer, ByVal codigoDeAtivacao As String) As String



