VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   2970
   ClientLeft      =   60
   ClientTop       =   450
   ClientWidth     =   6360
   LinkTopic       =   "Form1"
   ScaleHeight     =   2970
   ScaleWidth      =   6360
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Status_Oper_SAT 
      Caption         =   "Status_Oper_SAT"
      Height          =   735
      Left            =   120
      TabIndex        =   2
      Top             =   1560
      Width           =   2055
   End
   Begin VB.TextBox Text1 
      Height          =   1695
      Left            =   2400
      TabIndex        =   1
      Text            =   "Text1"
      Top             =   600
      Width           =   3735
   End
   Begin VB.CommandButton Status_SAT 
      Caption         =   "Status_SAT"
      Height          =   615
      Left            =   120
      TabIndex        =   0
      Top             =   600
      Width           =   2055
   End
   Begin VB.Label SAT 
      Caption         =   "SAT "
      Height          =   375
      Left            =   120
      TabIndex        =   3
      Top             =   120
      Width           =   1575
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit


Private Sub Status_Oper_SAT_Click()
Dim ret As String
Dim aret As String

ret = ConsultarStatusOperacional(12355, 123123123)
Text1.Text = ret

aret = CStr(ret)


End Sub

Private Sub Status_SAT_Click()

Dim ret As String

ret = (ConsultarSAT(12345))

Text1.Text = ret

MsgBox ("TESTE " & ret)


End Sub

