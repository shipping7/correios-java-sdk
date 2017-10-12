package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import br.com.correios.api.postagem.destinatario.DestinatarioDoObjeto;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto;
import br.com.correios.api.postagem.plp.EnderecoBuilder.EnderecoComUfBuilder;
import br.com.correios.api.postagem.plp.ObjetoPlpBuilder.ObjetoPlpComServicoAdicionalBuilder;

public class ObjetoPlpBuilder {

	public ObjetoPlpComDimensoesDoObjetoBuilder comDimensoes(DimensoesDoObjetoPlp dimensoesDoObjeto) {
		return null;
	}
	
	public class ObjetoPlpComDimensoesDoObjetoBuilder {

		public ObjetoPlpComPesoDoObjetoPlpBuilder comPeso(PesoDoObjetoPlp pesoDoObjeto) {
			return null;
		}
		
	}
	
	public class ObjetoPlpComPesoDoObjetoPlpBuilder {

		public ObjetoPlpComCodigoDeServicoBuilder usandoCodigoDeServico(String codigoDeServico) {
			return null;
		}
		
	}
	
	public class ObjetoPlpComCodigoDeServicoBuilder {

		public ObjetoPlpComNumeroDaEtiquetaBuilder comNumeroDaEtiqueta(String numeroDaEtiqueta) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class ObjetoPlpComNumeroDaEtiquetaBuilder {

		public ObjetoPlpComDestinatarioBuilder paraDestinatario(DestinatarioDoObjetoPlp destinatarioDoObjetoPlp) {
			return null;
		}
		
	}
	
	public class ObjetoPlpComDestinatarioBuilder {

		public ObjetoPlp build() {
			return null;
		}

		public ObjetoPlpComServicoAdicionalBuilder adicionandoServicoAdicionalComCodigo(String codigoServicoAdicional) {
			return null;
		} 
		
	}
	
	public class ObjetoPlpComServicoAdicionalBuilder {

		public ObjetoPlpComValorDeclaradoDoServicoAdicionalBuilder comValorDeclarado(BigDecimal valorDeclaradoDoServicoAdicional) {
			return null;
		}

		public ObjetoPlpComServicoAdicionalBuilder adicionandoServicoAdicionalComCodigo(String string) {
			return null;
		}
		
	}
	
	public class ObjetoPlpComValorDeclaradoDoServicoAdicionalBuilder {

		public ObjetoPlp build() {
			return null;
		}
		
	}

}
