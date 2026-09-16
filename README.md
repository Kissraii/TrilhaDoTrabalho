# Trilha do Trabalho

Projeto educativo com **Java + Spring Boot** e frontend HTML otimizado com **Gulp**.

## Trilhas

1. Mapa das oportunidades
2. Detetive dos golpes
3. Currículo turbo
4. Mensagem que abre portas
5. Entrevista sem medo

## Estrutura

- `src/main/java/` — backend Java Spring Boot.
- `src/main/resources/static/index.html` — página servida pelo Spring Boot.
- `web/index.html` — fonte do frontend para a Vercel.
- `gulpfile.js` — limpa e gera a pasta `dist`.
- `dist/` — versão final otimizada para publicação.
- `package.json` — comandos do frontend.

## Rodar com Java

Requisitos: Java 17 ou superior e Maven.

```bash
mvn spring-boot:run
```

Acesse <http://localhost:8080>.

## Gerar a pasta dist

Requisitos: Node.js e npm.

```bash
npm install
npm run build
```

O arquivo final será:

```text
dist/index.html
```

Para testar a versão gerada localmente:

```bash
npx serve dist
```

## Publicar na Vercel

Conecte o repositório do GitHub e use:

```text
Build Command: npm run build
Output Directory: dist
Install Command: npm install
```

O arquivo `vercel.json` já contém essas configurações. A Vercel publica somente o conteúdo de `dist`, evitando enviar `target` e `node_modules`.

A Vercel executa apenas o frontend. Para executar a API Java `/api/modules`, publique o Spring Boot em Render, Railway ou outro serviço Java.
