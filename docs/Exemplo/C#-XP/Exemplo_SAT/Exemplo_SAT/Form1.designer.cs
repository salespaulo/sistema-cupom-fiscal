namespace Exemplo_SAT
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnVender = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.txtAtivacao = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.txtLog = new System.Windows.Forms.RichTextBox();
            this.btnLog = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnVender
            // 
            this.btnVender.Location = new System.Drawing.Point(30, 38);
            this.btnVender.Name = "btnVender";
            this.btnVender.Size = new System.Drawing.Size(174, 23);
            this.btnVender.TabIndex = 0;
            this.btnVender.Text = "Vender";
            this.btnVender.UseVisualStyleBackColor = true;
            this.btnVender.Click += new System.EventHandler(this.btnVender_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(27, 13);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(71, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Cod.Ativação";
            // 
            // txtAtivacao
            // 
            this.txtAtivacao.Location = new System.Drawing.Point(104, 12);
            this.txtAtivacao.Name = "txtAtivacao";
            this.txtAtivacao.Size = new System.Drawing.Size(100, 20);
            this.txtAtivacao.TabIndex = 2;
            this.txtAtivacao.UseSystemPasswordChar = true;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(30, 115);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(174, 23);
            this.button1.TabIndex = 3;
            this.button1.Text = "Consultar SAT";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtLog
            // 
            this.txtLog.Location = new System.Drawing.Point(210, 10);
            this.txtLog.Name = "txtLog";
            this.txtLog.ReadOnly = true;
            this.txtLog.Size = new System.Drawing.Size(569, 296);
            this.txtLog.TabIndex = 4;
            this.txtLog.Text = "";
            // 
            // btnLog
            // 
            this.btnLog.Location = new System.Drawing.Point(30, 77);
            this.btnLog.Name = "btnLog";
            this.btnLog.Size = new System.Drawing.Size(172, 23);
            this.btnLog.TabIndex = 5;
            this.btnLog.Text = "Extrair Log";
            this.btnLog.UseVisualStyleBackColor = true;
            this.btnLog.Click += new System.EventHandler(this.btnLog_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(791, 333);
            this.Controls.Add(this.btnLog);
            this.Controls.Add(this.txtLog);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtAtivacao);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnVender);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnVender;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtAtivacao;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.RichTextBox txtLog;
        private System.Windows.Forms.Button btnLog;
    }
}

