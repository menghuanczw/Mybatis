package my.controller;

import io.swagger.annotations.ApiOperation;
import my.entity.Address;
import my.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class MyController {

    private final static Logger logger = LoggerFactory.getLogger(MyController.class);
    @Autowired
    private AddressService addressService;

    @ApiOperation(value="返回字符串，没有参数！")
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String get(){
        logger.info("开始写入数据");
        Address a = new Address();
        a.setId("11");
        a.setCity("上海");
        a.setHouseAddress("浦江东旭公寓");
        a.setStartDate(new Date());
        addressService.insert(a);
        return a.toString();
    }
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Address> getAll(String id){
        logger.info("开始查询数据");
        return  addressService.selectAllAddress();
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Address> list(){
        logger.info("开始查询list数据");
        return  addressService.queryList();
    }
}
