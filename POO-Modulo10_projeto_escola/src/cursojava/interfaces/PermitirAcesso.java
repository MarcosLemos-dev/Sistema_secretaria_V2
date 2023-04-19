package cursojava.interfaces;
/*essa interface será o nosso contrato de autenticação*/
public interface PermitirAcesso {
	public boolean autenticar(String login, String senha);/*declaração do metodo autenticar com parametros login e senha*/
	public boolean autenticar();/*declaração do metodo autenticar com parametros login e senha*/

}
