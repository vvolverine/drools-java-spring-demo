package dev.wolverine.flowable.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.wolverine.flowable.demo.service.ArticleWorkflowService;
import dev.wolverine.flowable.demo.domain.Article;
import dev.wolverine.flowable.demo.domain.Approval;

@RestController
public class ArticleWorkflowController {

    private final ArticleWorkflowService articleWorkflowService;

    @Autowired
    public ArticleWorkflowController(ArticleWorkflowService articleWorkflowService) {
        this.articleWorkflowService = articleWorkflowService;
    }

    @PostMapping("/submit")
    public void submit(@RequestBody Article article) {
        articleWorkflowService.startProcess(article);
    }

    @GetMapping("/tasks")
    public List<Article> getTasks(@RequestParam String assignee) {
        return articleWorkflowService.getTasks(assignee);
    }

    @PostMapping("/review")
    public void review(@RequestBody Approval approval) {
        articleWorkflowService.submitReview(approval);
    }
}
