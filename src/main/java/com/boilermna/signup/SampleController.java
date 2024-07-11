package com.boilermna.signup;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    CustomerRepository repo;

    public SampleController(CustomerRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/test")
    public String postCustomer(@RequestBody Customer newCustomer) {

        repo.save(newCustomer);

        return "done";
    }
}
