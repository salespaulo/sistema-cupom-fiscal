using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Runtime.InteropServices;

namespace Exemplo_SAT
{
    public partial class Form1 : Form
    {
        Random rdn = new Random(); // gerar numeros aleatorios
        string ret;
        public Form1()
        {
            InitializeComponent();
        }

        private void btnVender_Click(object sender, EventArgs e)
        {
            string cupomXml;

            if (txtAtivacao.Text == "")
            {
                MessageBox.Show("Informe o Código de Ativação", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
                txtAtivacao.Focus();
                return;
            }

            cupomXml = LerArqTxt(PegarPathArq());  // sempre mandar dados para o SAT em UTF8 , a função ler arquivo ja faz a concersão.

            ret = Marshal.PtrToStringAnsi(Declaracao_Func_SAT.EnviarDadosVenda(rdn.Next(999999),ConverterToUTF8(txtAtivacao.Text),cupomXml));           

            MessageBox.Show(Sep_Delimitador('|', 3, ret));        


        }

        private string PegarPathArq()
        {
            OpenFileDialog abrir = new OpenFileDialog();
            abrir.InitialDirectory = "";

            abrir.Filter = "txt (*.txt)|*.txt| xml (*.xml)|*.xml";
            abrir.Title = "Selecione um Arquivo XML ou TXT";
            abrir.CheckFileExists = true;
            abrir.CheckPathExists = true;
            abrir.FilterIndex = 2;

            if (abrir.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {


                return abrir.FileName;


            }
            else
            {
                return "Cancelado";
            }

        }

        private string LerArqTxt(string NomeArq)
        {

            try
            {
                StreamReader arq = new StreamReader(NomeArq);


                NomeArq = arq.ReadToEnd();


                arq.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("ERRO: " + ex.ToString(), "Erro");
                return "";
            }

            return ConverterToUTF8(NomeArq);

        }

        private string ConverterToUTF8(string dados)  // sempre mandar os dados para o sat em UT8
        {
            byte[] utf16Bytes = Encoding.Unicode.GetBytes(dados);
            byte[] utf8Bytes = Encoding.Convert(Encoding.Unicode, Encoding.UTF8, utf16Bytes);

            return Encoding.Default.GetString(utf8Bytes);
        }

        private string Sep_Delimitador(char sep, int posicao, string dados)
        {
            string[] ret_dados = dados.Split(sep);

            return ret_dados[posicao];

        }

        private string Base64ToString(string base64)  // caso queira tirar o arquivo de base 64
        {
            byte[] arq;

            System.Text.ASCIIEncoding enc = new System.Text.ASCIIEncoding();

            arq = Convert.FromBase64String(base64);
            base64 = enc.GetString(arq);
            return base64;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            

            ret = Marshal.PtrToStringAnsi(Declaracao_Func_SAT.ConsultarSAT(rdn.Next(999999)));

            MessageBox.Show(Sep_Delimitador('|', 2, ret));


        }

        private void btnLog_Click(object sender, EventArgs e)
        {

            ret = Marshal.PtrToStringAnsi(Declaracao_Func_SAT.ExtrairLogs(rdn.Next(999999),ConverterToUTF8(txtAtivacao.Text)));

            txtLog.Text = Base64ToString(Sep_Delimitador('|', 5, ret));


        }
    }
}
