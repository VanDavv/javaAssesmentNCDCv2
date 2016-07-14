package vandavv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAssesmentApplication {

    private static final Logger LOG = LoggerFactory.getLogger(JavaAssesmentApplication.class);

	public static void main(String[] args) {
        LOG.debug("Starting application");
        SpringApplication.run(JavaAssesmentApplication.class, args);
        LOG.debug("Application started");
    }
}
