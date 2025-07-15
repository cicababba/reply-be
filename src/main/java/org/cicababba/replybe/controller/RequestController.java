package org.cicababba.replybe.controller;

import org.cicababba.replybe.model.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestController {

    @GetMapping("/request")
    public List<Request>  getRequests() {
        List<Request> requests = new ArrayList<Request>();
        requests.add(new Request("Titolo", "Descrizione", new Date()));
        return requests;
    }
}
