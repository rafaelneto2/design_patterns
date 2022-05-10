# Padrões de Projeto

**Padrões de projeto** (design patterns) são soluções típicas para problemas comuns em projeto de software. Cada padrão é como uma planta de construção que você pode customizar para resolver um problema de projeto particular em seu código.

## Benefícios dos Padrões de Projetos

-   Os padrões de projeto são um kit de ferramentas para  **soluções tentadas e testadas**  para problemas comuns em projeto de software. Mesmo que você nunca tenha encontrado esses problemas, saber sobre os padrões é ainda muito útil porque eles ensinam como resolver vários problemas usando princípios de projeto orientado a objetos.
-   Os padrões de projeto definem uma linguagem comum que você e seus colegas podem usar para se comunicar mais eficientemente. Você pode dizer, “Oh, é só usar um Singleton para isso,” e todo mundo vai entender a ideia por trás da sua sugestão. Não é preciso explicar o que um singleton é se você conhece o padrão e seu nome.

## Classificação dos padrões

Padrões de projeto diferem por sua complexidade, nível de detalhes, e escala de aplicabilidade ao sistema inteiro sendo desenvolvido. Além disso, todos os padrões podem ser categorizados por seu propósito, ou intenção, os três grupos principais de padrões são:

-   Os  **padrões criacionais**  fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização de código.
-   Os  **padrões estruturais**  explicam como montar objetos e classes em estruturas maiores, enquanto ainda mantém as estruturas flexíveis e eficientes.
-   Os  **padrões comportamentais**  cuidam da comunicação eficiente e da assinalação de responsabilidades entre objetos.

----

<details>
  <summary>Padrões criacionais</summary>
  
  # Factory Method
  
  O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.
  
  ![](https://refactoring.guru/images/patterns/content/factory-method/factory-method-pt-br-2x.png#gh-light-mode-only)

  ## Problema / Motivação

  Imagine que você está criando uma aplicação de gerenciamento de logística. A primeira versão da sua aplicação pode lidar apenas com o transporte de caminhões, portanto a maior parte do seu código fica dentro da classe Caminhão.

Depois de um tempo, sua aplicação se torna bastante popular. Todos os dias você recebe dezenas de solicitações de empresas de transporte marítimo para incorporar a logística marítima na aplicação.
  
  ![](https://refactoring.guru/images/patterns/diagrams/factory-method/problem1-pt-br-2x.png#gh-light-mode-only)
  
  Boa notícia, certo? Mas e o código? Atualmente, a maior parte do seu código é acoplada à classe **Caminhão**. Adicionar **Navio** à aplicação exigiria alterações em toda a base de código. Além disso, se mais tarde você decidir adicionar outro tipo de transporte à aplicação, provavelmente precisará fazer todas essas alterações novamente.

Como resultado, você terá um código bastante sujo, repleto de condicionais que alteram o comportamento da aplicação, dependendo da classe de objetos de transporte.

  ## Solução

  O padrão Factory Method sugere que você substitua chamadas diretas de construção de objetos por chamadas para um método **fábrica** especial, os objetos retornados desse método  geralmente são chamados de **produtos**.
  Com isso, podemos sobrescrever o método fábrica em uma subclasse e alterar a classe de produtos que estão sendo criados pelo método. Porém, há uma pequena limitação: as subclasses só podem retornar tipos diferentes de produtos se esses produtos tiverem uma classe ou interface base em comum. Além disso, o método fábrica na classe base deve ter seu tipo de retorno declarado como essa interface.

  ![](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)

  O código que usa o método fábrica (geralmente chamado de código cliente) não vê diferença entre os produtos reais retornados por várias subclasses. O cliente trata todos os produtos como um Transporte abstrato. O cliente sabe que todos os objetos de transporte devem ter o método entregar, mas como exatamente ele funciona não é importante para o cliente.

  ## Quando devemos aplicar?

  - O Factory Method deve ser usado quando não se sabe a priori os tipos e dependências exatas dos objetos com os quais seu código deve funcionar.

  - Também é indicado usar o Factory Method quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.

  - Busca de uma melhor qualidade de código. 
  
</details>

<details>
  <summary>Padrões estruturais</summary>

  # Adapter
  O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si. Ou seja, como o nome propõe o Adapter ele funciona como um adaptador.

  ![](https://refactoring.guru/images/patterns/content/adapter/adapter-pt-br.png?id=05f144d30c63000fbe59e09f29bb488d)

  ## Problema / Motivação

  Problema

  ## Solução

  Ele é um objeto especial que converte a interface de um objeto para que outro objeto possa entendê-lo.

  1) O adaptador obtém uma interface, compatível com um dos objetos existentes.
  2) Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.
  3) Ao receber a chamada, o adaptador passa o pedido para o segundo objeto, mas em um formato e ordem que o segundo objeto espera.

  ![](https://refactoring.guru/images/patterns/diagrams/adapter/solution-pt-br.png?id=ffe986cb8e979f54610072f35928d04e)

  Exemplo para compreender melhor o Adapter

  ![](https://refactoring.guru/images/patterns/content/adapter/adapter-comic-1-pt-br.png?id=a33f9306db5a3932525827fe93a9676a)

  ## Quando devemos aplicar?
  quando?

  - Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.

  ## Prós e Contras
  Prós
  - Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do negócio do programa.
  - Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem com os adaptadores através da interface cliente.
  
  Contras
  - A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.
</details>

<details>
  <summary>Padrões comportamentais</summary>
  
</details>


### Referências:

- https://refactoring.guru/pt-br/design-patterns
