/**@author Gustavo Costa
 * @version 1.0 **/

/**Declaração da classe LoginScreen. É nela que será implementada a lógica simples para efetuar o processo de
 * login.**/
public class LoginScreen 
{
	/**Nessas variáveis privadas temos os valores que estão cadastros no nosso sistema fictício. Logicamente
	 * o ideal para um sistema como esse é utilizar um banco de dados, mas nesse caso como o foco é o estudo
	 * da lógica do TDD e não a implementação de fato de uma tela de login, esses valores estão dispostos
	 * simplesmente em variáveis.**/
	private String nomeCadastrado = "Julios";
	private String senhaCadastrada = "J123";
	
	/**Esse é o método que possui a lógica simplificada para efetuar a verificação do login. Temos dois
	 * parâmetros que se referem aos dados do usuário cadastro. Após a validação temos o retorno
	 * da resposta: true ou false.**/
public boolean verificarLoginNoSistema(String nomeUsuario, String senha) 
{
	if(nomeUsuario.equals(nomeCadastrado) && senha.equals(senhaCadastrada)) 
	{
		return true;
	}else 
	{
		return false;
	}
}
}
