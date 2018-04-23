import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("swole")
public class RepController{
    @RequestMapping(value="workout", method= RequestMethod.POST)
}