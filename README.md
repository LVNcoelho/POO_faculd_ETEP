# Escola XYZ - Sistema de Gestão Acadêmica (Módulo de Matrículas)

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Module](https://img.shields.io/badge/Module-Core%20Registration-blue.svg)]()
[![Status](https://img.shields.io/badge/Status-In%20Development-green.svg)]()

## 📌 Visão Geral do Projeto

O **Sistema de Gestão Acadêmica da Escola XYZ** é uma iniciativa de modernização e digitalização dos fluxos operacionais da instituição. Este módulo é focado na automação do setor de matrículas e secretaria, substituindo os formulários em papel por estruturas de dados persistentes e rotinas digitais.

Esta entrega contempla a implementação da **entidade de domínio de alunos** e a validação do ciclo de instanciação e mapeamento dos atributos do formulário cadastral.

---

## 🎯 Objetivos da Task

- **Digitalização de Processos:** Eliminação gradual dos formulários impressos no atendimento presencial da secretaria.
- **Padronização do Domínio:** Mapeamento uniforme dos dados cadastrais essenciais dos alunos.
- **Preparação de Arquitetura:** Estruturação das entidades do sistema seguindo os padrões de Orientação a Objetos (POO) para suporte futuro a persistência em banco de dados e APIs RESTful.

---

## 🛠️ Tecnologias e Arquitetura

- **Linguagem:** Java (JDK 17+)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Estrutura de Modelagem:** Domain Data Model

---

## 📂 Arquitetura de Arquivos

```text
.
├── Aluno.java         # Entidade do domínio (Model) contendo os atributos do cadastro
├── Principal.java     # Classe utilitária para teste de carga e validação
└── README.md          # Documentação técnica do repositório
