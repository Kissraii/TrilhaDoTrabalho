package br.com.trilhadotrabalho.model;

import java.util.List;

public final class QuizModels {
    private QuizModels() {}

    public record Question(Long id, String prompt, List<String> options, int correctOption, String explanation) {}
    public record Module(Long id, String title, String subtitle, String icon, String color, int points, List<Question> questions) {}
}

