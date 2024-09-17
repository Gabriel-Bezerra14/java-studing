package br.com.gabrielbezerra.todolist.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //Pegar a autenticação (usuario e senha)

        var authorization = request.getHeader("Authorization");

        var authEncoded = authorization.substring("Basic".length()).trim();

        byte[] authDecode = Base64.getDecoder().decode(authEncoded);

        var authString = new String(authDecode);


        //["ligeirinho14x", "12345"]
        String[] credentials = authString.split(":");
        String username = credentials[0];
        String password = credentials[1];

        System.out.println("Authorization");
        System.out.println(username);
        System.out.println(password);



        //Validar usuario

        //Validar a senha

        //Segue viagem
        filterChain.doFilter(request, response);
    }
}

