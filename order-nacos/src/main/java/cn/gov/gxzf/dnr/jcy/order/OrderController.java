package cn.gov.gxzf.dnr.jcy.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功。");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "Hello World :" + msg;
    }

}
