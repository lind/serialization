package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller()
public class MyController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<String> index() {
        return HttpResponse.ok("Hello World!");
    }

    @Get(uri="/rec", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<MainRecord> record() {
        return HttpResponse.ok(new MainRecord("Name", 29, new Adr("street", "Ukraine", 123)));
    }

}
