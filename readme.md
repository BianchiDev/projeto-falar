# API Comunicação

API para gerenciamento de comunicação entre `Responsavel` e `Acessorado`.

## Índice

- [Sobre](#sobre)
- [Requisitos](#requisitos)
- [Configuração](#configuração)
- [Estrutura da API](#estrutura-da-api)
- [Endpoints](#endpoints)
  - [Responsável](#responsável)
  - [Acessorado](#acessorado)
- [Exemplos de Requisições](#exemplos-de-requisições)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Licença](#licença)

---

## Sobre

A API **comunicacao** foi criada para gerenciar a comunicação entre `Responsavel` e `Acessorado`. Nela, cada `Acessorado` está associado a apenas um `Responsavel`, mas cada `Responsavel` pode ter um ou mais `Acessorados`.

## Requisitos

- Java 17
- Spring Boot 3.4.0
- PostgreSQL
- Docker (opcional)
- Maven

## Configuração

1. Clone este repositório:
   ```bash
   git clone https://github.com/usuario/comunicacao-api.git
   cd comunicacao-api
