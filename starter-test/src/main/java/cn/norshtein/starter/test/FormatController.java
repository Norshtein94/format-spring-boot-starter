package cn.norshtein.starter.test;

import cn.norshtein.format.starter.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Norshtein
 */
@RestController
@RequestMapping("/format")
public class FormatController {
    @Autowired
    private FormatTemplate formatTemplate;

    @RequestMapping("/process")
    public String process(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("norshtein");
        userInfo.setAge(18);
        return formatTemplate.doFormat(userInfo);
    }
}