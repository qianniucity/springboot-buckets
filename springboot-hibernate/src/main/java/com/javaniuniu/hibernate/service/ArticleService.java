package com.javaniuniu.hibernate.service;

import com.javaniuniu.hibernate.dao.IArticleDAO;
import com.javaniuniu.hibernate.model.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/4 9:29 PM
 */
@Service
public class ArticleService {
    @Resource
    private IArticleDAO articleDAO;

    public Article getArticleById(int articleId) {
        Article obj = articleDAO.getArticleById(articleId);
        return obj;
    }

    public List<Article> getAllArticles() {
        return articleDAO.getAllArticles();
    }

    public synchronized boolean addArticle(Article article) {
        if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
            return false;
        } else {
            articleDAO.addArticle(article);
            return true;
        }
    }

    public void updateArticle(Article article) {
        articleDAO.updateArticle(article);
    }

    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}
