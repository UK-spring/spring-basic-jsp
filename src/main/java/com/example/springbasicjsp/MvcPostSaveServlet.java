package com.example.springbasicjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "mvcPostSaveServlet",
        urlPatterns = "/mvc/posts/save"
)
public class MvcPostSaveServlet extends HttpServlet {

    // Singleton
    private PostRepository postRepository = PostRepository.getInstance();

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Post post = new Post(title, content);
        postRepository.save(post);

        // Model에 Data를 보관한다.
        // request 내부 임시 저장소에 post저장
        request.setAttribute("post", post); // MODEL

        String path = "/WEB-INF/views/save-result.jsp";
        RequestDispatcher disPatcher = request.getRequestDispatcher(path);
        disPatcher.forward(request, response);

    }
}
