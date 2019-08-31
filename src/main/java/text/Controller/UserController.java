package text.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import text.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/*
 *@autho  zhengruilong
 *@date 2019-08-31
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservices;

    //登陆找用户名
    @ResponseBody
    @RequestMapping(value = "/registname" , method= RequestMethod.GET)
    public void findName(@RequestParam String username, ModelMap map){
        System.out.println(username);
        int bool=userservices.registfindByName(username);
        if(bool==1){
            map.addAttribute("date","true");
        }else{
            map.addAttribute("date","false");
        }

    }
}
