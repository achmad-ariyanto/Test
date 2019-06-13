package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping()
    public Output test() {
        Output output = new Output();
        output.setText("kata - kata - kata - kata");
        output.setText2("test deploy");
        output.setNumber(553333);
        return output;
    }

    @Getter
    @Setter
    class Output {
        String text;
        String text2;
        Integer number;
    }
}
