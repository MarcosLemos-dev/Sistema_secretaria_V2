package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*realmente e somente receber alguem que tem o contrato da interface de permitir acesso e chamar a autenticação*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
	}
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
