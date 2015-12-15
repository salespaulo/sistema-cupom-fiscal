/**
 * jobmanager-core
 * 
 * Criada em 15/03/2011 15:09:45
 * 
 * Direito de cópia reservado à Certisign Certificadora Digital S.A.
 * Todos os direitos são reservador em propriedade dda empresa
 * ------------- Certisign Certificadora Digital S.A. --------------
 * O uso deste produto é sujeito aos termos de licença
 */
package br.com.sweda.sistema.cupom.fiscal.integration.xml;

import br.com.sweda.sistema.cupom.fiscal.integration.xml.tags.*;
import com.thoughtworks.xstream.XStream;

class XStreamFactory {

	private static class XStreamCupomFiscal extends XStream {
		/** Construtor que configura o {@link XStream} para ler o xml do cupom fiscal */
		private XStreamCupomFiscal() {
			super();
			this.alias("CFe", CFe.class);
			this.alias("CanonicalizationMethod", CanonicalizationMethod.class);
			this.alias("COFINS", COFINS.class);
			this.alias("COFINSOutr", COFINSOutr.class);
			this.alias("Dest", Dest.class);
			this.alias("Det", Det.class);
			this.alias("DigestMethod", DigestMethod.class);
			this.alias("Emit", Emit.class);
			this.alias("EnderEmit", EnderEmit.class);
			this.alias("Entrega", Entrega.class);
			this.alias("ICMS", ICMS.class);
			this.alias("ICMS00", ICMS00.class);
			this.alias("ICMSTot", ICMSTot.class);
			this.alias("Ide", Ide.class);
			this.alias("imposto", Imposto.class);
			this.alias("InfCFe", InfCFe.class);
			this.addImplicitArray(InfCFe.class, "det");
			this.alias("KeyInfo", KeyInfo.class);
			this.alias("MP", MP.class);
			this.alias("Pgto", Pgto.class);
			this.alias("PIS", PIS.class);
			this.alias("PISAliq", PISAliq.class);
			this.alias("prod", Prod.class);
			this.alias("Reference", Reference.class);
			this.alias("Signature", Signature.class);
			this.alias("SignatureMethod", SignatureMethod.class);
			this.alias("SignedInfo", SignedInfo.class);
			this.alias("Total", Total.class);
			this.alias("Transform", Transform.class);
			this.alias("Transforms", Transforms.class);
			this.addImplicitArray(Transforms.class, "Transform");
			this.alias("X509Data", X509Data.class);
		}
	}

	private static final XStream xstreamCupomFiscal = new XStreamCupomFiscal();
	
	public static XStream getCupomFiscalConfig() {
		return xstreamCupomFiscal;
	}

	/** Construtor privado que não pode ser executado */
	private XStreamFactory() {
		throw new AssertionError();
	}
	
}
