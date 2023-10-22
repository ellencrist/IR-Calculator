# Calculadora de Imposto de Renda em Java

Este é um projeto Java que implementa uma simples Calculadora de Imposto de Renda (IR) com uma interface gráfica. Ele permite calcular o valor do Imposto de Renda com base em um valor de contrato e uma alíquota selecionada. Aqui estão as informações sobre como usar e compilar o projeto.

## Pré-requisitos

Para executar este projeto, você precisará ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em seu sistema.

## Como compilar e executar

1. Clone este repositório em sua máquina:

   ```shell
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Navegue até a pasta do projeto:

   ```shell
   cd seu-repositorio
   ```

3. Compile o código-fonte:

   ```shell
   javac CalculadoraIR.java
   ```

4. Execute o programa:

   ```shell
   java CalculadoraIR
   ```

## Executando o Arquivo JAR

Certifique-se de que você possui o Java Runtime Environment (JRE) instalado em seu sistema.

Baixe o arquivo JAR executável a partir do repositório.

Abra um terminal ou prompt de comando.

Navegue até a pasta onde você baixou o arquivo JAR.

Execute o arquivo JAR com o seguinte comando:

shell
Copy code
java -jar nome-do-arquivo.jar
O programa será iniciado e você poderá usar a Calculadora de Imposto de Renda da mesma forma que ao compilar o código-fonte.

Lembre-se de que o arquivo JAR deve estar na mesma pasta que os arquivos de recursos necessários (se houver algum) para o correto funcionamento do programa.

## Funcionalidades

- **Valor do Contrato**: Insira o valor do contrato na caixa de texto.
- **Alíquota**: Escolha uma das alíquotas disponíveis (15% ou 17%) na lista suspensa.
- **Calcular**: Clique no botão "Calcular" para calcular o Imposto de Renda com base nos valores inseridos. O resultado será exibido na caixa de texto "Resultado".
- **Resetar**: Clique no botão "Resetar" para limpar os campos de valor do contrato e resultado.

## Notas

- O campo de valor do contrato permite a entrada de números com ou sem vírgulas. As vírgulas serão removidas para cálculos adequados.
- O resultado é exibido com duas casas decimais.
