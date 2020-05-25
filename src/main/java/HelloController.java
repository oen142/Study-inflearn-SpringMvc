import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public @ResponseBody String hello() {
        return "hello ," + helloService.getName();

    }
    @GetMapping("/sample")
    public String sample(){
        return "/WEB-INF/spmle.jsp";
    }
}
