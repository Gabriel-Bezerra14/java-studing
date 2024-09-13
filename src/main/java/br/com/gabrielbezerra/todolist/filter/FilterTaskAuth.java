package br.com.gabrielbezerra.todolist.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //Pegar a autenticação (usuario e password)
        var autorization = request.getHeader("Autorization");
        var user_password = autorization.substring("Basic ".length()).trim();
        Base64.getDecoder().decode(user_password);

        System.out.println("Autorization");
        System.out.println(autorization);


        // Validar usuario

        // Validar Senha

        // Segue viagem
        filterChain.doFilter(request, response);
    }
}

