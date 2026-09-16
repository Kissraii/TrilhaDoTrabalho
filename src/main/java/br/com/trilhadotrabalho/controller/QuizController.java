package br.com.trilhadotrabalho.controller;

import br.com.trilhadotrabalho.model.QuizModels.Module;
import br.com.trilhadotrabalho.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/modules")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Module> listModules() {
        return quizService.findAll();
    }
}

