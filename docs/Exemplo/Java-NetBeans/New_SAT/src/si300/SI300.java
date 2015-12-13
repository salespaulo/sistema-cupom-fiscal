/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package si300;

/**
 *
 * @author wfelix
 */
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;


public interface SI300 extends StdCallLibrary {
    SI300 INSTANCE = (SI300) Native.loadLibrary("C:\\SWEDA\\Impressora Térmica não fiscal Série SI300\\SI300.dll", SI300.class);
    
        public int SI300_eBuscarPortaVelocidade();
	public int SI300_iImprimirTexto(String texto,int tam);
        public int SI300_iImprimirBMP(String pszArqOrigem);
        public int SI300_iImprimirImagem(String pszArqOrigem);
        public int SI300_iImprimirXML(String pszPath, String ptAutorizacao, String dhRecto, int tpCupom, String CID, String CSC, int ViaEstab, boolean Endereco);
        public int SI300_rConsultaStatusImpressora (int pszIndice, int pszTipoRetorno, byte[] pszRetornar);

        //SI300_iImprimirXML(char *pszPath, char* ptAutorizacao, char* dhRecto , int tpCupom)
        
        public int SI300_iImprimirXMLString(String stringXml, String ptAutorizacao, String dhRecto, int tpCupom, String CIDTOKEN, String CSC, int via, boolean Endereco);


        public int SI300_fecharPorta();
        public int SI300_rStatusGaveta(int[] GavetaStatus);
        public int SI300_regCodePageAutomatico(String pszParametro);
        public int SI300_iAcionarGaveta();
        public int SI300_rStatusGuilhotina();


    
    
}
