package br.com.trilhadotrabalho.service;

import br.com.trilhadotrabalho.model.QuizModels.Module;
import br.com.trilhadotrabalho.model.QuizModels.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    public List<Module> findAll() {
        return List.of(
            new Module(1L, "Mapa das oportunidades", "Aprenda onde encontrar vagas de verdade", "🗺️", "sun", 120,
                List.of(new Question(101L, "Qual é uma boa prática ao pesquisar uma vaga?", List.of("Enviar dinheiro para participar", "Conferir a empresa e os requisitos", "Compartilhar sua senha"), 1, "Pesquisar a empresa e ler os requisitos ajuda a evitar golpes e candidaturas fora do perfil."))),
            new Module(2L, "Detetive dos golpes", "Identifique sinais de alerta em anúncios", "🕵🏽", "coral", 150,
                List.of(new Question(201L, "Qual sinal merece atenção?", List.of("Descrição clara da função", "Contato oficial da empresa", "Pedido de pagamento para ser contratado"), 2, "Empregadores sérios não cobram para oferecer uma vaga."))),
            new Module(3L, "Currículo turbo", "Monte um currículo simples e objetivo", "🚀", "teal", 180,
                List.of(new Question(301L, "O que deve aparecer primeiro no currículo?", List.of("Objetivo ou resumo profissional", "Senha do e-mail", "Uma foto de documento"), 0, "Um resumo curto ajuda a pessoa recrutadora a entender seu perfil rapidamente."))),
            new Module(4L, "Mensagem que abre portas", "Pratique contatos profissionais com respeito", "💬", "purple", 160,
                List.of(new Question(401L, "Como iniciar uma mensagem profissional?", List.of("Olá, tudo bem? Vi a vaga de...", "Me contrate agora!!!", "Envio meus dados bancários"), 0, "Uma saudação educada e o contexto da vaga tornam a mensagem clara e profissional."))),
            new Module(5L, "Entrevista sem medo", "Treine respostas e prepare suas perguntas", "🎤", "blue", 200,
                List.of(new Question(501L, "Como se preparar para uma entrevista?", List.of("Pesquisar a empresa e revisar experiências", "Chegar sem saber qual é a vaga", "Inventar experiências"), 0, "Conhecer a empresa e conectar suas experiências à vaga aumenta sua segurança.")))
        );
    }
}

