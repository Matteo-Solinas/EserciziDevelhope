package com.exercise.InterceptorMiddleware02.interceptors;

import com.exercise.InterceptorMiddleware02.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    private List<Month> getMonths() {

        List<Month> monthList = new ArrayList<>(Arrays.asList(
                new Month(3, "March", "Marzo", "März"),
                new Month(4, "April", "Aprile", "April"),
                new Month(5, "May", "Maggio", "Mai"),
                new Month(6, "June", "Giugno", "Juni"),
                new Month(11, "November", "Novembre", "November"),
                new Month(12, "December", "Dicembre", "Dezember")
        ));

        return monthList;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String monthNumberHeader = request.getHeader("monthNumber");

        if (monthNumberHeader == null || monthNumberHeader.isEmpty()) {
            response.setStatus(400);
            return false;
        } else {
            int monthNumber = Integer.parseInt(monthNumberHeader);
            Month monthFound = getMonths().stream().filter(month -> month.getMonthNumber() == monthNumber)
                    .findFirst()
                    .orElse(new Month(monthNumber, "nope", "nope", "nope"));

            request.setAttribute("monthAttribute", monthFound);
            return true;
        }

    }

}
