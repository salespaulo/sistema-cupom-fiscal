package br.com.sweda.sistema.cupom.fiscal.integration.si150;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface Si150 extends StdCallLibrary {

    Si150 INSTANCE = (Si150) Native.loadLibrary("D:\\\\Sat\\src\\main\\resources\\SI300", Si150.class);

    public int SI300_iImprimirXML(String pszPath, String ptAutorizacao,String dhRecto, int tpCupom);
    
    public int SI300_eBuscarPortaVelocidade();
    
    

}
