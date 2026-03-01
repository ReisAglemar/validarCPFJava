# 🪪 Validador de CPF – Java (Console)

Aplicação desenvolvida em Java para validação de CPF utilizando o algoritmo oficial de cálculo dos dígitos verificadores.

O projeto implementa toda a lógica manualmente, sem uso de bibliotecas externas, com foco em manipulação de arrays, controle de fluxo e validação de entrada.

---

## 🎯 Objetivo

- Implementar validação de CPF do zero
- Trabalhar com manipulação de `String`
- Converter dados para vetor de inteiros
- Aplicar lógica matemática dos dígitos verificadores
- Praticar controle de fluxo e validação de entrada

---

## 🧠 Conceitos Aplicados

- Programação estruturada
- Uso de arrays (`int[]`)
- Conversão de `String` para `int`
- Laços `for`
- Operadores aritméticos e módulo (`%`)
- Controle condicional (`if / else`)
- Validação de dados inválidos
- Uso de `Scanner` para entrada do usuário

---

## 🔍 Regras de Validação Implementadas

O sistema verifica:

- Se o CPF possui exatamente 11 dígitos
- Se todos os dígitos não são iguais (ex: 00000000000)
- Cálculo do primeiro dígito verificador
- Cálculo do segundo dígito verificador
- Comparação com os dígitos informados

Caso haja inconsistência, o sistema exibe logs detalhados indicando:

- Qual dígito verificador falhou
- Qual era o valor esperado
- Qual foi o valor informado

---

## ⚙️ Funcionamento

1. O usuário informa o CPF (somente números)
2. O sistema valida formato e repetição de dígitos
3. Converte o CPF para vetor de inteiros
4. Calcula o primeiro dígito verificador
5. Calcula o segundo dígito verificador
6. Retorna:
   - CPF válido
   - CPF inválido (com log de erro)

---

## 🧮 Algoritmo Utilizado

- Multiplicação decrescente (10 → 2) para o primeiro dígito
- Multiplicação decrescente (11 → 2) para o segundo dígito
- Soma dos resultados
- Aplicação de módulo 11
- Comparação com os dígitos verificadores informados

---

## ▶ Como Executar

Compile:

javac com/mycompany/validarcpf/ValidarCPF.java

Execute:

java com.mycompany.validarcpf.ValidarCPF

---

## 📌 Diferencial do Projeto

- Implementação manual da lógica
- Exibição de logs explicativos para falhas
- Validação preventiva de CPFs inválidos conhecidos
- Uso direto de matemática aplicada

---

## 🚀 Possíveis Melhorias

- Separação da lógica em métodos
- Criação de classe utilitária para validação
- Implementação de testes unitários
- Aceitar CPF formatado (com pontos e traço)
- Transformar em API REST

---
