/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 // Criando instâncias de Aluno
         Aluno a1 = new Aluno("inicio", 42);
         Aluno a2 = new Aluno("meio", 31);
         Aluno a3 = new Aluno("Fim", 23);
 
         // Criando instância da ListaSimples
         ListaSimples lista = new ListaSimples();
         
         // Adicionando elementos no início da lista
         lista.adicionaInicio(a1);  // funciona
         lista.adicionaInicio(a2);  // funciona
         lista.adicionaInicio(a3);  // funciona    
         System.out.println(lista.tamanho());    
        
         // Removendo elemento do início
         lista.removeInicio();  // funciona
         
         // Recuperando elementos da lista
         a1 = (Aluno) lista.Recupera(0);
         a2 = (Aluno) lista.Recupera(1);

         System.out.println(lista.tamanho());
 
         // Verificando se um dado existe na lista
         System.out.println(lista.existeDado(a3));
 
         // Exibindo os dados dos alunos recuperados
         System.out.println(a1.getNome() + " - " + a1.getIdade());  // funciona
         System.out.println(a2.getNome() + " - " + a2.getIdade());  // funciona
         
         // Removendo elemento do fim da lista
         lista.removeFim();
         System.out.println(lista.tamanho());
         System.out.println(lista.existeDado(a2));
 
         // Limpando a lista
         lista.limpa();
         System.out.println(lista.tamanho());
         lista.adicionaInicio(a1);  // funciona
         lista.adicionaInicio(a2);  // funciona
         lista.adicionaInicio(a3);  // funciona    
        
         System.out.println( lista.Recupera(0));
         System.out.println( lista.Recupera(1));
        System.out.println( lista.Recupera(2));
         System.out.println(lista.tamanho()); 
         lista.adiciona(a3, 1);
        
        System.out.println( lista.Recupera(0));
        System.out.println( lista.Recupera(1));
        System.out.println( lista.Recupera(2));
        System.out.println( lista.Recupera(3));
         System.out.println(lista.tamanho()); 
	}
}
