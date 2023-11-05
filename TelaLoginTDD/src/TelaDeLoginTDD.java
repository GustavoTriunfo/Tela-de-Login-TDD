/**@author Gustavo Costa
 * @version 1.0 **/

/**Esse é o import do método assertEquals para utiliza-lo no projeto.**/
import static org.junit.Assert.assertEquals;
/**Esse é o import do JUnit para utiliza-lo no projeto como framework de testagem.**/
import org.junit.jupiter.api.Test;

/**A classe TelaDeLoginTDD foi criada para seguir a prática de desenvolvimento de projeto a partir de teste. 
 * Nessa dinâmica foi criado primeiramente o teste com os itens que eram necessários em seu interior. Aso
 * se executar o código é claro que ele não ia funcionar pois a classe e método a serem testados não foram
 * implementados ainda, só foram criados os nomes deles para a estrutura do teste unitário.**/
public class TelaDeLoginTDD {
	
	/**O método de teste verificarLogin serve para desenvolver a lógica de um programa onde há a necessidade
	 * de efetuar o login num sistema. Do que eu preciso? Uma classe, método de verificação... etc.
	 * Depois do desenvolvimento TDD ao rodar esse mesmo teste ele vai funcionar, caso tudo tenha sido
	 * implementado corretamente.**/
	@Test
	public void verificarLogin(){
		/**Declaração e criação do objeto da classe LoginScreen.**/
		LoginScreen telaLogin = new LoginScreen();
		
		/**Variavel que recebe a resultante da execução do método verificarLoginNoSistema com os argumentos
		 * que escolhi testar.**/
		boolean resultado = telaLogin.verificarLoginNoSistema("Julios", "J124");
		/**Método de comparação de realidade vs expectativa. Nesse caso o resultado esperado é false.**/
		assertEquals(resultado, false);
	}
}
