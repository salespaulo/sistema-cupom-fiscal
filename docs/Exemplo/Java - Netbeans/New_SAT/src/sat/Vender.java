/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import si300.SI300;

/**
 *
 * @author wfelix
 */
public class Vender extends javax.swing.JFrame {
    
    TelaSAT enviar;
    
    public void receber (String rec){
       jPasswordField1.setText(rec);
    }

 
    public Vender() {
        initComponents();
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DADOS CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("UF:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Logradouro:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Nº:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Compl.:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Bairro:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Municipio:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextField3.setText("Rua Dona Brigida");
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 190, -1));

        jTextField4.setText("713");
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, -1));

        jTextField5.setText(" Matriz");
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        jTextField6.setText("Vila Mariana");
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, -1));

        jTextField7.setText("São Paulo");
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, -1));

        jTextField8.setText("SP");
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 130));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("CNPJ:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel6.setText("NOME:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextField1.setText("Sweda Informatica Ltda");
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 210, -1));

        jTextField2.setText("53485215000106");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENDEREÇO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 260));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENDAS CF-e S@T");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 290, 90));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar CF-e");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 100, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FORMA DE PAGAMENTO");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setText("Código de Ativação");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        jLabel14.setText("Código: ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel15.setText("Produto:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel16.setText("NCM:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel17.setText("CFOP:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel18.setText("UND:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel19.setText("Quantidade:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel20.setText("Valor un:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel21.setText("TOTAL:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 20));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DADOS PRODUTO");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Dinheiro");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextField9.setText("7899264308112");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, -1));

        jTextField10.setText("Pao Forma Integral Light");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 200, -1));

        jTextField11.setText("85447030");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 70, -1));

        jTextField12.setText("5401");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 40, -1));

        jTextField13.setText("un");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 30, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("R$ 2.00");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, 20));

        jTextField14.setEditable(false);
        jTextField14.setText("20000");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 40, -1));

        jTextField15.setEditable(false);
        jTextField15.setText("1000");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 40, -1));

        jTextField16.setEditable(false);
        jTextField16.setText("3.00");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, -1));

        jLabel25.setText("Salvar XML");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jTextField17.setText("C:\\Teste\\cfe");
        jPanel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 290, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random gerador = new Random();
        int cupon = gerador.nextInt(999999);
        String nome="", cnpj="", lg="", nume="", cmpl="", bairro="", munic="", uf="";
        String codprod, desc, ncm, cfop, un, qtde, valorUnt, ptgo ="";
        
        nome = jTextField1.getText();
        cnpj = jTextField2.getText();
        lg = jTextField3.getText();
        nume = jTextField4.getText();
        cmpl = jTextField5.getText();
        bairro = jTextField6.getText();
        munic = jTextField7.getText();
        uf = jTextField8.getText();
        //Produto 
        codprod = jTextField9.getText();
        desc = jTextField10.getText();
        ncm = jTextField11.getText();
        cfop = jTextField12.getText();
        un = jTextField13.getText();
        qtde = jTextField14.getText();
        valorUnt = jTextField15.getText();
        ptgo = jTextField16.getText();
        
        String cf_e= null, cf=null;
        
        cf= "<CFe>\n" +
"  <infCFe versaoDadosEnt=\"0.06\">\n" +
"  <ide>\n" +
"  <CNPJ>10615281000140</CNPJ> \n" +
"  <signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC> \n" +
"  <numeroCaixa>233</numeroCaixa> \n" +
"  </ide>\n" +
"  <emit>\n" +
"  <CNPJ>53485215000106</CNPJ> \n" +
"  <IE>111072115110</IE> \n" +
"  <IM>111111111</IM> \n" +
"  <cRegTribISSQN>3</cRegTribISSQN> \n" +
"  <indRatISSQN>S</indRatISSQN> \n" +
"  </emit>\n" +
"  <dest>\n" +           
"  <CNPJ>"+cnpj+"</CNPJ> \n" +
"  <xNome>"+nome+"</xNome> \n" +
"  </dest>\n" +
"  <entrega>\n" +
"  <xLgr>"+lg+"</xLgr> \n" +
"  <nro>"+nume+"</nro> \n" +
"  <xCpl>"+cmpl+"</xCpl> \n" +
"  <xBairro>"+bairro+"</xBairro> \n" +
"  <xMun>"+munic+"</xMun> \n" +
"  <UF>"+uf+"</UF> \n" +
"  </entrega>\n" +
"  <det nItem=\"1\">\n" +
"  <prod>\n" +
"  <cProd>"+codprod+"</cProd> \n" +
"  <xProd>"+desc+"</xProd> \n" +
"  <NCM>"+ncm+"</NCM> \n" +
"  <CFOP>"+cfop+"</CFOP> \n" +
"  <uCom>"+un+"</uCom> \n" +
"  <qCom>2.0000</qCom> \n" +
"  <vUnCom>2.000</vUnCom> \n" +
"  <indRegra>T</indRegra> \n" +
"  <vDesc>0.00</vDesc> \n" +
"  <vOutro>0.00</vOutro> \n" +
"  </prod>\n" +
"  <imposto>\n" +
"  <vItem12741>7.00</vItem12741> \n" + 
"  <ICMS>\n" +
"  <ICMS00>\n" +
"  <Orig>0</Orig> \n" +
"  <CST>00</CST> \n" +
"  <pICMS>07.00</pICMS> \n" +
"  </ICMS00>\n" +
"  </ICMS>\n" +
"  <PIS>\n" +
"  <PISAliq>\n" +
"  <CST>02</CST> \n" +
"  <vBC>000000000001.00</vBC> \n" +
"  <pPIS>0.0500</pPIS> \n" +
"  </PISAliq>\n" +
"  </PIS>\n" +
"  <COFINS>\n" +
"  <COFINSOutr>\n" +
"  <CST>99</CST> \n" +
"  <vBC>1.00</vBC> \n" +
"  <pCOFINS>5.0000</pCOFINS> \n" +
"  </COFINSOutr>\n" +
"  </COFINS>\n" +
"  </imposto>\n" +
"  </det>\n" +
"  <det nItem=\"2\">\n" +
"  <prod>\n" +
"  <cProd>"+codprod+"</cProd> \n" +
"  <xProd>"+desc+"</xProd> \n" +
"  <NCM>"+ncm+"</NCM> \n" +
"  <CFOP>"+cfop+"</CFOP> \n" +
"  <uCom>"+un+"</uCom> \n" +
"  <qCom>2.0000</qCom> \n" +
"  <vUnCom>1.000</vUnCom> \n" +
"  <indRegra>T</indRegra> \n" +
"  <vDesc>0.00</vDesc> \n" +
"  <vOutro>0.00</vOutro> \n" +
"  </prod>\n" +
"  <imposto>\n" +
"  <vItem12741>55.00</vItem12741> \n" +
"  <ICMS>\n" +
"  <ICMS00>\n" +
"  <Orig>0</Orig> \n" +
"  <CST>00</CST> \n" +
"  <pICMS>07.00</pICMS> \n" +
"  </ICMS00>\n" +
"  </ICMS>\n" +
"  <PIS>\n" +
"  <PISAliq>\n" +
"  <CST>02</CST> \n" +
"  <vBC>000000000001.00</vBC> \n" +
"  <pPIS>0.0500</pPIS> \n" +
"  </PISAliq>\n" +
"  </PIS>\n" +
"  <COFINS>\n" +
"  <COFINSOutr>\n" +
"  <CST>99</CST> \n" +
"  <vBC>1.00</vBC> \n" +
"  <pCOFINS>5.0000</pCOFINS> \n" +
"  </COFINSOutr>\n" +
"  </COFINS>\n" +
"  </imposto>\n" +
"  </det>\n"+  
                "  <det nItem=\"3\">\n" +
"  <prod>\n" +
"  <cProd>"+codprod+"</cProd> \n" +
"  <xProd>"+desc+"</xProd> \n" +
"  <NCM>"+ncm+"</NCM> \n" +
"  <CFOP>"+cfop+"</CFOP> \n" +
"  <uCom>"+un+"</uCom> \n" +
"  <qCom>3.0000</qCom> \n" +
"  <vUnCom>1.000</vUnCom> \n" +
"  <indRegra>T</indRegra> \n" +
"  <vDesc>0.00</vDesc> \n" +
"  <vOutro>0.00</vOutro> \n" +
"  </prod>\n" +
"  <imposto>\n" +
"  <vItem12741>7.00</vItem12741> \n" + 
"  <ICMS>\n" +
"  <ICMS00>\n" +
"  <Orig>0</Orig> \n" +
"  <CST>00</CST> \n" +
"  <pICMS>07.00</pICMS> \n" +
"  </ICMS00>\n" +
"  </ICMS>\n" +
"  <PIS>\n" +
"  <PISAliq>\n" +
"  <CST>02</CST> \n" +
"  <vBC>000000000001.00</vBC> \n" +
"  <pPIS>0.0500</pPIS> \n" +
"  </PISAliq>\n" +
"  </PIS>\n" +
"  <COFINS>\n" +
"  <COFINSOutr>\n" +
"  <CST>99</CST> \n" +
"  <vBC>1.00</vBC> \n" +
"  <pCOFINS>5.0000</pCOFINS> \n" +
"  </COFINSOutr>\n" +
"  </COFINS>\n" +
"  </imposto>\n" +
"  </det>\n" +
                "  <det nItem=\"4\">\n" +
"  <prod>\n" +
"  <cProd>"+codprod+"</cProd> \n" +
"  <xProd>"+desc+"</xProd> \n" +
"  <NCM>"+ncm+"</NCM> \n" +
"  <CFOP>"+cfop+"</CFOP> \n" +
"  <uCom>"+un+"</uCom> \n" +
"  <qCom>4.0000</qCom> \n" +
"  <vUnCom>1.000</vUnCom> \n" +
"  <indRegra>T</indRegra> \n" +
"  <vDesc>0.00</vDesc> \n" +
"  <vOutro>0.00</vOutro> \n" +
"  </prod>\n" +
"  <imposto>\n" +
"  <vItem12741>7.00</vItem12741> \n" + 
"  <ICMS>\n" +
"  <ICMS00>\n" +
"  <Orig>0</Orig> \n" +
"  <CST>00</CST> \n" +
"  <pICMS>07.00</pICMS> \n" +
"  </ICMS00>\n" +
"  </ICMS>\n" +
"  <PIS>\n" +
"  <PISAliq>\n" +
"  <CST>02</CST> \n" +
"  <vBC>000000000001.00</vBC> \n" +
"  <pPIS>0.0500</pPIS> \n" +
"  </PISAliq>\n" +
"  </PIS>\n" +
"  <COFINS>\n" +
"  <COFINSOutr>\n" +
"  <CST>99</CST> \n" +
"  <vBC>1.00</vBC> \n" +
"  <pCOFINS>5.0000</pCOFINS> \n" +
"  </COFINSOutr>\n" +
"  </COFINS>\n" +
"  </imposto>\n" +
"  </det>\n" +
                "  <det nItem=\"5\">\n" +
"  <prod>\n" +
"  <cProd>"+codprod+"</cProd> \n" +
"  <xProd>"+desc+"</xProd> \n" +
"  <NCM>"+ncm+"</NCM> \n" +
"  <CFOP>"+cfop+"</CFOP> \n" +
"  <uCom>"+un+"</uCom> \n" +
"  <qCom>5.0000</qCom> \n" +
"  <vUnCom>1.000</vUnCom> \n" +
"  <indRegra>T</indRegra> \n" +
"  <vDesc>0.00</vDesc> \n" +
"  <vOutro>0.00</vOutro> \n" +
"  </prod>\n" +
"  <imposto>\n" +
"  <vItem12741>7.00</vItem12741> \n" + 
"  <ICMS>\n" +
"  <ICMS00>\n" +
"  <Orig>0</Orig> \n" +
"  <CST>00</CST> \n" +
"  <pICMS>07.00</pICMS> \n" +
"  </ICMS00>\n" +
"  </ICMS>\n" +
"  <PIS>\n" +
"  <PISAliq>\n" +
"  <CST>02</CST> \n" +
"  <vBC>000000000001.00</vBC> \n" +
"  <pPIS>0.0500</pPIS> \n" +
"  </PISAliq>\n" +
"  </PIS>\n" +
"  <COFINS>\n" +
"  <COFINSOutr>\n" +
"  <CST>99</CST> \n" +
"  <vBC>1.00</vBC> \n" +
"  <pCOFINS>5.0000</pCOFINS> \n" +
"  </COFINSOutr>\n" +
"  </COFINS>\n" +
"  </imposto>\n" +
"  </det>\n" +
"<total>\n" +
		"<DescAcrEntr>\n" +
				"<vAcresSubtot>0.11</vAcresSubtot>\n" +
			"</DescAcrEntr>\n" +
			"<vCFeLei12741>0.44</vCFeLei12741>\n" +
		"</total>\n" +
"  <pgto>\n" +
"  <MP>\n" +
"  <cMP>01</cMP> \n" +
"  <vMP>1.00</vMP> \n" +
"  </MP>\n" +
"  <MP>\n" +
"  <cMP>02</cMP> \n" +
"  <vMP>1.00</vMP> \n" +
"  </MP>\n" +
"  <MP>\n" +
"  <cMP>03</cMP> \n" +
"  <vMP>1.00</vMP> \n" +
"  </MP>\n" +
"  <MP>\n" +
"  <cMP>04</cMP> \n" +
"  <vMP>15.12</vMP> \n" +
"  <cAdmC>025</cAdmC> \n" +
"  </MP>\n" +
"  </pgto>\n" +
                "<infAdic>\n" +
"<infCpl>Voce pagou aproximadamente:R$ 0,20 de impostos federais R$ 0,24 de impostos estaduais R$ 1,97 pelos produto Fonte: IBPT       5oi7eW </infCpl>\n" +
		"</infAdic>\n" +
"  </infCFe>\n" +
"  </CFe>";
        cf_e = cf;
       String ret = SAT.INSTANCE.EnviarDadosVenda(cupon,jPasswordField1.getText(), cf_e);
       String[] reto = ret.split(Pattern.quote("|"));
       JOptionPane.showMessageDialog(null, reto[3]);
        String a = reto[6]; // string "a" recebe vetor com a base64
        byte[] byteArray = Base64.decode(a);// byteArray descodifica "a" 
        String decodedString = new String(byteArray);// String decodedString recebe byteArray.
        
          Integer.toString(cupon);
        String gv = jTextField17.getText();
                try{
                    FileWriter nf = new FileWriter(gv+"/CF-e_" + cupon + ".xml");
                       PrintWriter arq = new PrintWriter(nf);
                       arq.print(decodedString);
                       nf.close();
                    }catch(Exception erro){
                        JOptionPane.showMessageDialog(null,"Falha ao gerar arquivo");
                        
                    }
        /*envia = new Texto();
        envia.setVisible(true);
        envia.receber(decodedString);// envia para tela de texto.*/
                int tipo = 0;
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada:\n\n0 = Cupom completo\n1 = Cupom Resumido"));
       si300.SI300.INSTANCE.SI300_eBuscarPortaVelocidade();
       //si300.SI300.INSTANCE.SI300_iImprimirImagem("C:\\Documents and Settings\\wfelix\\Desktop\\download.bmp");
        SI300.INSTANCE.SI300_iImprimirXMLString(decodedString, null, null, tipo, null, null,0, true);
  
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}