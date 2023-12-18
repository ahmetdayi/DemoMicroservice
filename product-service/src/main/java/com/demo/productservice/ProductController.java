package com.demo.productservice;

//import com.demo.client.categoryclient.CategoryClient;
//import com.demo.client.categoryclient.CategoryResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

//    private final KafkaTemplate<String,String> kafkaTemplate;

    @Value("${a}")
    private String a;

//    public ProductController(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//    private final CategoryClient categoryClient;

//    public ProductController(CategoryClient categoryClient) {
//        this.categoryClient = categoryClient;
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<CategoryResponse> findById(@PathVariable("id") String id){
//        return new ResponseEntity<>(categoryClient.findById(id), HttpStatus.OK);
//    }

    @GetMapping()
    public String findById(){

//        kafkaTemplate.send("notification",a);

        return a;
    }
}
