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

//Main: Cria as vars de todos os packages
	//var escolherNome = new AnnotationConfigApplicationContext(nomeClasse.class)
	//var escolherNome = new nomeClasse()
						//se não usar muita lógica 
	//var escolherNome = config.getBean(nomeClasse.class)
						//se usar lógica em outros packages
	//Usa os Set, Get e Metodos.

//@Qualifier("nome") no próprio component - Quando tem mais que 1
	//Também usa antes do nome da Interface no Services(no this)

//@Service: no package serviços
//@Component: no package repositorios
//Metodo: public String toString.
//Annotations: Components - Nunca em Interfaces
//Instancias: new Person