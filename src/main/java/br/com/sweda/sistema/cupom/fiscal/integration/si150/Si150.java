package br.com.sweda.sistema.cupom.fiscal.integration.si150;

import br.com.sweda.sistema.cupom.fiscal.integration.sat.SAT;
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface Si150 extends StdCallLibrary {

    SAT INSTANCE = (SAT) Native.loadLibrary("D:\\\\salespaulo\\Sat\\Sat\\src\\main\\resources\\SI300", Si150.class);

    int SI300_eBuscarPortaVelocidade();

}
