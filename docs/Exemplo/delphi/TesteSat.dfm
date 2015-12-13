object Form1: TForm1
  Left = 190
  Top = 109
  Width = 982
  Height = 551
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnActivate = FormActivate
  PixelsPerInch = 96
  TextHeight = 13
  object Splitter1: TSplitter
    Left = 537
    Top = 0
    Height = 480
  end
  object StatusBar1: TStatusBar
    Left = 0
    Top = 480
    Width = 966
    Height = 33
    Panels = <
      item
        Width = 50
      end
      item
        Width = 100
      end
      item
        Width = 350
      end
      item
        Width = 50
      end>
  end
  object Panel1: TPanel
    Left = 540
    Top = 0
    Width = 426
    Height = 480
    Align = alClient
    Caption = 'Panel1'
    TabOrder = 1
    object GroupBox3: TGroupBox
      Left = 1
      Top = 1
      Width = 424
      Height = 160
      Align = alTop
      Caption = 'Emitente'
      TabOrder = 0
      object Label2: TLabel
        Left = 16
        Top = 24
        Width = 30
        Height = 13
        Caption = 'CNPJ:'
      end
      object Label3: TLabel
        Left = 16
        Top = 48
        Width = 13
        Height = 13
        Caption = 'IE:'
      end
      object Label4: TLabel
        Left = 16
        Top = 72
        Width = 15
        Height = 13
        Caption = 'IM:'
      end
      object Label5: TLabel
        Left = 16
        Top = 104
        Width = 47
        Height = 13
        Caption = 'CNPJ AC:'
      end
      object Label6: TLabel
        Left = 16
        Top = 125
        Width = 46
        Height = 13
        Caption = 'SIGN AC:'
      end
      object EdCNPJ: TMaskEdit
        Left = 56
        Top = 24
        Width = 137
        Height = 21
        TabOrder = 0
      end
      object Button4: TButton
        Left = 208
        Top = 16
        Width = 97
        Height = 41
        Caption = '&Salvar'
        TabOrder = 4
        OnClick = Button4Click
      end
      object EDIE: TMaskEdit
        Left = 56
        Top = 48
        Width = 137
        Height = 21
        TabOrder = 1
      end
      object EDIM: TMaskEdit
        Left = 56
        Top = 72
        Width = 137
        Height = 21
        TabOrder = 2
      end
      object EdCNPJAC: TMaskEdit
        Left = 72
        Top = 96
        Width = 353
        Height = 21
        TabOrder = 3
      end
      object Button5: TButton
        Left = 320
        Top = 16
        Width = 97
        Height = 41
        Caption = '&Carregar'
        TabOrder = 5
        OnClick = Button5Click
      end
      object EdSignAC: TMaskEdit
        Left = 72
        Top = 121
        Width = 353
        Height = 21
        TabOrder = 6
        Text = 'SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT'
      end
    end
    object Conteudo: TRichEdit
      Left = 1
      Top = 241
      Width = 424
      Height = 238
      Align = alClient
      Font.Charset = ANSI_CHARSET
      Font.Color = clWindowText
      Font.Height = -13
      Font.Name = 'MS Sans Serif'
      Font.Style = []
      ParentFont = False
      ScrollBars = ssBoth
      TabOrder = 1
    end
    object Panel4: TPanel
      Left = 1
      Top = 161
      Width = 424
      Height = 80
      Align = alTop
      TabOrder = 2
      object Button1: TButton
        Left = 16
        Top = 8
        Width = 89
        Height = 25
        Caption = 'ConsultarSAT'
        TabOrder = 0
        OnClick = Button1Click
      end
      object Edit1: TEdit
        Left = 208
        Top = 40
        Width = 193
        Height = 21
        TabOrder = 1
      end
      object BtExtrairLogs: TButton
        Left = 112
        Top = 8
        Width = 89
        Height = 25
        Caption = 'ExtrairLogs'
        TabOrder = 2
        OnClick = BtExtrairLogsClick
      end
      object BtConsultarSessao: TButton
        Left = 16
        Top = 40
        Width = 184
        Height = 23
        Caption = 'Consultar Numero Sess'#227'o'
        TabOrder = 3
        OnClick = BtConsultarSessaoClick
      end
    end
    object CupomBase64: TMemo
      Left = 8
      Top = 488
      Width = 65
      Height = 49
      TabOrder = 3
      Visible = False
    end
    object XML: TMemo
      Left = 88
      Top = 488
      Width = 329
      Height = 49
      Lines.Strings = (
        'XML')
      TabOrder = 4
      Visible = False
    end
  end
  object Panel2: TPanel
    Left = 0
    Top = 0
    Width = 537
    Height = 480
    Align = alLeft
    Caption = 'Panel2'
    TabOrder = 2
    object GroupBox2: TGroupBox
      Left = 1
      Top = 1
      Width = 535
      Height = 64
      Align = alTop
      Caption = 'C'#243'digo de Ativa'#231#227'o'
      TabOrder = 0
      object Label1: TLabel
        Left = 16
        Top = 24
        Width = 96
        Height = 13
        Caption = 'C'#243'digo de Ativa'#231#227'o:'
      end
      object EdCodAtivacao: TMaskEdit
        Left = 128
        Top = 24
        Width = 137
        Height = 21
        TabOrder = 0
        Text = 'EdCodAtivacao'
        OnExit = EdCodAtivacaoExit
      end
      object BtFimaFim: TButton
        Left = 272
        Top = 16
        Width = 97
        Height = 41
        Caption = 'Teste &Fim a Fim'
        TabOrder = 1
        OnClick = BtFimaFimClick
      end
      object BtStOperacional: TButton
        Left = 376
        Top = 15
        Width = 153
        Height = 41
        Caption = 'Consulta Status Operacional'
        TabOrder = 2
        OnClick = BtStOperacionalClick
      end
    end
    object GroupBox1: TGroupBox
      Left = 1
      Top = 65
      Width = 535
      Height = 414
      Align = alClient
      Caption = 'EnviarDadosVenda'
      TabOrder = 1
      object ListEnviar: TListBox
        Left = 2
        Top = 97
        Width = 531
        Height = 315
        Align = alClient
        ItemHeight = 13
        MultiSelect = True
        PopupMenu = MenuList
        TabOrder = 0
      end
      object Panel3: TPanel
        Left = 2
        Top = 15
        Width = 531
        Height = 82
        Align = alTop
        TabOrder = 1
        object BtEnviarDadosVenda: TButton
          Left = 9
          Top = 8
          Width = 137
          Height = 41
          Caption = '&EnviarDadosVendas'
          TabOrder = 0
          OnClick = BtEnviarDadosVendaClick
        end
        object BtCarregaXML: TButton
          Left = 400
          Top = 8
          Width = 122
          Height = 41
          Caption = 'Carregar Arquivos &XML'
          TabOrder = 1
          OnClick = BtCarregaXMLClick
        end
        object BtCancelar: TButton
          Left = 152
          Top = 8
          Width = 105
          Height = 41
          Caption = 'Cancelar CFe-SAT'
          TabOrder = 2
          OnClick = BtCancelarClick
        end
      end
    end
  end
  object MenuList: TPopupMenu
    Left = 56
    Top = 120
    object InserirItem1: TMenuItem
      Caption = 'Inserir Item'
      OnClick = InserirItem1Click
    end
    object ExcluirItem1: TMenuItem
      Caption = 'Excluir Item'
      OnClick = ExcluirItem1Click
    end
    object E1: TMenuItem
      Caption = 'Excluir TODOS'
      OnClick = E1Click
    end
  end
  object OpenDialog1: TOpenDialog
    Options = [ofHideReadOnly, ofAllowMultiSelect, ofEnableSizing]
    Left = 752
    Top = 16
  end
  object IdEncoderMIME1: TIdEncoderMIME
    FillChar = '='
    Left = 273
    Top = 217
  end
  object IdDecoderMIME1: TIdDecoderMIME
    FillChar = '='
    Left = 305
    Top = 217
  end
end
