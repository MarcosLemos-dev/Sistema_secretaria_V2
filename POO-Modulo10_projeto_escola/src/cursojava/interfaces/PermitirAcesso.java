package cursojava.interfaces;
/*essa interface ser� o nosso contrato de autentica��o*/
public interface PermitirAcesso {
	public boolean autenticar(String login, String senha);/*declara��o do metodo autenticar com parametros login e senha*/
	public boolean autenticar();/*declara��o do metodo autenticar com parametros login e senha*/

}
