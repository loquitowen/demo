package cn.gov.gxzf.dnr.jcy.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣除库存");
        return "库存扣除成功:" + port;
    }

}
