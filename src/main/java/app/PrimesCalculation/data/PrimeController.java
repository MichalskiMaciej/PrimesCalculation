package app.PrimesCalculation.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primes")
public class PrimeController {
    private final PrimeService primeService;

    public PrimeController(PrimeService primeService) {
        this.primeService = primeService;
    }

    @GetMapping()
    public int test(@RequestParam int start,
                    @RequestParam int end) {
        return primeService.primeCalculations(start, end);
    }
}
