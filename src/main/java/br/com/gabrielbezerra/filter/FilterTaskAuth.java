package br.com.gabrielbezerra.filter;


import jakarta.servlet.*;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class FilterTaskAuth implements Filter{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("Chegou no filtro");
        chain.doFilter(request, response);

    }
}
