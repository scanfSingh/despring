package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World\n";
    }

    @RequestMapping("/getTree")
    public List<String> getTree() {
        List<String> tree = new ArrayList<>();
        tree.add("Hello");
        tree.add("World");
        tree.add("!");
        return tree;
    }
    
}
