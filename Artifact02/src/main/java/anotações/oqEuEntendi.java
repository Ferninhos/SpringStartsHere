package anotações;
//Models: onde eu coloco as classes
	//tipo o que terá no app, author, texto dele.

//Repositorys: Interface e Classe.
	//Interface: O que vai fazer com os dados
		//Cria objetos: Store, Find, Delete
			//*relacionados ao Banco de Dados*
	//Classe: Implementa os Objetos coloca
		//a lógica neles e oq vão fazer.

//Proxies: Mesma coisa do Repositorys
	//Mas se relaciona com coisas de fora
		//Send para e-mail, sms.

//Services: Seria tipo uma classe, porém usando
	//os objetos criados na interface e proxy
		//usando this, mas nunca set e get
			//cria um método
			//Metodo: public String toString.

//Main: Cria as vars de todos os packages
	//var nomeCriadoNoService = new nomeDoJava_File(Classe)
		//No private|				|*Interface Não*
	//Usa os Set, Get e Metodos.

//Annotations: Components - Nunca em Interfaces