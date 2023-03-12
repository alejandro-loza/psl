import com.sspc.gob.mx.psl.GreetingController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class GreetingControllerSpec extends Specification {
    @Autowired (required = false)
    private GreetingController greetingController

    def "when context is loaded then all expected beans are created"() {
        expect: "the greetingController is created"
        greetingController
    }
}
