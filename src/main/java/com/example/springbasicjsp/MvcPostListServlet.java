package com.example.springbasicjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "mvcPostListServlet",
        urlPatterns = "/mvc/posts/list"
)
public class MvcPostListServlet extends HttpServlet {

    private PostRepository postRepository = PostRepository.getInstance();

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        // 회원 목록 조회
        List<Post> posts = postRepository.findAll();

        // request 객체의 임시저장소 Model에 posts를 저장
        request.setAttribute("posts", posts);

        String path = "/WEB-INF/views/posts.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }
}
