package org.cicababba.replybe.controller;

import jakarta.servlet.http.HttpSession;
import org.cicababba.replybe.model.Request;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class RequestController {

    @GetMapping("/request")
    public List<Request>  getRequests(HttpSession session) {
        @SuppressWarnings("unchecked")
        List<Request> requests = (List<Request>) session.getAttribute("REQUESTS");
        if (requests == null) {
            requests = new ArrayList<>();
            session.setAttribute("REQUESTS", requests);
        }
        System.out.println(requests);
        return requests;
    }

    @PostMapping("/request")
    public Request newRequest(@RequestBody Request request, HttpSession session) {
        @SuppressWarnings("unchecked")
        List<Request> requests = (List<Request>) session.getAttribute("REQUESTS");
        if(Objects.isNull(requests)) {
            requests = new ArrayList<>();
        }
        request.setCreationDate(new Date());
        requests.add(request);
        session.setAttribute("REQUESTS", requests);
        System.out.println(requests);
        return request;
    }
}
