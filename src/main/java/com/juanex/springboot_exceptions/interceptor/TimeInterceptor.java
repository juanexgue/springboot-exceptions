package com.juanex.springboot_exceptions.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "inicio";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        long TiempoInicio = System.currentTimeMillis();
        request.setAttribute(START_TIME, TiempoInicio);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {
        long TiempoInicio = (long) request.getAttribute(START_TIME);
        long TiempoFin = System.currentTimeMillis() - TiempoInicio;
        System.out.println("Tiempo de ejecución: " + TiempoFin + " milisegundos para URL " + request.getRequestURI());
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

}
