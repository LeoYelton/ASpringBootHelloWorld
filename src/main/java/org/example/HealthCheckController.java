<HealthCheckController.java>
<![CDATA[
package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

private final TradingProgram tradingProgram;

public HealthCheckController(TradingProgram tradingProgram) {
this.tradingProgram = tradingProgram;
}

@GetMapping("/health")
public ResponseEntity<String> healthCheck() {
if (tradingProgram.isHealthy()) {
return new ResponseEntity<>("Healthy", HttpStatus.OK);
} else {
return new ResponseEntity<>("Unhealthy", HttpStatus.INTERNAL_SERVER_ERROR);
}
}
}
]]>
</HealthCheckController.java>
