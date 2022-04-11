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


  ## Quando devemos aplicar?
  
</details>

<details>
  <summary>Padrões estruturais</summary>
  
</details>

<details>
  <summary>Padrões comportamentais</summary>
  
</details>


### Referências:

- https://refactoring.guru/pt-br/design-patterns
